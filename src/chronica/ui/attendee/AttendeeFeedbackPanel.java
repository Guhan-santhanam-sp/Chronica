/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.attendee;

import chronica.model.business.User.User;
import chronica.model.business.event.Event;
import chronica.model.business.event.EventDirectory;
import chronica.model.business.role.Role;
import chronica.model.business.role.RoleDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Gooqe
 */
public class AttendeeFeedbackPanel extends javax.swing.JPanel {

    JPanel attendeePanel;
    User attendee;
    RoleDirectory roleDirectory;
    EventDirectory eventDirectory;
    Event selectedEvent;

    /**
     * Creates new form AttendeeFeedbackPanel
     */
    public AttendeeFeedbackPanel(JPanel attendeePanel, User attendee, RoleDirectory roleDirectory, EventDirectory eventDirectory, Event e) {
        initComponents();
        this.attendeePanel = attendeePanel;
        this.attendee = attendee;
        this.roleDirectory = roleDirectory;
        this.eventDirectory = eventDirectory;
        this.selectedEvent = e;
        populateComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreafeedback = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        cmbRoles = new javax.swing.JComboBox<>();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Provide Feedback based on the services Offered in the Event");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("FeedBack");

        jScrollPane1.setViewportView(txtAreafeedback);

        jButton1.setText("Submit Feedback");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        attendeePanel.remove(this);
        CardLayout layout = (CardLayout) attendeePanel.getLayout();
        layout.previous(attendeePanel);
    }//GEN-LAST:event_btnbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String feedback = txtAreafeedback.getText().trim();
        String rolename = (String) cmbRoles.getSelectedItem();

        if (feedback.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please Write a feedback to submit it !", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        } else {

            selectedEvent.giveFeedback(attendee, rolename, feedback);
            JOptionPane.showMessageDialog(this, "Feedback Submitted . Thank you for your time !", "Information", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(selectedEvent.getFeedbackByAttendee(attendee));
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> cmbRoles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtAreafeedback;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        cmbRoles.removeAll();
        for (Role r : selectedEvent.getRolesInEvent()) {
            cmbRoles.addItem(r.getName());
        }

    }
}
