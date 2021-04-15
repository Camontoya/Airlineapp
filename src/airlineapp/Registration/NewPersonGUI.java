package airlineapp.Registration;

import airlineapp.Authentication.userValidation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewPersonGUI extends javax.swing.JFrame {
    public NewPersonGUI() {
        initComponents();
        this.setTitle("New user");
        this.setLocationRelativeTo(null);
    }

    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        txtAddressInput = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        lblAirplaneTitle = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblAdvise = new javax.swing.JLabel();
        txtIDNumberInput = new javax.swing.JTextField();
        txtNameInput = new javax.swing.JTextField();
        chbShowPassword = new javax.swing.JCheckBox();
        txtLastNameInput = new javax.swing.JTextField();
        dcBirthdate = new com.toedter.calendar.JDateChooser();
        txtEmailInput = new javax.swing.JTextField();
        txtPasswordInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdbMale.setSelected(true);
        rdbMale.setText("Male");
        rdbMale.setName("rdbMale"); // NOI18N
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });

        rdbFemale.setText("Female");
        rdbFemale.setName("rdbFemale"); // NOI18N
        rdbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFemaleActionPerformed(evt);
            }
        });

        txtAddressInput.setText("Enter your address");
        txtAddressInput.setName("txtAddressInput"); // NOI18N
        txtAddressInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressInputMouseClicked(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.setName("btnConfirm"); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblAirplaneTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAirplaneTitle.setText("Airplane App Registration");
        lblAirplaneTitle.setName("lblAirplaneTitle"); // NOI18N

        btnCancel.setText("Cancel");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblAdvise.setText("Please fill all the spaces!");
        lblAdvise.setName("lblAdvise"); // NOI18N

        txtIDNumberInput.setText("Enter your ID number");
        txtIDNumberInput.setName("txtIDNumberInput"); // NOI18N
        txtIDNumberInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDNumberInputMouseClicked(evt);
            }
        });

        txtNameInput.setText("Enter your first name");
        txtNameInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameInputMouseClicked(evt);
            }
        });
        txtNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameInputActionPerformed(evt);
            }
        });

        chbShowPassword.setText("Show Password");
        chbShowPassword.setName("chbShowPassword"); // NOI18N
        chbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbShowPasswordActionPerformed(evt);
            }
        });

        txtLastNameInput.setText("Enter your last name");
        txtLastNameInput.setName("txtLastNameInput"); // NOI18N
        txtLastNameInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLastNameInputMouseClicked(evt);
            }
        });

        dcBirthdate.setDateFormatString("y MMM d");
        dcBirthdate.setName("dcBirthdate"); // NOI18N
        dcBirthdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dcBirthdateMouseClicked(evt);
            }
        });

        txtEmailInput.setText("Enter your email");
        txtEmailInput.setName("txtEmailInput"); // NOI18N
        txtEmailInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailInputMouseClicked(evt);
            }
        });

        txtPasswordInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordInput.setText("Insert your password");
        txtPasswordInput.setName("txtPasswordInput"); // NOI18N
        txtPasswordInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordInputMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAirplaneTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAdvise)
                                .addGap(71, 71, 71))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnCancel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnConfirm))
                        .addComponent(txtEmailInput)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rdbMale)
                            .addGap(18, 18, 18)
                            .addComponent(rdbFemale))
                        .addComponent(txtAddressInput)
                        .addComponent(txtIDNumberInput)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chbShowPassword)))
                    .addComponent(dcBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblAirplaneTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdvise)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIDNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbShowPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbMale)
                    .addComponent(rdbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaleActionPerformed
        if (rdbMale.isSelected()) {
            rdbFemale.setSelected(false);
        }
    }//GEN-LAST:event_rdbMaleActionPerformed

    private void rdbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFemaleActionPerformed
        if (rdbFemale.isSelected()) {
            rdbMale.setSelected(false);
        }
    }//GEN-LAST:event_rdbFemaleActionPerformed

    private void txtAddressInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressInputMouseClicked
        txtAddressInput.setText("");
    }//GEN-LAST:event_txtAddressInputMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String id = txtIDNumberInput.getText();
        String name = txtNameInput.getText();
        String last = txtLastNameInput.getText();
        String email = txtEmailInput.getText();
        String password = String.valueOf(txtPasswordInput.getPassword());
        String address = txtAddressInput.getText();
        String date = new NewPerson().getDate(dcBirthdate.getDate()), sex;
        if (rdbMale.isSelected()) {
            sex = "M";
        } else {
            sex = "F";
        }
        try {
            if (userValidation.isWorker(txtEmailInput.getText())) {
                ArrayList<String> l = new ArrayList<>();
                l.add(id);
                l.add(name);
                l.add(last);
                l.add(date);
                l.add(email);
                l.add(password);
                l.add(sex);
                l.add(address);                            
                NewWorkerGUI w = new NewWorkerGUI();
                w.setVisible(true);
                w.setWorkerAttributes(l);
                this.dispose();
            } else {
                new NewPerson().createUser(id, name, last, date, email, password,
                        sex, address);
                this.setVisible(false);
                new NewPerson().goBack();
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.err.println(a);
            JOptionPane.showMessageDialog(
                    new JFrame(), "You have to enter a valid email!",
                    "Dialog", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new NewPerson().goBack();
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNameInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameInputMouseClicked
        txtNameInput.setText("");
    }//GEN-LAST:event_txtNameInputMouseClicked

    private void txtNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameInputActionPerformed

    }//GEN-LAST:event_txtNameInputActionPerformed

    private void chbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbShowPasswordActionPerformed
        if (chbShowPassword.isSelected()) {
            txtPasswordInput.setEchoChar((char) 0);
        } else {
            txtPasswordInput.setEchoChar('*');
        }
    }//GEN-LAST:event_chbShowPasswordActionPerformed

    private void txtLastNameInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNameInputMouseClicked
        txtLastNameInput.setText("");
    }//GEN-LAST:event_txtLastNameInputMouseClicked

    private void dcBirthdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcBirthdateMouseClicked

    }//GEN-LAST:event_dcBirthdateMouseClicked

    private void txtEmailInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailInputMouseClicked
        txtEmailInput.setText("");
    }//GEN-LAST:event_txtEmailInputMouseClicked

    private void txtPasswordInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordInputMouseClicked
        txtPasswordInput.setText("");
    }//GEN-LAST:event_txtPasswordInputMouseClicked

    private void txtIDNumberInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDNumberInputMouseClicked
        txtIDNumberInput.setText("");
    }//GEN-LAST:event_txtIDNumberInputMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPersonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JCheckBox chbShowPassword;
    private com.toedter.calendar.JDateChooser dcBirthdate;
    private javax.swing.JLabel lblAdvise;
    private javax.swing.JLabel lblAirplaneTitle;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTextField txtAddressInput;
    private javax.swing.JTextField txtEmailInput;
    private javax.swing.JTextField txtIDNumberInput;
    private javax.swing.JTextField txtLastNameInput;
    private javax.swing.JTextField txtNameInput;
    private javax.swing.JPasswordField txtPasswordInput;
    // End of variables declaration//GEN-END:variables
}
