package airlineapp;

import airlineapp.Login.LoginGUI;
import airlineapp.Registration.NewPersonGUI;

public class StartWindow {
    public void OpenRegistrationForm(){    
        new NewPersonGUI().setVisible(true);
   }
    public static void OpenLoginForm(){
        new LoginGUI().setVisible(true);
   }
}