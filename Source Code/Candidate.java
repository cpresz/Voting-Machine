/**
 * This class represents a candidate that can be voted for.
 * Methods exist to retrieve the candidate's name, affiliation, and vote count,
 * and to add to the candidate's vote count.
 */

public class Candidate {
	
	private String name;	// candidate's name
	private String affiliation;	// party the candidate is affiliated with
	private int voteCount;	// how many votes the candidate has received		
	

	public Candidate(String name, String affiliation) {
		this.name = name;
		this.affiliation = affiliation;
		voteCount = 0;
	}
	
	/**
	 * This method returns the candidate's name.
	 * @return a string representing the candidate's name.
	 */
	public String getName() {
		return this.name;
	}		
	
	/**
	 * This method returns the candidate's party affiliation.
	 * @return a string representing the candidate's affiliation.
	 */
	public String getAffiliation() {
		return this.affiliation;
	}
	
	/**
	 * This method returns the number of votes the candidate has received.
	 * @return an int value representing the candidate's vote count.
	 */
	public int getVoteCount() {
		return this.voteCount;
	}
	
	/**
	 * This method increments the candidate's vote count by 1.
	 */
	public void tallyVote() {
		this.voteCount++;
	}
	 
	/**
	 * This method communicates the candidate's name and party affiliation.
	 * @return a string representing the candidate's tag.
	 */
	@Override
	public String toString() {
		return this.name + " - " + this.affiliation;
	}
	
	/**
	 * A method to compare Candidate objects.
	 * @return true if objects are equal, false otherwise.
	 * Candidates are equal if they have the same name and affiliation.
	 */
	@Override
	public boolean equals(Object obj) {
		Candidate other = (Candidate) obj;
		if(other.name == this.name && other.affiliation == this.affiliation) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
