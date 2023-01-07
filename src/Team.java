import javax.swing.*;
import java.util.ArrayList;

public class Team {

	private String team_Name;

	private String team_City;
	private Integer points;
	private ImageIcon emblem;

	public ArrayList<Team> teams = new ArrayList<Team>();


	public Team() {
	}

	public Team(String team_Name, String team_City, Integer points, ImageIcon emblem) {
		this.team_Name = team_Name;
		this.team_City = team_City;
		this.points = points;
		this.emblem = emblem;
	}

	public String getTeam_Name() {
		return this.team_Name;
	}

	public void getPoints() {

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