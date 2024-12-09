/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.customer;

import chronica.model.role.Role;
import chronica.model.role.RoleDirectory;
import chronica.model.task.Task;
import chronica.model.task.TaskDirectory;
import chronica.model.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Gooqe
 */
public class TaskPanel extends javax.swing.JPanel {

    TaskDirectory taskDirectory;
    JPanel customerPanel;
    RoleDirectory roleDirectory;
    Task editTask = null;
    User customer;

    /**
     * Creates new form TaskPanel
     */
    public TaskPanel(JPanel customerPanel, TaskDirectory taskDirectory, RoleDirectory roleDirectory, User customer) {
        initComponents();
        this.taskDirectory = taskDirectory;
        this.customerPanel = customerPanel;
        this.roleDirectory = roleDirectory;
        this.customer = customer;

        populateRoles(roleDirectory);
    }

    TaskPanel(JPanel customerPanel, TaskDirectory taskDirectory, RoleDirectory roleDirectory, Task t) {
        initComponents();
        this.taskDirectory = taskDirectory;
        this.customerPanel = customerPanel;
        this.roleDirectory = roleDirectory;
        this.editTask = t;
        populateRoles(roleDirectory);
        txtCost.setText(String.valueOf(editTask.getCost()));
        txtDesc.setText(String.valueOf(editTask.getDescription()));
        cmbRoles.setSelectedItem(editTask.getRole());
        toggleDisabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbRoles = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        checkbox1.setLabel("checkbox1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Role");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Cost");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Task Details");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Description");

        cmbRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(454, 454, 454))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(txtCost, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbRoles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(352, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(449, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (editTask == null) {
            String desc = txtDesc.getText();
            Double cost = null;
            try {
                cost = Double.valueOf(txtCost.getText());
                if (cost <= 0) {
                    JOptionPane.showMessageDialog(this, "Invalid Cost Input. Please Enter Number !", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Cost Input. Please Enter Number !", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String rolename = (String) cmbRoles.getSelectedItem();
            Role role = roleDirectory.findRole(rolename);
            if (desc.isBlank() || cost == null) {
                JOptionPane.showMessageDialog(this, "One of the fields is Missing", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                taskDirectory.addTask(desc, role, cost, customer);
                JOptionPane.showMessageDialog(this, "Task has been added", "Information", JOptionPane.INFORMATION_MESSAGE);
                txtDesc.setText("");
                txtCost.setText("");

            }

        } else {
            String desc = txtDesc.getText();
            Double cost = null;
            try {
                cost = Double.valueOf(txtCost.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "One of the fields is incorrect", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String rolename = (String) cmbRoles.getSelectedItem();
            Role role = roleDirectory.findRole(rolename);
            if (desc.isBlank() || cost == null) {
                JOptionPane.showMessageDialog(this, "One of the fields is incorrect", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                editTask.setCost(cost);
                editTask.setDescription(desc);
                editTask.setRole(role);
                JOptionPane.showMessageDialog(this, "Task has been Updated", "Information", JOptionPane.INFORMATION_MESSAGE);
                btnSave.setEnabled(false);

            }

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        customerPanel.remove(this);
        Component[] componentArray = customerPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerPanel CustomerPaneljpanel = (CustomerPanel) component;
        CustomerPaneljpanel.populateTable();
        CardLayout layout = (CardLayout) customerPanel.getLayout();
        layout.previous(customerPanel);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        toggleDisabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JComboBox<String> cmbRoles;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDesc;
    // End of variables declaration//GEN-END:variables

    private void populateRoles(RoleDirectory roleDirectory) {
        cmbRoles.removeAllItems();

        for (Role r : roleDirectory.getRolelist()) {
            if (r.getName().equalsIgnoreCase("customer") || r.getName().equalsIgnoreCase("admin") || r.getName().equalsIgnoreCase("Attendee")) {

            } else {
                cmbRoles.addItem(r.getName());
            }
        }
    }

    private void toggleDisabled(boolean bool) {
        txtCost.setEnabled(bool);
        txtDesc.setEnabled(bool);
        cmbRoles.setEnabled(bool);
        btnSave.setEnabled(bool);
        btnUpdate.setEnabled(!bool);
    }
}
