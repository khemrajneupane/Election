
import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {
		
		ElectionObject election = new ElectionObject();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of candidate: ");
		int canNum = input.nextInt();
		//looping through candidate name and voteNumber as long as iteration is less than number ofcandidate.
		int iteration = 0;
		while(iteration<canNum){
			System.out.print("Enter name: ");
			String name = input.next();
			System.out.print("Enter votes: ");
			int voteNum = input.nextInt();
			election.add(new Candidate(name, voteNum));
			iteration++;
		}

		election.results();
		input.close();
	}

}
