package airlineapp.Authentication;

import java.sql.SQLException;

public interface iAuthentication {
    public String generateSecretKeyU(String email) throws SQLException;   
    public String generateSecretKeyW(String email) throws SQLException;   
}
