package proveeksamen_17;

import java.util.ArrayList;

public class Election {
  ArrayList<Candidate> candidates;
  
  Election() {
    candidates = new ArrayList<>();
    
  }
  
  public void addCandidate(Candidate candidate) {
    candidates.add(candidate);
  }
  
  public int getTotalVotes() {
    int totalVotes = 0;
    
    for (Candidate c : candidates) {
      totalVotes += c.getNumberOfVotes();
    }
    
    return  totalVotes;
  }
  
  public ArrayList<Candidate> getCandidatesFromParty(Party party) {
    ArrayList<Candidate> partyCandidates = new ArrayList<>();
    
    for (Candidate c : candidates) {
      if (c.getParty() == party) partyCandidates.add(c);
    }
    
    return partyCandidates;
  }
}
