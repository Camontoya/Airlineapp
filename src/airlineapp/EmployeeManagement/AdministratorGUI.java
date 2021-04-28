package airlineapp.EmployeeManagement;

import airlineapp.StartWindowGUI;
import airlineapp.WebSockets.Tester;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministratorGUI extends javax.swing.JFrame {

    public AdministratorGUI() {
        initComponents();
        this.setTitle("Administrator");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLtitulo = new javax.swing.JLabel();
        JLopciones = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnEmployeeManagement = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLtitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLtitulo.setText("Employee Management Administrator");

        JLopciones.setText("Please choose the option you want to do");

        btnExit.setText("Exit");
        btnExit.setName("btnExit"); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnPayment.setText("Employee Payment");
        btnPayment.setName("btnPayment"); // NOI18N
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnEmployeeManagement.setText("Employee Management");
        btnEmployeeManagement.setName("btnEmployeeManagement"); // NOI18N
        btnEmployeeManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeManagementActionPerformed(evt);
            }
        });

        btnTest.setText("Test");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(JLopciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEmployeeManagement)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLtitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPayment)
                    .addComponent(btnEmployeeManagement))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnTest))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        new StartWindowGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        new EmployeePaymentGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnEmployeeManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeManagementActionPerformed
        new EmployeeManagementGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEmployeeManagementActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
//        new DBTesting().setVisible(true);
//        this.dispose();
        Tester t = new Tester();
        t.start();
        Connector c = new Connector();
        try {
            c.connectingDB();
        } catch (IOException ex) {
            Logger.getLogger(AdministratorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTestActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLopciones;
    private javax.swing.JLabel JLtitulo;
    private javax.swing.JButton btnEmployeeManagement;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnTest;
    // End of variables declaration//GEN-END:variables
}
