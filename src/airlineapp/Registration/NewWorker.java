package airlineapp.Registration;

import airlineapp.DBHandling.DBManagement;
import airlineapp.DBHandling.Encryptation;
import airlineapp.StartWindowGUI;
import airlineapp.iWindows;
import javax.swing.JOptionPane;

public class NewWorker implements iWindows {

    public void goBack() {
        new StartWindowGUI().setVisible(true);
    }

    public String generateSecretKeyNewWorker(
            String uID, String uName, String uLast) {
        return "" + uID.charAt(0) + uName.charAt(0) + uLast.charAt(0);
    }

    public void createWorker(
            String id, String name, String last, String date, String email,
            String password, String sex, String address, String access) {
        Encryptation e = new Encryptation();
        String secretKey = generateSecretKeyNewWorker(id, name, last);
        String encryptedPassword = e.encrypt(password, secretKey);
        Worker w = new Worker(access, id, name, last, date, email,
                encryptedPassword, sex, address);
        new DBManagement().insertNewWorker(w);
        JOptionPane.showMessageDialog(null, "Worker created successfully!");

    }
}
