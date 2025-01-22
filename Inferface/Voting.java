package Inferface;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

public interface Voting extends Remote{
     String [] getCandidates() throws RemoteException;
     String vote(String candidateName) throws RemoteException;
     Map <String , Integer> getVotingResults() throws RemoteException;
     int registerClient(String clientInfo) throws RemoteException;
     // Get voting history (client ID and their votes)
    HashMap<Integer, String> getVotingHistory() throws RemoteException;

     
}