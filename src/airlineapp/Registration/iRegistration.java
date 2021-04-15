package airlineapp.Registration;

import java.sql.SQLException;

public interface iRegistration {
    public String generateSecretKeyNewUser(
            String email, String name, String last) throws SQLException;
}
