package airlineapp.Registration;

import airlineapp.DBHandling.DBManagement;
import airlineapp.DBHandling.Encryptation;
import airlineapp.StartWindowGUI;
import airlineapp.iWindows;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewPerson implements iWindows, iRegistration{

    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");

    public String getDate(Date dateInput) {
        String date = null;
        try {
            date = dFormat.format(dateInput);
            return date;
        } catch (NullPointerException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(
                    new JFrame(), "You have to enter a birth date!",
                    "Dialog", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    @Override
    public void goBack(){
        new StartWindowGUI().setVisible(true);
    }
    
    @Override
    public String generateSecretKeyNewUser(
            String uID, String uName, String uLast) throws SQLException {
        return "" + uID.charAt(0) + uName.charAt(0) + uLast.charAt(0);
    }
    
    public void createUser(
            String id, String name, String last, String date,
            String email, String password, String sex, String address) {
        try {
            Encryptation e = new Encryptation();
            String secretKey = generateSecretKeyNewUser(id, name, last);
            String encryptedPassword = e.encrypt(password, secretKey);

            Client c = new Client(
                    id, name, last, date, email, encryptedPassword, sex, address
            );
            new DBManagement().insertNewUser(c);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    new JFrame(), "There is a problem with the server, try it later.",
                    "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "User created successfully!");
    }
}
