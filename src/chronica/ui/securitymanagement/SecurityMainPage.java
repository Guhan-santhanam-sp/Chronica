/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.securitymanagement;

import chronica.model.user.User;
import chronica.model.user.UserDirectory;
import chronica.model.event.EventDirectory;
import chronica.model.role.RoleDirectory;
import chronica.model.task.TaskDirectory;
import chronica.ui.nav.NavBar;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ranji
 */
public class SecurityMainPage extends javax.swing.JPanel {
    JPanel PanelContainer;
    User securityUser;
    RoleDirectory roleDirectory;
    UserDirectory userDirectory;
    TaskDirectory taskDirectory;
    EventDirectory eventDirectory;

    /**
     * Creates new form SecurityMainPage
     */
    public SecurityMainPage(JPanel PanelContainer, User securityUser, RoleDirectory roleDirectory, UserDirectory userDirectory, EventDirectory eventDirectory) {
        initComponents();
        this.PanelContainer = PanelContainer;
        this.securityUser = securityUser;
        this.roleDirectory = roleDirectory;
        this.userDirectory = userDirectory;
        this.eventDirectory = eventDirectory;
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
        SecurityPanel = new javax.swing.JPanel();

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        navBar.setLayout(new java.awt.CardLayout());
        jSplitPane2.setTopComponent(navBar);

        SecurityPanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(SecurityPanel);

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
    private javax.swing.JPanel SecurityPanel;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel navBar;
    // End of variables declaration//GEN-END:variables

    private void render() {
        NavBar panel = new NavBar(PanelContainer, navBar, securityUser, roleDirectory, userDirectory,eventDirectory);
        navBar.add("NavBar", panel);
        CardLayout layout = (CardLayout) navBar.getLayout();
        layout.next(navBar);

        SecurityPanel panel1 = new SecurityPanel(SecurityPanel, securityUser, roleDirectory, taskDirectory, eventDirectory);
        SecurityPanel.add("LogisticsPanel", panel1);
        CardLayout layout1 = (CardLayout) SecurityPanel.getLayout();
        
        layout1.next(SecurityPanel);
    }
}
