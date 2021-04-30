package airlineapp.Login;

import javax.swing.JOptionPane;


public class LoginSession implements Runnable {
    public static String name;
    public static String email;
    public static int access;
    public static boolean isLoggedIn = false;    

    @Override
    public void run() {
       int message;
       int cont = 0 ;
        
       while(isLoggedIn == true){
           
         try {  
             
              cont++;
              
          if(cont > 3000){
              message = JOptionPane.showConfirmDialog(null, "Are you there?", null,JOptionPane.YES_NO_OPTION);
              if(message == JOptionPane.YES_OPTION){
                  cont = 0;
                  
              }else{
                 Login l = new Login();
                 l.goBack();
              }
                 Thread.sleep(1000);
           }
       } catch (InterruptedException ex) {
             System.err.println("An error has ocurred");
         }
       }
    }
    
    public void start(){
        new Thread(this).start();
    }

}
