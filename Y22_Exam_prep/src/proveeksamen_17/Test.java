package proveeksamen_17;

import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    new Test().go();
  }
  
  public void go() {
    Election election = new Election();
    
    // candidates
    election.addCandidate(new Candidate("Joe B", Party.B, 10));
    election.addCandidate(new Candidate("Joe R", Party.R, 20));
    election.addCandidate(new Candidate("Jens B", Party.B, 10));
    election.addCandidate(new Candidate("Jens R", Party.R, 20));
    
    ArrayList<Candidate> partyCandidates = election.getCandidatesFromParty(Party.B);
    System.out.println(election.getCandidatesFromParty(Party.B));
  }
}
