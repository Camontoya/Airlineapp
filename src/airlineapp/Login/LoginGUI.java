package airlineapp.Login;

import airlineapp.Authentication.userValidation;

public class LoginGUI extends javax.swing.JFrame {
    public LoginGUI() {
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmailInput = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblAirplaneTitle = new javax.swing.JLabel();
        txtPasswordInput = new javax.swing.JPasswordField();
        cbxShowPassword = new javax.swing.JCheckBox();
        btnCancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(334, 265));

        txtEmailInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmailInput.setText("Enter your email");
        txtEmailInput.setName("txtEmailInput"); // NOI18N
        txtEmailInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailInputMouseClicked(evt);
            }
        });
        txtEmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailInputActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.setName("btnLogin"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblAirplaneTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAirplaneTitle.setText("Airplane App Login");
        lblAirplaneTitle.setName("lblAirplaneTitle"); // NOI18N

        txtPasswordInput.setText("Enter your passowrd");
        txtPasswordInput.setName("txtPasswordInput"); // NOI18N
        txtPasswordInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordInputMouseClicked(evt);
            }
        });
        txtPasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordInputActionPerformed(evt);
            }
        });

        cbxShowPassword.setText("Show Password");
        cbxShowPassword.setName("cbxShowPassword"); // NOI18N
        cbxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxShowPasswordActionPerformed(evt);
            }
        });

        btnCancel1.setText("Cancel");
        btnCancel1.setName("btnCancel"); // NOI18N
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin))
                            .addComponent(txtEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxShowPassword))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblAirplaneTitle)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lblAirplaneTitle)
                .addGap(45, 45, 45)
                .addComponent(txtEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxShowPassword))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel1))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailInputMouseClicked
        txtEmailInput.setText("");
    }//GEN-LAST:event_txtEmailInputMouseClicked

    private void txtEmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailInputActionPerformed
    }//GEN-LAST:event_txtEmailInputActionPerformed

    private void txtPasswordInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordInputMouseClicked
        txtPasswordInput.setText("");
    }//GEN-LAST:event_txtPasswordInputMouseClicked

    private void txtPasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordInputActionPerformed
    }//GEN-LAST:event_txtPasswordInputActionPerformed

    private void cbxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxShowPasswordActionPerformed
        if (cbxShowPassword.isSelected()){
            txtPasswordInput.setEchoChar((char) 0);
        }else{
            txtPasswordInput.setEchoChar('*');
        }
    }//GEN-LAST:event_cbxShowPasswordActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        new Login().goBack();
        this.dispose();
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = txtEmailInput.getText();
        String password = String.copyValueOf(txtPasswordInput.getPassword());
        Login login = new Login();
        if (userValidation.isWorker(txtEmailInput.getText())) {
            login.verifyWorker(email, password);
            this.dispose();
        } else {
            login.verifyUser(email, password);
            this.dispose();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbxShowPassword;
    private javax.swing.JLabel lblAirplaneTitle;
    private javax.swing.JTextField txtEmailInput;
    private javax.swing.JPasswordField txtPasswordInput;
    // End of variables declaration//GEN-END:variables
}
