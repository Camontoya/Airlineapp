package airlineapp.Tickets;

import airlineapp.StartWindowGUI;
import airlineapp.Authentication.userValidation;
import airlineapp.ClientMenu.ClientMenuGUI;
import airlineapp.Login.LoginSession;
import airlineapp.Registration.NewPerson;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicketsSaleGUI extends javax.swing.JFrame {
    
    private hiloTickets hilo = new hiloTickets(this);
    private ExecutorService service;
    public TicketsSaleGUI() {
        initComponents();
        this.setTitle("Buy tickets!");
        this.setLocationRelativeTo(null);
        service = Executors.newFixedThreadPool(1);
        service.submit(hilo);
    }
    
    public String ownerVerification(String owner){
        String currentUser = LoginSession.email;
        System.out.println(owner);
        if (owner.equals("Ticket owner")){
            return currentUser;
        } else {
            return owner;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jdcDateDeparture = new com.toedter.calendar.JDateChooser();
        lblDateOfDeparture = new javax.swing.JLabel();
        lblSource = new javax.swing.JLabel();
        cbxSource = new javax.swing.JComboBox<>();
        lblDestination = new javax.swing.JLabel();
        cbxDestination = new javax.swing.JComboBox<>();
        lblDepartureTime = new javax.swing.JLabel();
        cbxDepartureTime = new javax.swing.JComboBox<>();
        lblArrivalTime = new javax.swing.JLabel();
        cbxArrivalTime = new javax.swing.JComboBox<>();
        lblFlightClass = new javax.swing.JLabel();
        cbxFlightClass = new javax.swing.JComboBox<>();
        lblPassengers = new javax.swing.JLabel();
        txtPassengers = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        lblOwner = new javax.swing.JLabel();
        txtTicketOwner = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("Tickets Reservation");
        lblTitle.setToolTipText("");
        lblTitle.setName("lblTitle"); // NOI18N

        jdcDateDeparture.setName("jdcDateDeparture"); // NOI18N

        lblDateOfDeparture.setText("Date of Departure");
        lblDateOfDeparture.setName("lblDateOfDeparture"); // NOI18N

        lblSource.setText("Source");
        lblSource.setName("lblSource"); // NOI18N

        cbxSource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USA", "Mexico", "Panama", "Colombia", "Costa Rica" }));
        cbxSource.setName("cbxSource"); // NOI18N
        cbxSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSourceActionPerformed(evt);
            }
        });

        lblDestination.setText("Destination");
        lblDestination.setName("lblDestination"); // NOI18N

        cbxDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USA", "Mexico", "Panama", "Colombia", "Costa Rica" }));
        cbxDestination.setName("cbxDestination"); // NOI18N

        lblDepartureTime.setText("Departure Time");
        lblDepartureTime.setName("lblDepartureTime"); // NOI18N

        cbxDepartureTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        cbxDepartureTime.setName("cbxDepartureTime"); // NOI18N
        cbxDepartureTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDepartureTimeActionPerformed(evt);
            }
        });

        lblArrivalTime.setText("Arrival Time");
        lblArrivalTime.setName("lblArrivalTime"); // NOI18N

        cbxArrivalTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        cbxArrivalTime.setName("cbxArrivalTime"); // NOI18N
        cbxArrivalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxArrivalTimeActionPerformed(evt);
            }
        });

        lblFlightClass.setText("Flight Class");
        lblFlightClass.setName("lblFlightClass"); // NOI18N

        cbxFlightClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Class", "Economy Class", "Business Class" }));
        cbxFlightClass.setName("cbxFlightClass"); // NOI18N

        lblPassengers.setText("Passengers");
        lblPassengers.setName("lblPassengers"); // NOI18N

        txtPassengers.setName("txtPassengers"); // NOI18N

        btnCancel.setText("Cancel");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnBook.setText("Book");
        btnBook.setName("btnBook"); // NOI18N
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        lblOwner.setText("Owner");
        lblOwner.setName("lblPassengers"); // NOI18N

        txtTicketOwner.setText("Ticket owner");
        txtTicketOwner.setName("txtPassengers"); // NOI18N
        txtTicketOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketOwnerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFlightClass, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxFlightClass, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPassengers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDateOfDeparture, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcDateDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTicketOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(cbxArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSource, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxSource, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cbxSource)
                    .addComponent(lblDepartureTime, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cbxDepartureTime))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestination, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cbxDestination)
                    .addComponent(lblArrivalTime, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cbxArrivalTime))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFlightClass, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cbxFlightClass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDateOfDeparture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdcDateDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassengers, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txtPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txtTicketOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnBook))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSourceActionPerformed
        
    }//GEN-LAST:event_cbxSourceActionPerformed

    private void cbxDepartureTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDepartureTimeActionPerformed
        
    }//GEN-LAST:event_cbxDepartureTimeActionPerformed

    private void cbxArrivalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxArrivalTimeActionPerformed
        
    }//GEN-LAST:event_cbxArrivalTimeActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        String id = new TicketsSale().getRandomString();
        String date = new NewPerson().getDate(jdcDateDeparture.getDate());
        String source = cbxSource.getSelectedItem().toString();
        String destination = cbxDestination.getSelectedItem().toString();
        String depTime = cbxDepartureTime.getSelectedItem().toString();
        String arrTime = cbxArrivalTime.getSelectedItem().toString();
        String fClass = cbxFlightClass.getSelectedItem().toString();
        if(Integer.parseInt(txtPassengers.getText()) == 0){
            JOptionPane.showMessageDialog(null, "The minimun number of passenger is 1", "Incorrect Number", 0);
        }else { 
        String passengers = txtPassengers.getText();
        String owner = ownerVerification(txtTicketOwner.getText());
        try {
            Tickets newTicket = new TicketsSale().saveTicket(
                id, date, source, destination, depTime, arrTime, fClass, passengers, owner);
            new ConfirmationPageGUI().rellenarDatos(newTicket);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.err.println(a);
            JOptionPane.showMessageDialog(
                new JFrame(), "Error booking, try later!",
                "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if(new userValidation().isWorker(new LoginSession().email)) {
            new StartWindowGUI().setVisible(true);
            this.dispose();
        } else {
            new ClientMenuGUI().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtTicketOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketOwnerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketsSaleGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cbxArrivalTime;
    private javax.swing.JComboBox<String> cbxDepartureTime;
    private javax.swing.JComboBox<String> cbxDestination;
    private javax.swing.JComboBox<String> cbxFlightClass;
    private javax.swing.JComboBox<String> cbxSource;
    private com.toedter.calendar.JDateChooser jdcDateDeparture;
    private javax.swing.JLabel lblArrivalTime;
    private javax.swing.JLabel lblDateOfDeparture;
    private javax.swing.JLabel lblDepartureTime;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblFlightClass;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblPassengers;
    private javax.swing.JLabel lblSource;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtPassengers;
    private javax.swing.JTextField txtTicketOwner;
    // End of variables declaration//GEN-END:variables
}
