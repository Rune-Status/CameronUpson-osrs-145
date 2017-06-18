package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class GameSocket implements Runnable {
    InputStream anInputStream1415;
    Class103 aClass103_1422;
    Socket base;
    boolean aBoolean1417 = false;
    Class108 aClass108_1420;
    OutputStream anOutputStream1424;
    byte[] aByteArray1423;
    int anInt1421 = 0;
    int anInt1419 = 0;
    boolean aBoolean1416 = false;

    public GameSocket(Socket socket, Class108 var2) throws IOException {
        this.aClass108_1420 = var2;
        this.base = socket;
        this.base.setSoTimeout(30000);
        this.base.setTcpNoDelay(true);
        this.base.setReceiveBufferSize(16384);
        this.base.setSendBufferSize(16384);
        this.anInputStream1415 = this.base.getInputStream();
        this.anOutputStream1424 = this.base.getOutputStream();
    }

    static CacheReferenceTable method887(int var0, boolean var1, boolean var2, boolean var3) {
        CacheIndex var4 = null;
        if (Class97.aClass93_1080 != null) {
            var4 = new CacheIndex(var0, Class97.aClass93_1080, Class21.aClass93Array141[var0], 1000000);
        }

        return new CacheReferenceTable(var4, BoundingBox.aCacheIndex373, var0, var1, var2, var3);
    }

    public void method882() {
        if (!this.aBoolean1417) {
            synchronized (this) {
                this.aBoolean1417 = true;
                this.notifyAll();
            }

            if (this.aClass103_1422 != null) {
                while (this.aClass103_1422.anInt1162 == 0) {
                    Class127.method875(1L);
                }

                if (this.aClass103_1422.anInt1162 == 1) {
                    try {
                        ((Thread) this.aClass103_1422.anObject1161).join();
                    } catch (InterruptedException var3) {
                    }
                }
            }

            this.aClass103_1422 = null;
        }
    }

    protected void finalize() {
        this.method882();
    }

    public int method886() throws IOException {
        return this.aBoolean1417 ? 0 : this.anInputStream1415.read();
    }

    public int method884() throws IOException {
        return this.aBoolean1417 ? 0 : this.anInputStream1415.available();
    }

    public void method883(byte[] var1, int var2, int var3) throws IOException {
        if (!this.aBoolean1417) {
            while (var3 > 0) {
                int var4 = this.anInputStream1415.read(var1, var2, var3);
                if (var4 <= 0) {
                    throw new EOFException();
                }

                var2 += var4;
                var3 -= var4;
            }

        }
    }

    public void run() {
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.anInt1421 == this.anInt1419) {
                        if (this.aBoolean1417) {
                            break;
                        }

                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }

                    var2 = this.anInt1421;
                    if (this.anInt1419 >= this.anInt1421) {
                        var3 = this.anInt1419 - this.anInt1421;
                    } else {
                        var3 = 5000 - this.anInt1421;
                    }
                }

                if (var3 > 0) {
                    try {
                        this.anOutputStream1424.write(this.aByteArray1423, var2, var3);
                    } catch (IOException var9) {
                        this.aBoolean1416 = true;
                    }

                    this.anInt1421 = (this.anInt1421 + var3) % 5000;

                    try {
                        if (this.anInt1421 == this.anInt1419) {
                            this.anOutputStream1424.flush();
                        }
                    } catch (IOException var8) {
                        this.aBoolean1416 = true;
                    }
                }
            }

            try {
                if (this.anInputStream1415 != null) {
                    this.anInputStream1415.close();
                }

                if (this.anOutputStream1424 != null) {
                    this.anOutputStream1424.close();
                }

                if (this.base != null) {
                    this.base.close();
                }
            } catch (IOException var7) {
            }

            this.aByteArray1423 = null;
        } catch (Exception var12) {
            Client.method332(null, var12);
        }

    }

    public void method885(byte[] var1, int var2, int var3) throws IOException {
        if (!this.aBoolean1417) {
            if (this.aBoolean1416) {
                this.aBoolean1416 = false;
                throw new IOException();
            }
            if (this.aByteArray1423 == null) {
                this.aByteArray1423 = new byte[5000];
            }

            synchronized (this) {
                for (int var5 = 0; var5 < var3; ++var5) {
                    this.aByteArray1423[this.anInt1419] = var1[var5 + var2];
                    this.anInt1419 = (this.anInt1419 + 1) % 5000;
                    if (this.anInt1419 == (this.anInt1421 + 4900) % 5000) {
                        throw new IOException();
                    }
                }

                if (this.aClass103_1422 == null) {
                    this.aClass103_1422 = this.aClass108_1420.method747(this, 3);
                }

                this.notifyAll();
            }
        }
    }
}
