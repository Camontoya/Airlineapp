package airlineapp.Tickets;

import airlineapp.ClientMenu.ClientMenuGUI;

public class ConfirmationPageGUI extends javax.swing.JFrame {
    private double price,taxes,total;    
    public ConfirmationPageGUI() {
        
        initComponents();
        this.setTitle("Purchase");
        this.setLocationRelativeTo(null);
    }
    
    public void rellenarDatos(Tickets t){
        String source = t.getSource();
        String destination = t.getDestination();
        int numberpass = Integer.parseInt(t.getPassengers());
        
        
        this.setVisible(true);
        jftiID.setText(t.getId());
        jftDate.setText(t.getDate());
        jftSource.setText(t.getSource());
        jftDestination.setText(t.getDestination());
        jftDeparture.setText(t.getDepTime());
        jftArrTime.setText(t.getArrTime());
        jftFClass.setText(t.getfClass());
        jftPassengers.setText(t.getPassengers());
        jftOwner.setText(t.getOwner());
        
        if (source == "USA" && destination == "Panama"){
            price = 300;
            price = price * numberpass;
            taxes = getTaxes(price);
            total = price + taxes;
            
            
            jTxtSubTotal.setText("$" + price);
            jTxtTaxes.setText("$" + taxes);
            jTxtTotal.setText("$" + total);

            
        }else if (source == "USA" && destination == "Colombia") {
            price = 350;
            price = price * numberpass;
            taxes = getTaxes(price);
            total = price + taxes;
            
            jTxtSubTotal.setText("$" + price);
            jTxtTaxes.setText("$" + taxes);
            jTxtTotal.setText("$" + total);

        }else if (source == "USA" && destination == "Mexico") {
            price = 200;
            price = price * numberpass;
            taxes = getTaxes(price);
            total = price + taxes;
            
            jTxtSubTotal.setText("$" + price);
            jTxtTaxes.setText("$" + taxes);
            jTxtTotal.setText("$" + total);

        }else if (source == "USA" && destination == "Costa Rica") {
            price = 300;
            price = price * numberpass;
            taxes = getTaxes(price);
            total = price + taxes;
            
            jTxtSubTotal.setText("$" + price);
            jTxtTaxes.setText("$" + taxes);
            jTxtTotal.setText("$" + total);

        }else{
            
            price = 250;
            price = price * numberpass;
            taxes = getTaxes(price);
            total = price + taxes;
            
            jTxtSubTotal.setText("$" + price);
            jTxtTaxes.setText("$" + taxes);
            jTxtTotal.setText("$" + total);

        }
        
            
    }
    
    public double getTaxes (double price){
        taxes= price * 0.13;        
        return taxes;
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jftFClass = new javax.swing.JFormattedTextField();
        jftPassengers = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jftiID = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jftDate = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jftSource = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jftDestination = new javax.swing.JFormattedTextField();
        jftDeparture = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jftArrTime = new javax.swing.JFormattedTextField();
        lblOwner = new javax.swing.JLabel();
        jftOwner = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtSubTotal = new javax.swing.JTextField();
        jTxtTaxes = new javax.swing.JTextField();
        jTxtTotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Departure Time");

        jftFClass.setEditable(false);
        jftFClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftFClassActionPerformed(evt);
            }
        });

        jftPassengers.setEditable(false);

        jLabel7.setText("Arrival Time");

        jButton1.setText("Payment Method");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Flight Class");

        jLabel9.setText("Passengers");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ticket Confirmation");

        jftiID.setEditable(false);

        jLabel2.setText("Ticket ID");

        jftDate.setEditable(false);

        jLabel3.setText("Departure Date");

        jftSource.setEditable(false);

        jLabel4.setText("Source City");

        jftDestination.setEditable(false);

        jftDeparture.setEditable(false);

        jLabel5.setText("Destination City");

        jftArrTime.setEditable(false);

        lblOwner.setText("Owner");

        jftOwner.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Price");

        jLabel11.setText("Sub Total");

        jLabel13.setText("Taxes");

        jLabel12.setText("Total");

        jTxtSubTotal.setEditable(false);

        jTxtTaxes.setEditable(false);

        jTxtTotal.setEditable(false);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jftSource, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jftDate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftDestination)
                    .addComponent(jftDeparture)
                    .addComponent(jftArrTime)
                    .addComponent(jftFClass)
                    .addComponent(jftPassengers)
                    .addComponent(jftOwner, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jftiID, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtTaxes)
                            .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOwner))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftArrTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftFClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTxtTaxes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwner))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftFClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftFClassActionPerformed
        
    }//GEN-LAST:event_jftFClassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new PaymentGUI().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      new TicketsSaleGUI().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmationPageGUI().setVisible(true);                
            }
        });        
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtSubTotal;
    private javax.swing.JTextField jTxtTaxes;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JFormattedTextField jftArrTime;
    private javax.swing.JFormattedTextField jftDate;
    private javax.swing.JFormattedTextField jftDeparture;
    private javax.swing.JFormattedTextField jftDestination;
    private javax.swing.JFormattedTextField jftFClass;
    private javax.swing.JFormattedTextField jftOwner;
    private javax.swing.JFormattedTextField jftPassengers;
    private javax.swing.JFormattedTextField jftSource;
    private javax.swing.JFormattedTextField jftiID;
    private javax.swing.JLabel lblOwner;
    // End of variables declaration//GEN-END:variables
}
