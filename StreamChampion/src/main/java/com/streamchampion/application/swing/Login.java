package com.streamchampion.application.swing;


import com.streamchampion.resources.httpRequest.PostHttpRequest;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.streamchampion.domain.Encrypt;

/**
 * @author Igor
 */
public class Login extends JFrame {
    private Point point = new Point();

    /**
     * Creates new form telaLogin
     */
    public Login() {
        initComponents();
        centralizarComponente();
        index = new Index();
        index.setVisible(false);
    }

    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        TextFieldName = new JTextFieldHint(new JTextField(), "user-icon", "Login");
        TextFieldPassword = new JPassWordFieldHint(new JPasswordField(), "padlock", "Senha");
        btnLogin = new javax.swing.JButton();
        forgotPassword = new javax.swing.JLabel();
        register = new javax.swing.JLabel(); //5
        account = new javax.swing.JLabel(); //2

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(530, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(45, 48, 53));
        mainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });

        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo-texto-deitado(FINO).png")));
        mainPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 60));

        TextFieldName.setBackground(new java.awt.Color(45, 48, 53));
        TextFieldName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TextFieldName.setForeground(new java.awt.Color(255, 51, 51));

        mainPanel.add(TextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 230, 30));

        TextFieldPassword.setBackground(new java.awt.Color(45, 48, 53));
        TextFieldPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TextFieldPassword.setForeground(new java.awt.Color(255,51,51));


        mainPanel.add(TextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 230, 30));

        btnLogin.setBackground(new java.awt.Color(245, 71, 71));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        mainPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 30));

        forgotPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(255, 0, 0));
        forgotPassword.setText("Esqueci minha senha");
        mainPanel.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        account.setFont(new java.awt.Font("Arial", 0, 12));
        account.setForeground(new java.awt.Color(204, 204, 204));
        account.setText("Não tem uma conta?");
        mainPanel.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        register.setFont(new java.awt.Font("Arial", 0, 12));
        register.setForeground(new java.awt.Color(255, 0, 0));
        register.setText("Cadastre-se");
        mainPanel.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 370));

        pack();
    }// </editor-fold>

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {
        btnLogin.setBackground(new Color(245, 81, 81));
    }

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {
        btnLogin.setBackground(new Color(245, 71, 71));
    }

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {
        point.x = evt.getX();
        point.y = evt.getY();        // TODO add your handling code here:
    }

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {
        Point p = this.getLocation();
        this.setLocation(p.x = evt.getX() - point.y, p.y = evt.getY() - point.y);// TODO add your handling code here:
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        Point p = this.getLocation();
        Login login = this;

        System.out.println(login.TextFieldName.getText() + login.TextFieldPassword.getText());
        final String password = new Encrypt().getSHA512(login.TextFieldPassword.getText());

        try {
            String url = "http://localhost:7000/login";
            String jsonInputString = "{\"login\": \"" + login.TextFieldName.getText()+"\", \"password\": \"" +
                    password + "\"}";

            int respondeCode = new PostHttpRequest().postHttpRequest(jsonInputString, url);

            if(respondeCode == 200){
                index.setVisible(true);
                index.setInformation();
            }

        }catch (Exception e){
            System.out.println(e);
        }


        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 6; i++) {
                        login.setLocation(p.x - 10, p.y);
                        sleep(20);
                        login.setLocation(p.x + 10, p.y);
                        sleep(20);
                    }
                    login.setLocation(p.x, p.y);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();


    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JTextField TextFieldPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel title; //substituir pelo png
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JPanel mainPanel;
    private Index index;
    private javax.swing.JLabel register;
    private javax.swing.JLabel account;
    // End of variables declaration
}



