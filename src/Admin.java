import javax.swing.*;
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
		int[][] indexes =  new int [2][teams.size()/2];
		//Prwth Agwnistikh symfwna me algoritho RoundRobin
		for(int j = 0; j < teams.size()/2; j++){
			indexes[0][j] = 0+j;
			indexes[1][j] = teams.size()-1-j;
			matches.add(new Match(teams.get(indexes[0][j]), teams.get(indexes[1][j])));
		}
		leagueMatchdays.add(new Matchday(0, matches));
		//Ypoloipes Agwnistikes symfwna me algorithmo RoundRobin
		/*
			Symfwna me ton Algorithmo RoundRobin ean ka8e arithmos anaparista mia omada:

			Prwth agwnistikh, tyxaia apofash poia omada animetwpizei poia :
			1 2 3 4 vs
			8 7 6 5

			Deyterh agwnistikh kai epeita, oloi allazoyn 8esh me th fora tou rologiou ektos tou prwtou:
			1 8 2 3 vs   1 7 8 2 vs      1 6 7 8 vs    1 5 6 7 vs     k.o.k.
			7 6 5 4      6 5 4 3         5 4 3 2       4 3 2 8
		 */
		for (int i = 1; i < teams.size()-1; i++){
			indexes = clockwiseArrayForRoundRobinTournament(indexes);
			for (int j = 0; j < teams.size()/2; j++){
				matches.add(new Match(teams.get(indexes[0][j]), teams.get(indexes[1][j])));
			}

		}
		return leagueMatchdays;
	}

	public int[][] clockwiseArrayForRoundRobinTournament(int[][] indexes){
		int[][] indexes2 = new int[2][indexes[0].length];
		indexes2[0][0] = indexes[0][0];
		indexes2[0][1] = indexes[1][0];
		for (int i = 2; i < indexes[0].length;i++){
			indexes2[0][i] = indexes[0][i-1];
		}
		for (int i = 0; i < indexes[0].length-1; i++){
			indexes2[1][i] = indexes[1][i+1];
		}
		indexes2[1][indexes[0].length-1] = indexes[0][indexes[0].length-1];
		return indexes2;
	}

	public void Create_Team(String teamName, String teamCity, Integer teamPoints, ImageIcon teamLogo) {
		Team team = new Team();
		team.teamsArrayList.add(new Team(teamName,teamCity,teamPoints,teamLogo));
		team.teamsArrayList_2.add(new Team(teamName,teamPoints));

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