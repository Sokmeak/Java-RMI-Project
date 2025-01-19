package ClientSide;

import java.rmi.Naming;
import java.util.Map;
import java.util.Scanner;

import Inferface.Voting;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote service
            Voting voting = (Voting) Naming.lookup("rmi://192.168.1.72/VotingService");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                // Display menu options to the user
                System.out.println("\n--- Online Voting System ---");
                System.out.println("1. View Candidates");
                System.out.println("2. Vote for a Candidate");
                System.out.println("3. View Voting Results");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        // Show list of candidates
                        System.out.println("Candidates:");
                        for (String candidate : voting.getCandidates()) {
                            System.out.println("- " + candidate);
                        }
                        break;

                    case 2:
                        // Prompt user to vote for a candidate
                        System.out.print("Enter the candidate's name to vote for: ");
                        String candidateName = scanner.nextLine();
                        String response = voting.vote(candidateName);
                        System.out.println(response);
                        break;

                    case 3:
                        // Display voting results
                        System.out.println("Current Results:");
                        Map<String, Integer> results = voting.getVotingResults();
                        for (Map.Entry<String, Integer> entry : results.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
                        }
                        break;

                    case 4:
                        // Exit the program
                        System.out.println("Exiting... Thank you for voting!");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
