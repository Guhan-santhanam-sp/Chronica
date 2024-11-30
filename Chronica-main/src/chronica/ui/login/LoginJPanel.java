/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.login;

import chronica.model.business.User.User;
import chronica.model.business.User.UserDirectory;
import chronica.model.business.role.RoleDirectory;
import chronica.model.config.ReadProp;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Gooqe
 */
public class LoginJPanel extends javax.swing.JPanel {

    JPanel PanelContainer;
    RoleDirectory roleDirectory = new RoleDirectory();
    UserDirectory userDirectory = new UserDirectory();

    /**
     * Creates new form LoginJPanel
     *
     * @param PanelContainer
     */
    public LoginJPanel(JPanel PanelContainer) {
        initComponents();
        this.PanelContainer = PanelContainer;
        ReadProp rp = new ReadProp();
        rp.readprop(roleDirectory);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblNewuser = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnback = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(null);

        txtTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chronica/resources/title.jpg"))); // NOI18N
        add(txtTitle);
        txtTitle.setBounds(150, 80, 879, 145);

        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        add(btnSignup);
        btnSignup.setBounds(960, 830, 140, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail);
        txtEmail.setBounds(470, 420, 240, 30);

        lblEmail.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        add(lblEmail);
        lblEmail.setBounds(400, 420, 90, 20);

        lblNewuser.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        lblNewuser.setForeground(new java.awt.Color(255, 255, 255));
        lblNewuser.setText("New user ?");
        add(lblNewuser);
        lblNewuser.setBounds(850, 830, 120, 20);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin);
        btnLogin.setBounds(530, 570, 100, 30);

        lblPassword.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");
        add(lblPassword);
        lblPassword.setBounds(370, 500, 90, 20);
        add(txtPassword);
        txtPassword.setBounds(470, 500, 240, 30);

        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback);
        btnback.setBounds(370, 370, 40, 23);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chronica/resources/gradient.jpeg"))); // NOI18N
        add(Background);
        Background.setBounds(0, -10, 1190, 960);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        CreateAccJPanel panel = new CreateAccJPanel(PanelContainer, userDirectory, roleDirectory);
        PanelContainer.add("CreateAccJPanel", panel);
        CardLayout layout = (CardLayout) PanelContainer.getLayout();
        layout.next(PanelContainer);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        PanelContainer.remove(this);
        CardLayout layout = (CardLayout) PanelContainer.getLayout();
        layout.previous(PanelContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        isAuth();

    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNewuser;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables

    private void isAuth() {
        if (txtEmail.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "One of the field is empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        User user = userDirectory.findUserEmail(txtEmail.getText());
        if (user != null) {
            if (user.getPassword().equalsIgnoreCase(txtPassword.getText())) {
                JOptionPane.showMessageDialog(this, "Login Successful - Welcome " + user.getUsername() + " !", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Password", "Warning", JOptionPane.WARNING_MESSAGE);
                txtPassword.setText("");
                return;
            }

        } else {
            JOptionPane.showMessageDialog(this, "User not found", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }

}
