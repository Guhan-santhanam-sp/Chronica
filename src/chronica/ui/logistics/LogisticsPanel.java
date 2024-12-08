/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.logistics;

import chronica.model.event.Event;
import chronica.model.event.EventDirectory;
import chronica.model.role.RoleDirectory;
import chronica.model.task.Task;
import chronica.model.task.TaskDirectory;
import chronica.model.user.User;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arvindranganathraghuraman
 */
public class LogisticsPanel extends javax.swing.JPanel {

    JPanel LogisticsPanel;
    RoleDirectory roleDirectory;
    TaskDirectory taskDirectory;
    EventDirectory eventDirectory;
    User logisticsUser;

    /**
     * Creates new form LogisticsPanel
     */
    public LogisticsPanel(JPanel LogisticsPanel, User logisticsUser, RoleDirectory roleDirectory, TaskDirectory taskDirectory, EventDirectory eventDirectory) {
        initComponents();
        this.LogisticsPanel = LogisticsPanel;
        this.logisticsUser = logisticsUser;
        this.roleDirectory = roleDirectory;
        this.taskDirectory = taskDirectory;
        this.eventDirectory = eventDirectory;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTaskPrev = new javax.swing.JTable();
        btnRemoveTask = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTaskAvl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        tblTaskPrev.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Task", "Description", "Budget", "Created By", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTaskPrev);

        btnRemoveTask.setText("Remove");
        btnRemoveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTaskActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign to Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        tblTaskAvl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Task", "Description", "Budget", "Created By", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTaskAvl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Available Tasks");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Previous Tasks");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Logistics Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveTask)
                        .addGap(240, 240, 240))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(541, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAssign, btnRemoveTask});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnRemoveTask))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTaskActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblTaskPrev.getSelectedRow();
        if (selectedrow >= 0) {
            Task selectedTask = (Task) tblTaskPrev.getValueAt(selectedrow, 0);

           selectedTask.setStatus(false);
           selectedTask.setAssignedto(null);
            JOptionPane.showMessageDialog(this, "Task Deleted.", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateTable();

        } else {
            JOptionPane.showMessageDialog(this, "Please a select a Task to delete from the list", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveTaskActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblTaskAvl.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a task to assign.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Task task = (Task) tblTaskAvl.getValueAt(selectedRowIndex, 0);
        task.setStatus(true);
        task.setAssignedto(logisticsUser);
        JOptionPane.showMessageDialog(this, "Task assigned to " + logisticsUser.getUsername() + ".", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();

        System.out.println(task.getAssignedby() + "" + task.getAssignedto());


    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnRemoveTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTaskAvl;
    private javax.swing.JTable tblTaskPrev;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblTaskAvl.getModel();
        model.setRowCount(0);

        for (Event e : eventDirectory.getEvents()) {
            TaskDirectory td = e.getTaskDirectory();
            for (Task task : td.getAllTasks()) {
                if (task.getRole().getName().equalsIgnoreCase("Logistics") && task.isStatus() == false) {
                    Object[] row = new Object[5];
                    row[0] = task;
                    row[1] = task.getDescription();
                    row[2] = task.getCost();
                    row[3] = task.getAssignedby().getUsername();
                    row[4] = task.isStatus() ? "Completed" : "Pending";
                    model.addRow(row);

                }
            }

            DefaultTableModel model1 = (DefaultTableModel) tblTaskPrev.getModel();
            model1.setRowCount(0);

            for (Event ev : eventDirectory.getEvents()) {
                for (Task task : ev.getTaskDirectory().getTaskedbyAssignedto(logisticsUser)) {
                    if (task == null) {

                    } else {
                        if (task.getRole().getName().equalsIgnoreCase("Logistics")) {
                            Object[] row = new Object[5];
                            row[0] = task;
                            row[1] = task.getDescription();
                            row[2] = task.getCost();
                            row[3] = task.getAssignedby().getUsername();
                            row[4] = task.isStatus() ? "Completed" : "Pending";
                            model1.addRow(row);
                        }

                    }
                }
            }
        }
    }
}
