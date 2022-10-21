import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * This class contains a single static method that writes
 * election results into an output file. 
 */
public class ResultWriter {
	/**
	 * This method writes to an output file, displaying each
	 * candidate's number of votes and the winner of the election.
	 * @param filename the name of the output file to write to.
	 * @param ballot the ballot to display
	 * @throws IOException
	 */
	public static void writeResults(String filename, Ballot ballot) throws IOException {
		String line1 = "RESULTS - " + ballot.getOfficeName();
		String line2 = "";
		for(int i = 0; i < line1.length(); i ++) {
			line2 += "-";
		}
		
		// find the candidate with the longest tag
		int maxLength = 0;
		for(int i = 0; i < ballot.getCandidates().size(); i++ ) {
			if(ballot.getCandidates().get(i).toString().length() > maxLength) {
				maxLength = ballot.getCandidates().get(i).toString().length();
			}
		}
		
		String formatstring ;
		formatstring = String.format("%%-%ds %%d\n", maxLength + 12);
		
		String line3 = "";
		for(int i = 0; i < ballot.getCandidates().size(); i ++) {
			line3 += String.format(formatstring, ballot.getCandidates().get(i).toString(), ballot.getCandidates().get(i).getVoteCount());
		}
		
		// find the candidate with the most votes
		String winner = null;
		int maxVotes = 0;
		for(int i = 0; i < ballot.getCandidates().size(); i ++ ) {
			if(ballot.getCandidates().get(i).getVoteCount() > maxVotes) {
				maxVotes = ballot.getCandidates().get(i).getVoteCount();
				winner = "WINNER: " + ballot.getCandidates().get(i).toString();
			}
			else if(ballot.getCandidates().get(i).getVoteCount() == maxVotes) {
				winner = "NO WINNER";
			}
		}
	

		// write election results to output file
		FileWriter f = new FileWriter(filename);
		PrintWriter p = new PrintWriter(f);
		p.println(line1);
		p.println(line2);
		p.println(line3);
		p.println(winner);
		p.close();

	}
}
 
