package airlineapp.ClientMenu;

import airlineapp.Login.Logout;
import airlineapp.Tickets.ConfirmationPageGUI;
import airlineapp.Tickets.TicketsSaleGUI;
import javax.swing.JOptionPane;

public class ClientMenuGUI extends javax.swing.JFrame {
    public ClientMenuGUI() {
        initComponents();
        this.setTitle("Menu!");
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAirplaneTitle = new javax.swing.JLabel();
        btnFlights = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAirplaneTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAirplaneTitle.setText("Client Menu");
        lblAirplaneTitle.setName("lblAirplaneTitle"); // NOI18N

        btnFlights.setText("Book Flight");
        btnFlights.setName("btnFlights"); // NOI18N
        btnFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightsActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setName("btnExit"); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
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
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblAirplaneTitle)
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblAirplaneTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnFlights)
                .addGap(27, 27, 27)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        new Logout().logOut(this);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightsActionPerformed
        int contador = 0;
        
        if (contador == 0){
            new TicketsSaleGUI().setVisible(true);
            this.setVisible(false);
            contador++;
        }else {
            JOptionPane.showMessageDialog(null, "You already booked", "Information",1);
            new ConfirmationPageGUI().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnFlightsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFlights;
    private javax.swing.JLabel lblAirplaneTitle;
    // End of variables declaration//GEN-END:variables
}
