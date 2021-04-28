package airlineapp.EmployeeManagement;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import airlineapp.DBHandling.DBManagement;
import java.sql.Connection;

public class Connector {

    ServerSocket server = null;
    Socket sc = null;
    DataInputStream in;
    DataOutputStream out;
    Connection conn = null;

    protected int port = 3000;

    public void connectingDB() throws IOException {
        server = new ServerSocket(port);
        conn = DBManagement.connectToDB();
        sc = server.accept();

        in = new DataInputStream(sc.getInputStream());
        out = new DataOutputStream(sc.getOutputStream());

        if (conn != null) {
            out.writeUTF("DB available!");
        } else {
            out.writeUTF("There was a problem with the DB.");
        }

        sc.close();
        System.out.println("Client Disconnected");

    }
}
