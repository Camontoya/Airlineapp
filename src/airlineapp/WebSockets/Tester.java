package airlineapp.WebSockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Tester implements Runnable{

    protected String host = "127.0.0.1";
    protected int port = 3000;
    DataInputStream in;
    DataOutputStream out;

    public void checkDBAvailability() {
        try {
            Socket sc = new Socket(host, port);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            String message = in.readUTF();
            JOptionPane.showMessageDialog(null, message);
            sc.close();
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void start(){
        new Thread(this).start();
    }
    
    @Override
    public void run() {
       while (true){
           this.checkDBAvailability();
           try{
               System.out.println("Sleeping");
               sleep(1000);
           } catch(Exception e){
           }
       }
    }
}
