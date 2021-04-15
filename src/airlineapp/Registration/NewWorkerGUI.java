package airlineapp.Registration;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewWorkerGUI extends javax.swing.JFrame {

    private ArrayList wA;
    public NewWorkerGUI() {
        initComponents();
        this.setTitle("New Employee");
        this.setLocationRelativeTo(null);
    }   
    
    public void setWorkerAttributes(ArrayList wA){
        this.wA = wA;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAirplaneTitle = new javax.swing.JLabel();
        rdbAdminAccess = new javax.swing.JRadioButton();
        rdbVendorAccess = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAirplaneTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAirplaneTitle.setText("Employee Access");
        lblAirplaneTitle.setName("lblAirplaneTitle"); // NOI18N

        rdbAdminAccess.setText("Administrator");
        rdbAdminAccess.setName("rdbAdminAccess"); // NOI18N
        rdbAdminAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAdminAccessActionPerformed(evt);
            }
        });

        rdbVendorAccess.setText("Vendor");
        rdbVendorAccess.setName("rdbVendorAccess"); // NOI18N
        rdbVendorAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbVendorAccessActionPerformed(evt);
            }
        });

        jLabel1.setText("Please choose the role you are ");

        jLabel2.setText("going to develop.");

        btnContinue.setText("Continue");
        btnContinue.setName("btnContinue"); // NOI18N
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAirplaneTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbAdminAccess)
                            .addComponent(rdbVendorAccess))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnContinue))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblAirplaneTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(rdbAdminAccess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbVendorAccess)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinue)
                    .addComponent(btnCancel))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbAdminAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAdminAccessActionPerformed
        if(rdbAdminAccess.isSelected()){
            rdbVendorAccess.setSelected(false);
        }
    }//GEN-LAST:event_rdbAdminAccessActionPerformed

    private void rdbVendorAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbVendorAccessActionPerformed
        if(rdbVendorAccess.isSelected()){
            rdbAdminAccess.setSelected(false);
        }
    }//GEN-LAST:event_rdbVendorAccessActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        String access = null;
        if (rdbAdminAccess.isSelected()) {
            access = "0";
        } else if (rdbVendorAccess.isSelected()) {
            access = "1";
        } else {
            JOptionPane.showMessageDialog(null, "Should select and option for the access!");
        }
        new NewWorker().createWorker(wA.get(0).toString(), wA.get(1).toString(),
                wA.get(2).toString(), wA.get(3).toString(), wA.get(4).toString(),
                wA.get(5).toString(), wA.get(6).toString(), wA.get(7).toString(),
                access);
        new NewWorker().goBack();
        this.dispose();
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new NewWorker().goBack();
        this.dispose();              
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewWorkerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAirplaneTitle;
    private javax.swing.JRadioButton rdbAdminAccess;
    private javax.swing.JRadioButton rdbVendorAccess;
    // End of variables declaration//GEN-END:variables
}
