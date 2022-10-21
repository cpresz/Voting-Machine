import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

/**
 * This class consists of a single static method that reads
 * a ballot from an input file.
 */

public class BallotReader {
	/**
	 * This method reads information from an input file.
	 * New candidates are created from the file and added to the ballot
	 * by calling addCandidate.
	 * @param filename the name of the file to read from.
	 * @return a Ballot object ballot.
	 * @throws IOException
	 */
	public static Ballot readBallot(String filename) throws IOException {
		File fBallot = new File(filename);
		Scanner scnr = new Scanner(fBallot);
		ArrayList<String> lines = new ArrayList<String>();
		while(scnr.hasNextLine()) {
			lines.add(scnr.nextLine());
		}
		scnr.close();
		
		// create a new ballot
		Ballot ballot = new Ballot(lines.get(0));
		
		// create new candidates from the input file, add them to the ballot
		for(int i = 2; i < lines.size(); i ++) {
			String[] info = lines.get(i).split(";");
			Candidate c = new Candidate(info[0], info[1]);
			ballot.addCandidate(c);
		}

		return ballot;
	}
	
}

		
		
		
		
		
		
		
