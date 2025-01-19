package Inferface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class VotingImpl extends UnicastRemoteObject implements Voting{

    
    private Map<String, Integer> candidates;

   
    public VotingImpl() throws RemoteException {
        super();
        candidates = new HashMap<>();
        candidates.put("Alice", 0);
        candidates.put("Bob", 0);
        candidates.put("Charlie", 0);
       
    }

    @Override
    public String[] getCandidates() throws RemoteException {
        return candidates.keySet().toArray(new String[0]);
       
    }

    @Override
    public String vote(String candidateName) throws RemoteException {
        if (candidates.containsKey(candidateName)) {
            candidates.put(candidateName, candidates.get(candidateName) + 1);
            return "Vote cast successfully for " + candidateName;
        } else {
            return "Candidate not found!";
        }
    }

    @Override
    public Map<String, Integer> getVotingResults() throws RemoteException {
       return candidates;
    }

    
}