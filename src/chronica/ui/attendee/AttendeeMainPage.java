/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.attendee;

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
public class AttendeeMainPage extends javax.swing.JPanel {

    JPanel panelContainer;
    RoleDirectory roleDirectory;
    UserDirectory userDirectory;
    EventDirectory eventDirectory;
    User attendee;

    /**
     * Creates new form AttendeeMainPanel
     * @param panelContainer
     * @param authUser
     * @param roleDirectory
     * @param userDirectory
     * @param eventDirectory
     */
    public AttendeeMainPage(JPanel panelContainer, User authUser, RoleDirectory roleDirectory, UserDirectory userDirectory, EventDirectory eventDirectory) {
        initComponents();
        this.panelContainer = panelContainer;
        this.attendee = authUser;
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
        attendeePanel = new javax.swing.JPanel();

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        navBar.setLayout(new java.awt.CardLayout());
        jSplitPane2.setTopComponent(navBar);

        attendeePanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(attendeePanel);

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
    private javax.swing.JPanel attendeePanel;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel navBar;
    // End of variables declaration//GEN-END:variables

    private void render() {

        NavBar panel = new NavBar(panelContainer, navBar, attendee, roleDirectory, userDirectory, eventDirectory);
        navBar.add("NavBar", panel);
        CardLayout layout = (CardLayout) navBar.getLayout();
        layout.next(navBar);

        AttendeePanel panel1 = new AttendeePanel(attendeePanel, attendee, roleDirectory, eventDirectory);
        attendeePanel.add("customerPanel", panel1);
        CardLayout layout1 = (CardLayout) attendeePanel.getLayout();
        layout1.next(attendeePanel);

    }
}
