import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class84_Sub1 extends Class84 {
    AudioFormat anAudioFormat331;
    SourceDataLine aSourceDataLine334;
    int anInt333;
    byte[] aByteArray332;

    protected void method277() {
        this.anAudioFormat331 = new AudioFormat((float) anInt870, 16, Class154.aBoolean1835 ? 2 : 1, true, false);
        this.aByteArray332 = new byte[256 << (Class154.aBoolean1835 ? 2 : 1)];
    }

    protected int method279() {
        return this.anInt333 - (this.aSourceDataLine334.available() >> (Class154.aBoolean1835 ? 2 : 1));
    }

    protected void method282(int var1) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.anAudioFormat331, var1 << (Class154.aBoolean1835 ? 2 : 1));
            this.aSourceDataLine334 = (SourceDataLine) AudioSystem.getLine(var2);
            this.aSourceDataLine334.open();
            this.aSourceDataLine334.start();
            this.anInt333 = var1;
        } catch (LineUnavailableException var3) {
            if (AnimationSkin.method745(var1) != 1) {
                this.method282(RS3CopyPastedNodeTable.nextPowerOf2(var1));
            } else {
                this.aSourceDataLine334 = null;
                throw var3;
            }
        }
    }

    protected void method280() {
        if (this.aSourceDataLine334 != null) {
            this.aSourceDataLine334.close();
            this.aSourceDataLine334 = null;
        }

    }

    protected void method281() {
        this.aSourceDataLine334.flush();
    }

    protected void method278() {
        int var1 = 256;
        if (Class154.aBoolean1835) {
            var1 <<= 1;
        }

        for (int var2 = 0; var2 < var1; ++var2) {
            int var3 = this.anIntArray853[var2];
            if ((var3 + 8388608 & -16777216) != 0) {
                var3 = 8388607 ^ var3 >> 31;
            }

            this.aByteArray332[var2 * 2] = (byte) (var3 >> 8);
            this.aByteArray332[var2 * 2 + 1] = (byte) (var3 >> 16);
        }

        this.aSourceDataLine334.write(this.aByteArray332, 0, var1 << 1);
    }
}
