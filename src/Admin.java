import javax.swing.*;
import java.util.ArrayList;

public class Admin extends User {

	//private Team team;
	public ArrayList<Team> teamsArrayList = new ArrayList<Team>();

	public Admin(int user_ID, String user_Name) {
		super(user_ID, user_Name);
	}

	public void Create_League() {
	}

	public void Create_Team() {
		String team_Name = null; //antistixisi me text field
		Integer team_Points = 0; // antistixisi me text field
		ImageIcon team_icon = null; // antistixisi me katallhlo icon
		try {
			if (!team_Name.equals(null) && !team_Points.equals(null) && !team_icon.equals(null)) {
				Team newTeam = new Team(team_Name, team_Points, team_icon);
				teamsArrayList.add(newTeam);
				//JOptionPane.showConfirmDialog(this,"Η Δημιουργία Ομάδας Πραγματοποιήθηκε Με Επιτυχία!");
			} else if (team_Name.equals(null) || team_Points.equals(null) || team_icon.equals(null)) {
				//JOptionPane.showMessageDialog(this,"Παρακαλώ Συμπληρώστε Τα Πεδία Κατάλληλα");
				//katharismos olwn twn textfields
			}
		}catch (RuntimeException ex){
			//JOptionPane.showMessageDialog(this, "Σφάλμα:" + " " +ex.getMessage().toString());
		}
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