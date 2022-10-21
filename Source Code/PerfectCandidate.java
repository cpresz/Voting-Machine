import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * This project is an electronic voting machine with which users can cast votes for candidates on a ballot.
 * The software reads a ballot from an input file, and displays the candidates to the user for voting.
 * Votes for each candidate are tallied and the election results are displayed in an output file.
 */
public class PerfectCandidate {

	public static void main(String[] args) {
		Ballot ballot = null;
		
		do
		{
			FileSelector inputSelector = new FileSelector(
					null, "Select Input File", "Path to input file", true);
			
			inputSelector.setVisible(true);
			
			String inputFilename = inputSelector.getSelectedFile();
			
			if (inputFilename == null)
			{
					return;
			}
			
			try
			{
					ballot = BallotReader.readBallot(inputFilename);
			}
			catch (IOException e)
			{
				JOptionPane.showMessageDialog(null,
						"Could not open and read input file",
						"Input Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		while (ballot == null);

		BallotDialog bf = new BallotDialog(null, ballot);
		bf.setVisible(true);

		FileSelector outputSelector = new FileSelector(
			null, "Select Output File", "Path to output file", false);
			
		outputSelector.setVisible(true);
	
		String outputFilename = outputSelector.getSelectedFile();

		if (outputFilename == null)
		{
			return;
		}

		try
		{
			ResultWriter.writeResults(outputFilename, ballot);
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null,
				"Could not write results to output file",
				"Output Error",
				JOptionPane.ERROR_MESSAGE);
		}
	}
}

	
	
	
	
	
	

