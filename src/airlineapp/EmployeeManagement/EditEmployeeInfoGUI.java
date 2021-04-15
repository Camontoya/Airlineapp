package airlineapp.EmployeeManagement;

import airlineapp.DBHandling.DBManagement;
import airlineapp.Registration.NewPerson;
import javax.swing.JOptionPane;

public class EditEmployeeInfoGUI extends javax.swing.JFrame {
    public EditEmployeeInfoGUI() {
        initComponents();
        this.setTitle("Edit the employee info");
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtittle1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtWorkerName = new javax.swing.JTextField();
        txtWorkerLast = new javax.swing.JTextField();
        txtWorkerID = new javax.swing.JTextField();
        txtWorkerEmail = new javax.swing.JTextField();
        jdcBirthday = new com.toedter.calendar.JDateChooser();
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
        txtWorkerAddress = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLtittle1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLtittle1.setText("Employ Management");

        jLabel1.setText("Please put the new worker information");

        txtWorkerName.setText("First name");
        txtWorkerName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWorkerNameMouseClicked(evt);
            }
        });
        txtWorkerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkerNameActionPerformed(evt);
            }
        });

        txtWorkerLast.setText("Last name");
        txtWorkerLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWorkerLastMouseClicked(evt);
            }
        });
        txtWorkerLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkerLastActionPerformed(evt);
            }
        });

        txtWorkerID.setText("Worker ID");
        txtWorkerID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWorkerIDMouseClicked(evt);
            }
        });
        txtWorkerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkerIDActionPerformed(evt);
            }
        });

        txtWorkerEmail.setText("Worker email");
        txtWorkerEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWorkerEmailMouseClicked(evt);
            }
        });
        txtWorkerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkerEmailActionPerformed(evt);
            }
        });

        jrbMale.setText("Male");

        jrbFemale.setText("Female");

        txtWorkerAddress.setText("Worker Address");
        txtWorkerAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWorkerAddressMouseClicked(evt);
            }
        });
        txtWorkerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkerAddressActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtWorkerAddress))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jdcBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jrbMale)
                                            .addGap(18, 18, 18)
                                            .addComponent(jrbFemale))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtWorkerName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtWorkerLast, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtWorkerID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtWorkerEmail)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JLtittle1))
                    .addComponent(jLabel1))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JLtittle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWorkerLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWorkerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWorkerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdcBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMale)
                    .addComponent(jrbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWorkerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtWorkerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkerNameActionPerformed

    private void txtWorkerLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkerLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkerLastActionPerformed

    private void txtWorkerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkerIDActionPerformed

    private void txtWorkerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkerEmailActionPerformed

    private void txtWorkerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorkerAddressActionPerformed

    private void txtWorkerNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWorkerNameMouseClicked
        txtWorkerName.setText("");
    }//GEN-LAST:event_txtWorkerNameMouseClicked

    private void txtWorkerLastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWorkerLastMouseClicked
        txtWorkerLast.setText("");
    }//GEN-LAST:event_txtWorkerLastMouseClicked

    private void txtWorkerIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWorkerIDMouseClicked
        txtWorkerID.setText("");
    }//GEN-LAST:event_txtWorkerIDMouseClicked

    private void txtWorkerEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWorkerEmailMouseClicked
        txtWorkerEmail.setText("");
    }//GEN-LAST:event_txtWorkerEmailMouseClicked

    private void txtWorkerAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWorkerAddressMouseClicked
        txtWorkerAddress.setText("");
    }//GEN-LAST:event_txtWorkerAddressMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String id = txtWorkerID.getText();
        String name = txtWorkerName.getText();
        String last = txtWorkerLast.getText();
        String email = txtWorkerEmail.getText();
        String address = txtWorkerAddress.getText();
        String date = new NewPerson().getDate(jdcBirthday.getDate()), sex;
        if (jrbMale.isSelected()) {
            sex = "M";
        } else {
            sex = "F";
        }
        new DBManagement().updateWorker(id, name, last, email, date, sex, address);
        JOptionPane.showMessageDialog(null, "Information updated!");
        new SearchWorkerInfoGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new SearchWorkerInfoGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployeeInfoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLtittle1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jdcBirthday;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JTextField txtWorkerAddress;
    private javax.swing.JTextField txtWorkerEmail;
    private javax.swing.JTextField txtWorkerID;
    private javax.swing.JTextField txtWorkerLast;
    private javax.swing.JTextField txtWorkerName;
    // End of variables declaration//GEN-END:variables
}
