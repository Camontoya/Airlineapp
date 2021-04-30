package airlineapp.Tickets;

import airlineapp.StartWindowGUI;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import airlineapp.Login.Logout;

public class hiloTickets implements Runnable{

    private int unMinuto = 60000; //Valor de un minuto en milisegundos
    private int minutos = 1 * unMinuto; //Valor que va a durar la compra
    private boolean respuesta = true;

    public JFrame openedWindow;

    public hiloTickets(JFrame openedWindow) {
        this.openedWindow = openedWindow;
    }

   
    public void stop() {
        this.respuesta = false;
    }
    @Override
    public void run() {
        int opcion;
        while (respuesta) {
            try {
                sleep(unMinuto );

            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Ërror");

            }
            
                    
            opcion = JOptionPane.showConfirmDialog(
                    null, "Do you want more time?", "Time Out", 1);
            if (opcion == 0) {
                respuesta = true;
            } else {
                respuesta = false;
                Logout.logOut(this.openedWindow);
                
                
               
            }
        } 
       
        
        
    }
    void start() {
        new Thread(this).start();
    }
}
