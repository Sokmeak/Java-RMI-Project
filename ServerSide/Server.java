package ServerSide;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import Inferface.VotingImpl;

public class Server {
    public static void main(String[] args) {
        
        try {
            VotingImpl votingService = new VotingImpl();
              LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://192.168.1.72/VotingService", votingService);

            System.out.println("Voting Server is running...");
            
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
