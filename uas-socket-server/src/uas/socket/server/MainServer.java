package uas.socket.server;

/**
 *
 * @author Reza
 */
public class MainServer {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                SplashServer ss = new SplashServer();
                ss.setVisible(true);
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(40);
                        ss.loadingBar.setValue(i);
                        if (i == 100) {
                            ss.setVisible(false);
                            new Server().setVisible(true);
                        }
                    }
                } catch (Exception e) {
                }
            }
        };
        runnable.run();
    }
}
