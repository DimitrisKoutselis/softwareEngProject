import java.util.ArrayList;
import java.util.Collections;



public class League   {

	private String Name;
	private int Ranking;
	private ArrayList<Matchday> matchdays;
	private ArrayList<Team> teams;

	public void draw(Admin currentUser) {
		matchdays = currentUser.Create_League(teams);
	}


	public void Ranking(Admin currentUser){
		Team leagueTeams = new Team();
		ArrayList<Team> teams = leagueTeams.teamsArrayList_2;
		Collections.sort(teams,new teamComparator());
	}

	public void Ranking(Supporter currentUser){
		Team leagueTeams = new Team();
		ArrayList<Team> teams = leagueTeams.teamsArrayList_2;
		Collections.sort(teams,new teamComparator());
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