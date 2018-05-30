
import java.util.ArrayList;



public class ElectionObject {

	
		private ArrayList<Candidate> listCandidate = new ArrayList<Candidate>();
		
		public void add(Candidate candidate) {
			listCandidate.add(candidate);
		}
		
		public void results() {
			int maxValue = 0;
			int counter = 0;
			for(Candidate candidate: listCandidate) {
				if(maxValue<candidate.getVotes()) {
					maxValue = candidate.getVotes();
				}
			}		
			for(Candidate candidate: listCandidate) {
				if(candidate.getVotes()== maxValue) {
					counter++;
			}
			}
			if(counter>1) {
				System.out.print("\nThe election is a tie between the following candidates: ");
			}
			for(Candidate candidate: listCandidate) {
				if(candidate.getVotes()== maxValue) {
					if(counter > 1) {
						
						System.out.print("\n " + candidate.getName() + " " + " " + "(" + maxValue + " votes) ");
					}else if(counter < 2) {
						
						System.out.print("\nThe winner is " + candidate.getName() + " with " + maxValue + " votes!");
					}
			}
		}
	}
		
}
