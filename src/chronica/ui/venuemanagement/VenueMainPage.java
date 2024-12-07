/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.venuemanagement;

import chronica.model.event.EventDirectory;
import chronica.model.role.RoleDirectory;
import chronica.model.user.User;
import chronica.model.user.UserDirectory;
import chronica.ui.nav.NavBar;
import javax.swing.JPanel;

/**
 *
 * @author ranji
 */
public class VenueMainPage extends javax.swing.JPanel {
    JPanel panelContainer;
    RoleDirectory roleDirectory;
    UserDirectory userDirectory;
    EventDirectory eventDirectory;
    User authUser;

    /**
     * Creates new form VenueMainPage
     */
    public VenueMainPage(JPanel panelContainer, User authUser, RoleDirectory roleDirectory, UserDirectory userDirectory, EventDirectory eventDirectory) {
        initComponents();
        this.panelContainer = panelContainer;
        this.authUser = authUser;
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
        VenuePanel = new javax.swing.JPanel();

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        navBar.setLayout(new java.awt.CardLayout());
        jSplitPane2.setTopComponent(navBar);

        VenuePanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(VenuePanel);

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
    private javax.swing.JPanel VenuePanel;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel navBar;
    // End of variables declaration//GEN-END:variables

    private void render() {
        NavBar panel = new NavBar(panelContainer, navBar, authUser, roleDirectory, userDirectory, eventDirectory);
        navBar.add("NavBar", panel);
        java.awt.CardLayout layout = (java.awt.CardLayout) panelContainer.getLayout();
        layout.next(panelContainer);

        VenuePanel panel1 = new VenuePanel(VenuePanel, authUser, roleDirectory, eventDirectory);
        VenuePanel.add("VenuePanel", panel1);
        layout.next(panelContainer);
    }
}
