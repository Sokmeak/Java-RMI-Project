
import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object in the RMI registry
            Hello stub = (Hello) Naming.lookup("rmi://192.168.16.87/MyService");
            
            // Call a method on the remote object
            System.out.println(stub.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
