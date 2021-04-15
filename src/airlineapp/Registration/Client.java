package airlineapp.Registration;

public class Client extends Person{

    public Client(
            String id, String name, String last_name, String birthday, 
            String email, String password, String sex, String address) {
        super(id, name, last_name, birthday, email, password, sex, address);
    }
}
