package airlineapp.Authentication;

import airlineapp.DBHandling.DBManagement;

public class userValidation {
    
    static public boolean isWorker(String email){
        String domain = email.split("@")[1];
        return domain.equals("airlineapp.com");
    }
    
    public static boolean isLogin(String email, String password){
        try{
            DBManagement.loginUser(email, password);
        }catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
}
