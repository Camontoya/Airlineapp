package airlineapp.DBHandling;

import airlineapp.Login.*;
import airlineapp.Registration.Client;
import airlineapp.Registration.Worker;
import airlineapp.Tickets.Tickets;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBManagement {

    public static Connection connectToDB() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/airline", "root", "");
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.err.println(e);
        }
        return conn;
    }

    public static void closeDBConnection(Connection connection) {
        try {
            connection.close();
            System.out.println("DB Connection closed!");
        } catch (SQLException ex) {
            Logger.getLogger(DBManagement.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public static void insertNewUser(Client newClient) {
        Connection conn = connectToDB();
        try {
            CallableStatement statement = conn.prepareCall(
                    "{call CreateUser(?,?,?,?,?,?,?,?)}");
            statement.setObject(1, newClient.getId());
            statement.setObject(2, newClient.getName());
            statement.setObject(3, newClient.getLastName());
            statement.setObject(4, newClient.getBirthday());
            statement.setObject(5, newClient.getEmail());
            statement.setObject(6, newClient.getPassword());
            statement.setString(7, newClient.getSex());
            statement.setObject(8, newClient.getAddress());
            statement.execute();
            statement.close();
            System.out.println("New User Created!");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            closeDBConnection(conn);
        }
    }

    public static void insertNewWorker(Worker newWorker) {
        Connection conn = connectToDB();
        try {
            CallableStatement statement = conn.prepareCall(
                    "{call CreateWorker(?,?,?,?,?,?,?,?,?)}");
            statement.setObject(1, newWorker.getId());
            statement.setObject(2, newWorker.getName());
            statement.setObject(3, newWorker.getLastName());
            statement.setObject(4, newWorker.getBirthday());
            statement.setObject(5, newWorker.getEmail());
            statement.setObject(6, newWorker.getPassword());
            statement.setString(7, newWorker.getSex());
            statement.setObject(8, newWorker.getAddress());
            statement.setObject(9, newWorker.getAdminAcces());
            statement.execute();
            statement.close();
            System.out.println("New Worker created!");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            closeDBConnection(conn);
        }
    }

    public static void deleteWorker(String id) {
        Connection conn = connectToDB();
        try {
            CallableStatement statement = conn.prepareCall(
                    "{call DeleteWorker(?)}");
            statement.setObject(1, id);
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            closeDBConnection(conn);
        }
    }

    public static void updateWorker(String id, String name, String last,
            String email, String date, String sex, String address) {
        Connection conn = connectToDB();
        try {
            CallableStatement statement = conn.prepareCall(
                    "{call UpdateWorkerInfo(?,?,?,?,?,?,?)}");
            statement.setObject(1, id);
            statement.setObject(2, name);
            statement.setObject(3, last);
            statement.setObject(4, email);
            statement.setObject(5, date);
            statement.setObject(6, sex);
            statement.setObject(7, address);
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            closeDBConnection(conn);
        }
    }

    public static CallableStatement workerRetrieve(String IDParamenter)
            throws SQLException {
        Connection conn = connectToDB();
        CallableStatement statement
                = conn.prepareCall("{call WorkerRetrieve(?,?,?,?,?,?)}");
        try {
            statement.setObject(1, IDParamenter);
            statement.registerOutParameter(2, Types.VARCHAR);
            statement.registerOutParameter(3, Types.VARCHAR);
            statement.registerOutParameter(4, Types.VARCHAR);
            statement.registerOutParameter(5, Types.VARCHAR);
            statement.registerOutParameter(6, Types.VARCHAR);
            statement.executeUpdate();
            return statement;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
    public static CallableStatement workerRetrieveID(String id) {
        Connection conn = connectToDB();
        try {
            CallableStatement statement
                    = conn.prepareCall("{call WorkerRetrieveID(?,?,?,?,?)}");
            statement.setObject(1, id);
            statement.registerOutParameter(2, Types.VARCHAR);
            statement.registerOutParameter(3, Types.VARCHAR);
            statement.registerOutParameter(4, Types.VARCHAR);
            statement.registerOutParameter(5, Types.VARCHAR);
            statement.executeUpdate();
            return statement;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "There was a problem with the "
                    + "server try later!");
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static CallableStatement userRetrieve(String emailParamenter)
            throws SQLException {
        Connection conn = connectToDB();
        CallableStatement statement
                = conn.prepareCall("{call UserRetrieve(?,?,?,?)}");
        try {
            statement.setString(1, emailParamenter);
            statement.registerOutParameter(2, Types.VARCHAR);
            statement.registerOutParameter(3, Types.VARCHAR);
            statement.registerOutParameter(4, Types.VARCHAR);
            statement.executeUpdate();
            return statement;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

    public static boolean loginUser(String email, String password) {
        Connection conn = connectToDB();
        CallableStatement statement = null;
        try {
            statement = conn.prepareCall("{call LoginUser(?,?,?,?)}");
            statement.setString(1, email);
            statement.setString(2, password);
            statement.registerOutParameter(3, Types.VARCHAR);
            statement.registerOutParameter(4, Types.VARCHAR);
            statement.executeUpdate();
            if (thereAreOutputsU(statement)) {
                setLoginUAttributes(statement);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBManagement.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            closeDBConnection(conn);
        }
        return false;
    }

    public static boolean loginWorker(
            String email, String password) {
        Connection conn = connectToDB();
        CallableStatement statement = null;
        try {
            statement = conn.prepareCall("call LoginWorker(?,?,?,?,?)");
            statement.setString(1, email);
            statement.setString(2, password);
            statement.registerOutParameter(3, Types.VARCHAR);
            statement.registerOutParameter(4, Types.VARCHAR);
            statement.registerOutParameter(5, Types.VARCHAR);
            statement.executeUpdate();
            if (thereAreOutputsW(statement)) {
                setLoginWAttributes(statement);
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            closeDBConnection(conn);
        }
        return false;
    }

    public static void setLoginUAttributes(CallableStatement statement) {
        try {
            LoginSession.name = statement.getObject("out_name").toString();
            LoginSession.email = statement.getObject("out_email").toString();
            LoginSession.isLoggedIn = true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManagement.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public static void setLoginWAttributes(CallableStatement statement) {
        try {
            LoginSession.name = statement.getObject("out_name").toString();
            LoginSession.email = statement.getObject("out_email").toString();
            LoginSession.access = Integer.parseInt(statement
                    .getObject("out_access").toString());
            LoginSession.isLoggedIn = true;
        } catch (SQLException ex) {
            Logger.getLogger(DBManagement.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public static boolean thereAreOutputsU(CallableStatement statement) {
        try {
            if (statement.getObject("out_name") != null
                    && statement.getObject("out_email") != null) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBManagement.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean thereAreOutputsW(CallableStatement statement) {
        try {
            if (statement.getObject("out_name") != null
                    && statement.getObject("out_email") != null) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBManagement.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void saveBook(Tickets book) {
        try {
            CallableStatement statement = connectToDB().prepareCall(
                    "{call SaveBook(?,?,?,?,?,?,?,?,?)}");
            statement.setObject(1, book.getId());
            statement.setObject(2, book.getDate());
            statement.setObject(3, book.getSource());
            statement.setObject(4, book.getDestination());
            statement.setObject(5, book.getDepTime());
            statement.setObject(6, book.getArrTime());
            statement.setString(7, book.getfClass());
            statement.setObject(8, book.getPassengers());
            statement.setObject(9, book.getOwner());
            statement.execute();
            statement.close();
            System.out.println("Book saved!");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static CallableStatement RetrieveBook(String ID) throws SQLException {
        Connection conn = connectToDB();
        CallableStatement statement
                = conn.prepareCall("{call RetrieveBook(?,?,?,?)}");
        try {
            statement.setString(1, ID);
            statement.registerOutParameter(2, Types.VARCHAR);
            statement.registerOutParameter(3, Types.VARCHAR);
            statement.registerOutParameter(4, Types.VARCHAR);
            statement.executeUpdate();
            return statement;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}
