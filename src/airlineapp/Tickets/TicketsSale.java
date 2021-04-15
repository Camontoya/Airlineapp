package airlineapp.Tickets;

import airlineapp.DBHandling.DBManagement;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicketsSale {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 6;
    
    public Tickets saveTicket(
            String id, String date, String source, String destination, String depTime, 
            String arrTime, String fClass, String passengers, String owner) {
        try {
            Tickets t = new Tickets(
                    id, date, source, destination, depTime, arrTime, fClass,
                    passengers, owner);
            new DBManagement().saveBook(t);
            //JOptionPane.showMessageDialog(null, "Booked!");
            return t;
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(
                    new JFrame(), "There is a problem with the server, try it later.",
                    "Dialog", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public String getRandomString() {
        Random random = new Random();
        String randomString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return randomString;
    }
}
