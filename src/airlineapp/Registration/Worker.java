package airlineapp.Registration;

public class Worker extends Person {
    private String adminAcces;

    public Worker(
            String adminAcces, String id, String name, String last_name, 
            String birthday, String email, String password, String sex, 
            String address) 
    {
        super(id, name, last_name, birthday, email, password, sex, address);
        this.adminAcces = adminAcces;
    }

    public String getAdminAcces() {
        return adminAcces;
    }

    public void setAdminAcces(String adminAcces) {
        this.adminAcces = adminAcces;
    }
    
    public void imprimir(){
        System.out.println("Inside worker child");
    }
}
