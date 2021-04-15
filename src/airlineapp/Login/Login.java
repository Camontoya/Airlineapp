package airlineapp.Login;

import airlineapp.DBHandling.DBManagement;
import airlineapp.DBHandling.Encryptation;
import airlineapp.ClientMenu.ClientMenuGUI;
import airlineapp.EmployeeManagement.AdministratorGUI;
import airlineapp.StartWindowGUI;
import airlineapp.Tickets.TicketsSaleGUI;
import airlineapp.iWindows;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login implements iWindows {
    public void verifyUser(String email, String password) {
        Encryptation e = new Encryptation();
        String encryptedPassword = e.generateEncryptedPassword(email, password);
        if (DBManagement.loginUser(email, encryptedPassword)) {
            new ClientMenuGUI().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "The user email or password are incorrect!");
        }
    }
    
    public void verifyWorker(String email, String password){
        Encryptation e = new Encryptation();
        String encryptedPassword = e.generateEncryptedPassword(email, password);
        if (DBManagement.loginWorker(email, encryptedPassword)) {
            try {
                System.out.println(isAdmin(DBManagement.workerRetrieve(email)));
                if (isAdmin(DBManagement.workerRetrieve(email))){
                    System.out.println("Entre como admin");
                    new AdministratorGUI().setVisible(true);
                } else {
                    System.out.println("Entre como vendor");
                    new TicketsSaleGUI().setVisible(true);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "The user email or password are incorrect!");
        }
    }
    
    public boolean isAdmin(CallableStatement st) throws SQLException{
        System.out.println(st.getObject("out_admin_access"));
        return st.getObject("out_admin_access").toString().equals("0");
    }

    @Override
    public void goBack() {
        new StartWindowGUI().dispose();
    }
}