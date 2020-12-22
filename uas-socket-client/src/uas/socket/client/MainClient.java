package uas.socket.client;

/**
 *
 * @author Reza
 */
public class MainClient {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                SplashClient sc = new SplashClient();
                sc.setVisible(true);
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(40);
                        sc.loadingBar.setValue(i);
                        if (i == 100) {
                            sc.setVisible(false);
                            new Client().setVisible(true);
                        }
                    }
                } catch (Exception e) {
                }
            }
        };
        runnable.run();
    }
}
