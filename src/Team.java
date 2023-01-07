import javax.swing.*;

public class Team {

	private String team_Name;
	private int points;
	private ImageIcon emblem;

	public Team(String team_name, Integer team_points, ImageIcon team_icon) {
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