/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.admin;

import chronica.model.event.EventDirectory;
import chronica.model.role.RoleDirectory;
import chronica.model.user.User;
import chronica.model.user.UserDirectory;
import chronica.ui.nav.NavBar;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Gooqe
 */
public class AdminMainPage extends javax.swing.JPanel {

    JPanel panelContainer;
    User admin;
    EventDirectory eventDirectory;
    RoleDirectory roleDirectory;
    UserDirectory userDirectory;

    /**
     * Creates new form AdminMainPage
     */
    public AdminMainPage(JPanel panelContainer, User authUser, RoleDirectory roleDirectory, UserDirectory userDirectory, EventDirectory eventDirectory) {
        initComponents();
        this.panelContainer = panelContainer;
        this.admin = authUser;
        this.eventDirectory = eventDirectory;
        this.roleDirectory = roleDirectory;
        this.userDirectory = userDirectory;
        render();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        navBar = new javax.swing.JPanel();
        adminPanel = new javax.swing.JPanel();

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        navBar.setLayout(new java.awt.CardLayout());
        jSplitPane2.setTopComponent(navBar);

        adminPanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(adminPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel navBar;
    // End of variables declaration//GEN-END:variables

    private void render() {

        NavBar panel = new NavBar(panelContainer, navBar, admin, roleDirectory, userDirectory, eventDirectory);
        navBar.add("NavBar", panel);
        CardLayout layout = (CardLayout) navBar.getLayout();
        layout.next(navBar);
        
        AdminPanel panel1 = new AdminPanel(adminPanel, admin, eventDirectory, userDirectory, roleDirectory);
        adminPanel.add("customerPanel", panel1);
        CardLayout layout1 = (CardLayout) adminPanel.getLayout();
        layout1.next(adminPanel);

    }
}
