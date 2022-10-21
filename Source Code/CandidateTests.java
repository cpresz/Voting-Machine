import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CandidateTests {
	private Candidate candidate;
	
	@BeforeEach
	public void setUp() {
		candidate = new Candidate("Bob", "Democrat");
	}
	 
	@Test
	public void testGetVoteCount() {
		assertEquals(0, candidate.getVoteCount());
	}
	
	@Test
	public void tallyVoteTest() {
		candidate.tallyVote();
		candidate.tallyVote();
		assertEquals(2, candidate.getVoteCount());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Bob", candidate.getName());
	}
	
	@Test
	public void testGetAffiliation() {
		assertEquals("Democrat", candidate.getAffiliation());
	}
	
	@Test
	public void testToString() {
		assertEquals("Bob - Democrat", candidate.toString());
	}

}
