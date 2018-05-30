
import java.util.ArrayList;

public class ElectionObject {
	
		private ArrayList<Candidate> listCandidate = new ArrayList<Candidate>();
		
		public void add(Candidate candidate) {
			listCandidate.add(candidate);
		}
		
		public void results() {
			int maxValue = 0;
			int counter = 0;
			//iterating through the candidate list array in order to get the maximum value candidate vote.
			for(Candidate candidate: listCandidate) {
				if(maxValue<candidate.getVotes()) {
					maxValue = candidate.getVotes();
				}
			}		//iterating through the candidate list array. This time to get the count(numbers) of the maximum votes.
			for(Candidate candidate: listCandidate) {
				if(candidate.getVotes()== maxValue) {
					counter++;
			}
			}
			//if the counter is more than 1 means, there are more than two equal maximum equal votes.
			if(counter>1) {
				System.out.print("\nThe election is a tie between the following candidates: ");
			}
			for(Candidate candidate: listCandidate) {
				if(candidate.getVotes()== maxValue) {
					if(counter > 1) {
						
						System.out.print("\n " + candidate.getName() + " " + " " + "(" + maxValue + " votes) ");
					}else if(counter < 2) {// if the counter is less than two which means that there is only one occurrence of maximum vote.
						
						System.out.print("\nThe winner is " + candidate.getName() + " with " + maxValue + " votes!");
					}
			}
		}
	}
		
}
