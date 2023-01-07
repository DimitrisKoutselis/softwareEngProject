import java.util.ArrayList;

public class League {

	private String Name;
	private int Ranking;
	private ArrayList<Matchday> matchdays;
	private ArrayList<Team> teams;

	public void draw(Admin currentUser) {
		matchdays = currentUser.Create_League(teams);
	}

	public String getName() {
		return Name;
	}

	public int getRanking() {
		return Ranking;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setRanking(int ranking) {
		Ranking = ranking;
	}
}