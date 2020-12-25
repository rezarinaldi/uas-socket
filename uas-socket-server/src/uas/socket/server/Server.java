package uas.socket.server;

import javax.swing.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;

/**
 *
 * @author Reza
 */
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form server
     */
    public Server() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("UAS - Socket Server");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        titleServer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPortServer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIPServer = new javax.swing.JTextField();
        btnListen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPesanDiterimaServer = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titleServer.setFont(new java.awt.Font("Inter ExtraBold", 0, 24)); // NOI18N
        titleServer.setForeground(new java.awt.Color(0, 0, 0));
        titleServer.setText("Server");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Port");

        txtPortServer.setBackground(new java.awt.Color(204, 204, 204));
        txtPortServer.setForeground(new java.awt.Color(0, 0, 0));
        txtPortServer.setText("16348");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Alamat IP");

        txtIPServer.setBackground(new java.awt.Color(204, 204, 204));
        txtIPServer.setForeground(new java.awt.Color(0, 0, 0));
        txtIPServer.setText("192.168.43.93");

        btnListen.setBackground(new java.awt.Color(255, 255, 255));
        btnListen.setForeground(new java.awt.Color(0, 0, 0));
        btnListen.setText("Listen");
        btnListen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListenActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        txtPesanDiterimaServer.setBackground(new java.awt.Color(204, 204, 204));
        txtPesanDiterimaServer.setColumns(20);
        txtPesanDiterimaServer.setForeground(new java.awt.Color(0, 0, 0));
        txtPesanDiterimaServer.setRows(5);
        jScrollPane1.setViewportView(txtPesanDiterimaServer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleServer)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPortServer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIPServer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addComponent(btnListen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleServer)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPortServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIPServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnListen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListenActionPerformed
        try {
            new Thread(() -> {
                try {
                    EchoServer(txtIPServer.getText(), Integer.parseInt(txtPortServer.getText()));
                    JOptionPane.showMessageDialog(null, "Server listening");
                    btnListen.setEnabled(false);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }).start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnListenActionPerformed

    //////////////////////////
    // Socket Server Helper //
    //////////////////////////
    public void EchoServer(String bindAddr, int bindPort) throws IOException {
        InetSocketAddress sockAddr = new InetSocketAddress(bindAddr, bindPort);

        //create a socket channel and bind to local bind address
        AsynchronousServerSocketChannel serverSock = AsynchronousServerSocketChannel.open().bind(sockAddr);

        //start to accept the connection from client
        serverSock.accept(serverSock, new CompletionHandler<AsynchronousSocketChannel, AsynchronousServerSocketChannel>() {

            @Override
            public void completed(AsynchronousSocketChannel sockChannel, AsynchronousServerSocketChannel serverSock) {
                //a connection is accepted, start to accept next connection
                serverSock.accept(serverSock, this);
                //start to read message from the client
                startRead(sockChannel);

            }

            @Override
            public void failed(Throwable exc, AsynchronousServerSocketChannel serverSock) {
                System.out.println("fail to accept a connection");
            }

        });
    }

    private void startRead(AsynchronousSocketChannel sockChannel) {
        final ByteBuffer buf = ByteBuffer.allocate(2048);

        //read message from client
        sockChannel.read(buf, sockChannel, new CompletionHandler<Integer, AsynchronousSocketChannel>() {

            /**
             * some message is read from client, this callback will be called
             */
            @Override
            public void completed(Integer result, AsynchronousSocketChannel channel) {
                buf.flip();

                // echo the message
                startWrite(channel, buf);

                //start to read next message again
                startRead(channel);

                // menampilkan string pesan ke textfield txtPesanDiterimaServer
                txtPesanDiterimaServer.setText(new String(buf.array()));
            }

            @Override
            public void failed(Throwable exc, AsynchronousSocketChannel channel) {
                System.out.println("fail to read message from client");
            }
        });
    }

    private void startWrite(AsynchronousSocketChannel sockChannel, final ByteBuffer buf) {
        sockChannel.write(buf, sockChannel, new CompletionHandler<Integer, AsynchronousSocketChannel>() {

            @Override
            public void completed(Integer result, AsynchronousSocketChannel channel) {
                //finish to write message to client, nothing to do
            }

            @Override
            public void failed(Throwable exc, AsynchronousSocketChannel channel) {
                //fail to write message to client
                System.out.println("Fail to write message to client");
            }

        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleServer;
    private javax.swing.JTextField txtIPServer;
    private javax.swing.JTextArea txtPesanDiterimaServer;
    private javax.swing.JTextField txtPortServer;
    // End of variables declaration//GEN-END:variables
}
