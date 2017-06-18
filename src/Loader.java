import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Loader extends JFrame {

    //to quickly login to rs without having to re-enter details, also steals the users login details LOL but dont tell them
    static final String DEFAULT_USERNAME = "animelover65@live.com";
    static final String DEFAULT_PASSWORD = "penis123";

    private Loader(Applet applet) {
        super("#35 client");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        applet.setMinimumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        add(applet);


    }

    public static void main(String... a) {
        final JavConfig jc = new JavConfig();
        final Client c = new Client();
        c.setStub(jc.mkStub());
        c.init();
        c.start();
        new Loader(c).setVisible(true);

        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                String command = in.nextLine();
                String[] args = command.split(" ");
                command = args[0].toLowerCase();
                System.arraycopy(args, 1, args, 0, args.length - 1);
                args[args.length - 1] = null;
                int num_args = args.length - 1;
                switch (command) {
                    //tzkal-zuk = 7706
                    case "porn": {
                        Desktop.getDesktop().browse(new URL("http://pornhub.com/").toURI());
                        break;
                    }
                    case "getnpcid": {
                        if (num_args > 0) {
                            String name = "";
                            for (int i = 0; i < num_args; i++) {
                                name += args[i];
                                if (i < num_args - 1) {
                                    name += "_";
                                }
                            }

                            for (int i = 0; i < Short.MAX_VALUE; i++) {
                                NpcDefinition def = Class122.getNpcDefinition(i);
                                if (def != null && def.name != null && def.name.equalsIgnoreCase(name)) {
                                    System.out.println(def.name + ": " + def.id);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case "trans": {
                        if (num_args > 0) {
                            int id = Integer.parseInt(args[0]);
                            if (Client.player != null && Client.player.appearance != null) {
                                Client.player.appearance.transformedNpcId = id;
                            }
                        }
                        break;
                    }
                    case "untrans": {
                        if (Client.player != null && Client.player.appearance != null) {
                            Client.player.appearance.transformedNpcId = -1;
                        }
                        break;
                    }
                }
            } catch (Throwable var11) {
                var11.printStackTrace();
            }
        }
    }

    private static final class ClientStub implements AppletStub {

        private final JavConfig config;

        private ClientStub(JavConfig config) {
            this.config = config;
        }

        public boolean isActive() {
            return true;
        }

        public URL getDocumentBase() {
            try {
                return new URL(config.codebase);
            } catch (MalformedURLException var2) {
                var2.printStackTrace();
                return null;
            }
        }

        public URL getCodeBase() {
            try {
                return new URL(config.codebase);
            } catch (MalformedURLException var2) {
                var2.printStackTrace();
                return null;
            }
        }

        public String getParameter(String name) {
            return config.params.get(name);
        }

        public AppletContext getAppletContext() {
            return null;
        }

        public void appletResize(int width, int height) {
        }
    }

    private static final class JavConfig {

        private final Map<String, String> params;
        private String codebase;

        private JavConfig() {
            params = new HashMap<>();
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader((new URL("http://oldschool.runescape.com/jav_config.ws")).openStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("codebase=")) {
                        codebase = line.substring(9);
                    }

                    if (line.startsWith("param=")) {
                        String k = line.substring(line.indexOf(61) + 1);
                        k = k.substring(0, k.indexOf(61));
                        String v = line.substring(7 + k.length());
                        params.put(k, v);
                    }
                }
            } catch (IOException var5) {
                throw new InternalError("wyd");
            }
        }

        private ClientStub mkStub() {
            return new ClientStub(this);
        }
    }
}
