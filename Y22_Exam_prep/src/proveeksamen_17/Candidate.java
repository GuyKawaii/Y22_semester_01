package proveeksamen_17;

public class Candidate {
  private String name;
  private Party party;
  private int numberOfVotes;
  
  public Candidate(String name, Party party, int numberOfVotes) {
    setName(name);
    setParty(party);
    setNumberOfVotes(numberOfVotes);
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setNumberOfVotes(int numberOfVotes) {
    this.numberOfVotes = numberOfVotes;
  }
  
  public int getNumberOfVotes() {
    return numberOfVotes;
  }
  
  public void setParty(Party party) {
    this.party = party;
  }
  
  public Party getParty() {
    return party;
  }
  
  @Override
  public String toString() {
    return String.format("%s party: %s - votes: %s", name, party, numberOfVotes);
  }
}
