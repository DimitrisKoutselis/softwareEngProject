import java.util.ArrayList;
import java.util.Date;

public class Matchday {

	private int mathcdayNumber;
	private Date date;
	private ArrayList<Match> matches;

	public Matchday(int mdN, ArrayList<Match> ms){
		this.mathcdayNumber = mdN;
		this.matches = ms;
	}

	public int getMathcdayNumber() {
		return this.mathcdayNumber;
	}

	public ArrayList<Match> getMatches() {
		return matches;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}

	public void setMathcdayNumber(int mathcdayNumber) {
		this.mathcdayNumber = mathcdayNumber;
	}
}