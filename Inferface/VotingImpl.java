package Inferface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class VotingImpl extends UnicastRemoteObject implements Voting{
    private Map<String, Integer> candidates;
    private static final AtomicInteger clientCount = new AtomicInteger(0);
    private static final HashMap<Integer, String> clientVotes = new HashMap<>();
    public VotingImpl() throws RemoteException {
        super();
        candidates = new HashMap<>();
        candidates.put("Alice", 0);
        candidates.put("Bob", 0);
        candidates.put("Charlie", 0);
        candidates.put("John", 0);
        candidates.put("Devid", 0);  
    }
    @Override
    public String[] getCandidates() throws RemoteException {
        return candidates.keySet().toArray(new String[0]);
    
    }
    @Override
    public String vote(String candidateName) throws RemoteException {
        int clientId = clientCount.incrementAndGet(); // Increment the client count
        if (candidates.containsKey(candidateName)) {
            candidates.put(candidateName, candidates.get(candidateName) + 1);
            clientVotes.put(clientId, candidateName); // Record the vote
            System.out.println("Client " + clientId + " has voted for " + candidateName);
            return "Vote cast successfully for " + candidateName;
        } else {
            return "Candidate not found!";
        }
    }
    @Override
    public Map<String, Integer> getVotingResults() throws RemoteException {
       return candidates;
    }

    @Override
    public int registerClient(String clientInfo) throws RemoteException {
        int clientId = clientCount.incrementAndGet();
        System.out.println("Client " + clientId + " connected: " + clientInfo);
        return clientId;
    }  
    @Override
    public HashMap<Integer, String> getVotingHistory() throws RemoteException {
        // Return the history of client votes
        return new HashMap<>(clientVotes);
    }

    public int getClientCount(){
        return clientCount.get();
    }

}