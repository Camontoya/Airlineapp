package airlineapp.Login;

import airlineapp.StartWindowGUI;
import javax.swing.JFrame;

public class Logout {
    public static void logOut(JFrame context){
        LoginSession.isLoggedIn = false;
        LoginSession.name = null;
        LoginSession.email = null;
        new StartWindowGUI().setVisible(true);
        context.dispose();
    }
}
