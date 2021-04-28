package airlineapp.Tickets;

import airlineapp.StartWindowGUI;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import airlineapp.Login.Logout;

public class hiloTickets implements Runnable {

    private int unMinuto = 60000; //Valor de un minuto en milisegundos
    private int minutos = 1 * unMinuto; //Valor que va a durar la compra
    private boolean respuesta = true;

    public JFrame openedWindow;

    public hiloTickets(JFrame openedWindow) {
        this.openedWindow = openedWindow;
    }

    @Override
    public void run() {
        int opcion = 0;
        do {
            try {
                sleep(unMinuto);

            } catch (InterruptedException e) {

            }
            opcion = JOptionPane.showConfirmDialog(
                    null, "Do you want more time?", "Time Out", 1);
            if (opcion == 0) {
                respuesta = true;
            } else {
                respuesta = false;
            }
        } while (respuesta == true);
        Logout.logOut(this.openedWindow);
    }
}
