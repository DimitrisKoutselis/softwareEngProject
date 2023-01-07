import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Admin extends User {



	public Admin(int user_ID, String user_Name) {
		super(user_ID, user_Name);
	}

	public Admin() {

	}

	public ArrayList<Matchday> Create_League(ArrayList<Team> teams) {
		//Arxikopoihsh twn ArraList
		ArrayList<Matchday> leagueMatchdays = new ArrayList<Matchday>();
		ArrayList<Match> matches = new ArrayList<Match>();
		//Prwth Agwnistikh symfwna me algoritho RoundRobin
		for(int j = 0; j < teams.size()/2; j++){
			matches.add(new Match(teams.get(0+j), teams.get(teams.size()-1 - j)));
		}
		leagueMatchdays.add(new Matchday(0, matches));
		//Ypoloipes Agwnistikes symfwna me algorithmo RoundRobin
		for (int i = 1; i < teams.size(); i++){

		}






		return leagueMatchdays;
	}

	public void Create_Team(String teamName, String teamCity, Integer teamPoints, ImageIcon teamLogo) {
		Team team = new Team();
		team.teams.add(new Team(teamName,teamCity,teamPoints,teamLogo));

	}

	public void Create_Player() {
	}

	public void Edit_Ranking() {
	}

	public void Edit_PostGame() {
	}

	public void Edit_Squads() {
	}

	public void Edit_Real_Time_Score() {
	}

	public void Delete_Another() {
	}

}