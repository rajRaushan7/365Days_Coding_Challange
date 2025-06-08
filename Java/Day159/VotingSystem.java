import java.util.*;

class Candidate {
    String name;
    int voteCount;

    public Candidate(String name) {
        this.name = name;
        this.voteCount = 0;
    }

    public void addVote() {
        voteCount++;
    }
}

public class VotingSystem {
    private Map<String, Candidate> candidates;

    public VotingSystem() {
        candidates = new HashMap<>();
    }

    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, new Candidate(name));
            System.out.println("Candidate " + name + " added.");
        } else {
            System.out.println("Candidate already exists: " + name);
        }
    }

    public void castVote(String name) {
        Candidate candidate = candidates.get(name);
        if (candidate != null) {
            candidate.addVote();
            System.out.println("Voted for " + name + ".");
        } else {
            System.out.println("Candidate not found: " + name);
        }
    }

    public void displayVotes() {
        System.out.println("Vote Counts:");
        for (Candidate c : candidates.values()) {
            System.out.println(c.name + ": " + c.voteCount);
        }
    }

    public void displayWinner() {
        Candidate winner = null;
        for (Candidate c : candidates.values()) {
            if (winner == null || c.voteCount > winner.voteCount) {
                winner = c;
            }
        }
        if (winner != null) {
            System.out.println("Winner: " + winner.name + " with " + winner.voteCount + " votes");
        } else {
            System.out.println("No votes cast yet.");
        }
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.addCandidate("Alice");
        vs.addCandidate("Bob");
        vs.castVote("Alice");
        vs.castVote("Bob");
        vs.castVote("Alice");
        vs.castVote("Carol");
        vs.displayVotes();
        vs.displayWinner();
    }
}