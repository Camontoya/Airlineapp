/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineapp.Tickets;

import airlineapp.StartWindowGUI;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

/**
 *
 * @author Caro Montoya
 */
public class hiloTickets implements Runnable {

    private int unMinuto = 60000; //Valor de un minuto en milisegundos
    private int minutos = 1 * unMinuto; //Valor que va a durar la compra
    private boolean respuesta = true;

    public hiloTickets() {

    }

    @Override
    public void run() {
        int opcion = 0;
        do {
            System.out.println("contador" + opcion);
            try {
                sleep(unMinuto);

            } catch (InterruptedException e) {

            }
            System.out.println("contador antes" + opcion);
            opcion = JOptionPane.showConfirmDialog(null, "Do you want more time?", "Time Out", 1);
            System.out.println("contador despues" + opcion);
            if (opcion == 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } while (respuesta == true);
       new StartWindowGUI().setVisible(true);
       new TicketsSaleGUI().dispose();//

    }
}
