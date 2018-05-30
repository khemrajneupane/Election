

public class Candidate {
	private String name;
	private int vote;
	
	public Candidate() {
		
	}
	
	public Candidate(String name, int vote) {
		this.name = name;
		this.vote = vote;
	}
	
	public String getName() {
		return name;
	}
	public int getVotes() {
		return vote;
	}
	public void setVotes(int vote) {
		this.vote = vote;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
