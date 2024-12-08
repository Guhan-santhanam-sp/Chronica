/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.vendormanagement;

import chronica.model.event.Event;
import chronica.model.event.EventDirectory;
import chronica.model.role.RoleDirectory;
import chronica.model.task.Task;
import chronica.model.task.TaskDirectory;
import chronica.ui.vendormanagement.VendorPanel;
import chronica.model.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaavy
 */
public class VendorPanel extends javax.swing.JPanel {
    
    JPanel VendorPanel;
    RoleDirectory roleDirectory;
    TaskDirectory taskDirectory;
    EventDirectory eventDirectory;
    User vendor;
    

    /**
     * Creates new form VendorManagementPanel
     */
    public VendorPanel(JPanel VendorPanel, User VendorUser, RoleDirectory roleDirectory, TaskDirectory taskDirectory, EventDirectory eventDirectory) {
        initComponents();
        this.VendorPanel = VendorPanel;
        this.taskDirectory = taskDirectory;
        this.eventDirectory = eventDirectory;
        this.roleDirectory = roleDirectory;
        this.vendor = vendor;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnback = new javax.swing.JButton();
        lblTitle2 = new javax.swing.JLabel();
        lblTitle1 = new javax.swing.JLabel();
        ScrollPane3 = new javax.swing.JScrollPane();
        tblVendor = new javax.swing.JTable();
        ScrollPane4 = new javax.swing.JScrollPane();
        tblVendorHistory = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnRemoveTask = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblTitle2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle2.setText("Vendor History");

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle1.setText("Vendor Details");

        tblVendor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Task", "Date", "Budget", "Created By", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPane3.setViewportView(tblVendor);

        tblVendorHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event ID", "Task", "Date", "Budget", "Created By", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPane4.setViewportView(tblVendorHistory);

        btnAssign.setText("Assign to Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnRemoveTask.setText("Remove");
        btnRemoveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTaskActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Vendor Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(341, 341, 341)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(ScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(ScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnAssign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveTask)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnback)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveTask)
                    .addComponent(btnAssign))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        VendorPanel.remove(this);
        Component[] componentArray = VendorPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VendorPanel VendorManagementPaneljpanel = (VendorPanel) component;
        VendorManagementPaneljpanel.populateTable();
        CardLayout layout = (CardLayout) VendorPanel.getLayout();
        layout.previous(VendorPanel);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVendor.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a task to assign.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Task task = (Task) tblVendor.getValueAt(selectedRowIndex, 0);
        task.setStatus(true);
        task.setAssignedto(vendor);
        JOptionPane.showMessageDialog(this, "Task assigned to " + vendor.getUsername() + ".", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();

        System.out.println(task.getAssignedby() + "" + task.getAssignedto());
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRemoveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTaskActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblVendorHistory.getSelectedRow();
        if (selectedrow >= 0) {
            Task selectedTask = (Task) tblVendorHistory.getValueAt(selectedrow, 0);

           selectedTask.setStatus(false);
           selectedTask.setAssignedto(null);
            JOptionPane.showMessageDialog(this, "Task Deleted.", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateTable();

        } else {
            JOptionPane.showMessageDialog(this, "Please a select a Task to delete from the list", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveTaskActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane3;
    private javax.swing.JScrollPane ScrollPane4;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnRemoveTask;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JTable tblVendor;
    private javax.swing.JTable tblVendorHistory;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVendor.getModel();
        model.setRowCount(0);

        for (Event e : eventDirectory.getEvents()) {
            TaskDirectory td = e.getTaskDirectory();
            for (Task task : td.getAllTasks()) {
                if (task.getRole().getName().equalsIgnoreCase("Vendor") && task.isStatus() == false) {
                    Object[] row = new Object[6];
                    row[0] = e.getEventId();
                    row[1] = task;
                    row[2] = e.getDate();
                    row[3] = task.getCost();
                    row[4] = task.getAssignedby().getUsername();
                    row[5] = task.isStatus() ? "Completed" : "Pending";
                    model.addRow(row);

                }
            }

            DefaultTableModel model1 = (DefaultTableModel) tblVendorHistory.getModel();
            model1.setRowCount(0);

            for (Event ev : eventDirectory.getEvents()) {
                for (Task task : ev.getTaskDirectory().getTaskedbyAssignedto(vendor)) {
                    if (task == null) {

                    } else {
                        if (task.getRole().getName().equalsIgnoreCase("Vendor")) {
                            Object[] row = new Object[6];
                        row[0] = e.getEventId();
                        row[1] = task;
                        row[2] = e.getDate();
                        row[3] = task.getCost();
                        row[4] = task.getAssignedby().getUsername();
                        row[5] = task.isStatus() ? "Completed" : "Pending";
                        model.addRow(row);
                        }

                    }
                }
            }
        }
    }
}
