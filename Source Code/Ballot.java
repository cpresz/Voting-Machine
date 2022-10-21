import java.util.ArrayList;

/**
 * This class represents an election ballot.
 * Each object of the class is an array list of candidates, 
 * with an attribute office name.
 */
public class Ballot {
	private ArrayList<Candidate> candidates; //array list of candidates
	private String officeName;	//the name of the office the ballot represents
	
	
	public Ballot(String officeName) {
		this.officeName = officeName;
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		this.candidates = candidates;
	}
	
	/**
	 * Returns the name of the office that candidates on the ballot are running for.
	 * @return a string representing the office name.
	 */
	public String getOfficeName() {
		return this.officeName;
	}
	
	/**
	 * Tests whether a candidate already exists on the ballot, 
	 * to avoid duplicate candidates.
	 * @param c a candidate to search the ballot for.
	 * @return a boolean. True if candidate already exists, false otherwise.
	 */
	private boolean ExistsAlready(Candidate c) {
		for(int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).toString().compareTo(c.toString()) == 0) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Add a candidate to the ballot.
	 * Call ExistsAlready method, 
	 * if candidate does not already exist on ballot, add. Otherwise, do not add.
	 * @param c a candidate to add to the ballot.
	 */
	public void addCandidate(Candidate c) {
		if(!ExistsAlready(c)) {
			candidates.add(c);
		}
	}

	/**
	 * Returns the ballot.
	 * @return an array list of each candidate on the ballot.
	 */
	public ArrayList<Candidate> getCandidates() {
		return this.candidates;
	}
	
	/**
	 * Returns a string representing a ballot,
	 * including the ballot's candidates and office name.
	 */
	@Override
	public String toString() {
		String s = this.officeName + "\n";
		for(int i = 0; i < candidates.size(); i++ ) {
			s += candidates.get(i).toString() + "\n";
		}
		return s;
	}
	

}

