/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package chronica.ui.customer;

import chronica.model.business.Task.Task;
import chronica.model.business.Task.TaskDirectory;
import chronica.model.business.User.User;
import chronica.model.business.event.EventDirectory;
import chronica.model.business.role.RoleDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gooqe
 */
public class CustomerPanel extends javax.swing.JPanel {

    JPanel customerPanel;
    RoleDirectory roleDirectory;
    TaskDirectory taskDirectory;
    EventDirectory eventDirectory;
    User customer;
    Double totalBudget = 0.0;
    Double eventBudget = 0.0;

    /**
     * Creates new form CustomerPanel
     *
     * @param customerPanel
     * @param customer
     * @param roleDirectory
     * @param taskDirectory
     */
    public CustomerPanel(JPanel customerPanel, User customer, RoleDirectory roleDirectory, TaskDirectory taskDirectory, EventDirectory eventDirectory) {
        initComponents();
        this.customerPanel = customerPanel;
        this.roleDirectory = roleDirectory;
        this.taskDirectory = taskDirectory;
        this.eventDirectory = eventDirectory;
        this.customer = customer;
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

        jLabel1 = new javax.swing.JLabel();
        btnBookingHistory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEventName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtNumberOfAttendee = new javax.swing.JTextField();
        txtBudget = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTask = new javax.swing.JTable();
        btnAddTask = new javax.swing.JButton();
        btnRemoveTask = new javax.swing.JButton();
        btnEditTask = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCreateEvent = new javax.swing.JButton();

        setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Book an Event ! ");

        btnBookingHistory.setText("Booking History");
        btnBookingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingHistoryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Event Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Location");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Budget");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("No. of Attendees");

        tblTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TaskID", "Description", "Status", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTask);

        btnAddTask.setText("Add ");
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });

        btnRemoveTask.setText("Remove");
        btnRemoveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTaskActionPerformed(evt);
            }
        });

        btnEditTask.setText("Edit");
        btnEditTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTaskActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCreateEvent.setText("Create Event");
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumberOfAttendee, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btnCreateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddTask)
                        .addGap(84, 84, 84)
                        .addComponent(btnEditTask)
                        .addGap(90, 90, 90)
                        .addComponent(btnRemoveTask)
                        .addGap(27, 27, 27)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBookingHistory)
                .addGap(171, 171, 171))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateEvent, btnReset});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnBookingHistory)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumberOfAttendee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateEvent)
                    .addComponent(btnReset)
                    .addComponent(btnAddTask)
                    .addComponent(btnRemoveTask)
                    .addComponent(btnEditTask))
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
        // TODO add your handling code here:
        TaskPanel panel = new TaskPanel(customerPanel, taskDirectory, roleDirectory, customer);
        customerPanel.add("TaskPanel", panel);
        CardLayout layout = (CardLayout) customerPanel.getLayout();
        layout.next(customerPanel);
    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void btnRemoveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTaskActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblTask.getSelectedRow();
        if (selectedrow >= 0) {
            Task selectedTask = (Task) tblTask.getValueAt(selectedrow, 0);
            taskDirectory.removeTask(selectedTask.getTaskId());
            JOptionPane.showMessageDialog(this, "Task Deleted.", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateTable();

        } else {
            JOptionPane.showMessageDialog(this, "Please a select a Task to delete from the list", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveTaskActionPerformed

    private void btnEditTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTaskActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblTask.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please a select a Task to edit from the list", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        Task t = (Task) tblTask.getValueAt(selectedRowIndex, 0);
        TaskPanel panel = new TaskPanel(customerPanel, taskDirectory, roleDirectory, t);
        customerPanel.add("ViewProductDetailJPanel", panel);
        CardLayout layout = (CardLayout) customerPanel.getLayout();
        layout.next(customerPanel);
    }//GEN-LAST:event_btnEditTaskActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtBudget.setText("");
        txtDate.setText("");
        txtEventName.setText("");
        txtLocation.setText("");
        txtNumberOfAttendee.setText("");
        taskDirectory = new TaskDirectory();
        populateTable();
        JOptionPane.showMessageDialog(this, "All Fields Resetted ", "Information", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
        // TODO add your handling code here:

        this.totalBudget = 0.0;
        this.eventBudget = 0.0;
        int attendee = 0;
        String eventName = txtEventName.getText();
        String location = txtLocation.getText();
        String Date = txtDate.getText();

        try {
            eventBudget = Double.valueOf(txtBudget.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Incorect Budget input. Please Enter Number !", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            attendee = Integer.parseInt(txtNumberOfAttendee.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Incorect Attendee input. Please Enter Number !", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (eventName.isEmpty() || location.isEmpty() || Date.isEmpty() || attendee == 0) {
            JOptionPane.showMessageDialog(this, "One of the fields is incorrect", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            for (Task t : taskDirectory.getAllTasks()) {
                totalBudget = totalBudget + t.getCost();

            }

            if (eventBudget <= totalBudget) {
                JOptionPane.showMessageDialog(this, "Task Budgets exceeds Event Budget.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                if (totalBudget < 1) {
                    JOptionPane.showMessageDialog(this, "Please include some Tasks.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;

                } else {
                    eventDirectory.newEvent(eventName, Date, location, eventBudget, attendee, customer);
                    JOptionPane.showMessageDialog(this, "Event Created ! Thank you for choosing Chronica ", "Information", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }


    }//GEN-LAST:event_btnCreateEventActionPerformed

    private void btnBookingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingHistoryActionPerformed
        // TODO add your handling code here:
        CustomerBookingHistory panel = new CustomerBookingHistory(customerPanel, eventDirectory, customer);
        customerPanel.add("CustomerBookingHistory", panel);
        CardLayout layout = (CardLayout) customerPanel.getLayout();
        layout.next(customerPanel);
    }//GEN-LAST:event_btnBookingHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnBookingHistory;
    private javax.swing.JButton btnCreateEvent;
    private javax.swing.JButton btnEditTask;
    private javax.swing.JButton btnRemoveTask;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTask;
    private javax.swing.JTextField txtBudget;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtNumberOfAttendee;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        this.totalBudget = 0.0;
        this.eventBudget = 0.0;
        DefaultTableModel model = (DefaultTableModel) tblTask.getModel();
        model.setRowCount(0);
        String status = null;

        for (Task task : taskDirectory.getAllTasks()) {
            System.out.println("task - > " + task.toString());
            Object row[] = new Object[5];
            if (!task.isStatus()) {
                status = "Pending";
            } else {
                status = "Completed";
            }

            row[0] = task;
            row[1] = task.getDescription();
            row[2] = status;
            row[3] = task.getCost();
            row[4] = task.getRole().getName();
            model.addRow(row);
        }
    }
}
