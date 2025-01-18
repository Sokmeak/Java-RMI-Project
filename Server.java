import java.rmi.*;
import java.rmi.registry.LocateRegistry;



// Server class
public class Server {
    public static void main(String[] args) {
        try {
            // Create a remote object or sevice
            
            HelloImpl obj = new HelloImpl();
             LocateRegistry.createRegistry(1099);
            // Bind the remote object in the RMI registry
            Naming.rebind("rmi://192.168.16.87/MyService", obj);
            
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
