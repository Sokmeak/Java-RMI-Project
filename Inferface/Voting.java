package Inferface;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface Voting extends Remote{
     String [] getCandidates() throws RemoteException;
     String vote(String candidateName) throws RemoteException;
     Map <String , Integer> getVotingResults() throws RemoteException;
}