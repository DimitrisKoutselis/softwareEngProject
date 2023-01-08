import javax.swing.*;
import java.util.ArrayList;

public class Team {

	private String team_Name;

	private String team_City;
	private int points;
	private ImageIcon emblem;

	public ArrayList<Team> teamsArrayList = new ArrayList<Team>();
	public ArrayList<Team> teamsArrayList_2 = new ArrayList<Team>();



	public int compareTo(Team other){
		if(this.getPoints() > other.getPoints()){
			return 1;
		} else if (this.getPoints() < other.getPoints()) {
			return -1;
		}else{
			return 0;
		}
	}

	public Team() {
	}
	
	public Team(String team_Name,int points){
		this.team_Name = team_Name;
		this.points = points;
	}

	public Team(String team_Name, String team_City, int points, ImageIcon emblem) {
		this.team_Name = team_Name;
		this.team_City = team_City;
		this.points = points;
		this.emblem = emblem;
	}

	public Team(Team team) {
	}


	public String getTeam_Name() {
		return this.team_Name;
	}

	public int getPoints() {

		return 0;
	}

	/**
	 * 
	 * @param points
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	public ImageIcon getEmblem() {
		return emblem;
	}
}