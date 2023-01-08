public class Player {

	private String player_Name;
	private int position;
	private int jersey;

	private Team Team;

	public Player(String player_Name, int position, int jersey, Team team) {
		this.player_Name = player_Name;
		this.position = position;
		this.jersey = jersey;
		this.Team = team;
	}

	public void getTeam() {
	}

	public int getPosition() {
		return position;
	}

	public String getPlayer_Name() {
		return player_Name;
	}

	/**
	 * 
	 * @param Team
	 */
	public void setTeam(int Team) {
	}

	public void setPosition(int position) {
		this.position = position;
	}
}