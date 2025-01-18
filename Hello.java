
import java.rmi.Remote;
import java.rmi.RemoteException;

// Define a remote interface
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
