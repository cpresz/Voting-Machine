import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;

class BallotTests {
	private ArrayList<Candidate> candidates;
	private Candidate c;
	private Ballot ballot ;
	
 
	@BeforeEach
 	public void setUp() {
 		ballot = new Ballot("President");
 		c = new Candidate("Bob", "Democrat");
 		candidates = new ArrayList<Candidate>();
 	}
 
	@Test
	public void testGetOfficeName() {
		assertEquals("President", ballot.getOfficeName());
	}
	
	@Test
	public void testAddCandidate() {
		ballot.addCandidate(c);
		assertNotNull(candidates);
		
	}
	
	@Test
	public void testToString() {
		ballot.addCandidate(c);
		assertEquals("President\nBob - Democrat\n", ballot.toString());
	}
	
	@Test
	public void testGetCandidates() {
		assertEquals(ballot.getCandidates(), candidates);
	}
}
