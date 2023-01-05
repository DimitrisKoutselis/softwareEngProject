import java.util.ArrayList;

public class Supporter extends User {

	private String user_Password;
	public ArrayList <Supporter> supporterArrayList = new ArrayList<Supporter>();

	public Supporter(int user_id, String user_name, String user_Password){
		super(user_id, user_name);
		this.user_Password = user_Password;
	}

	public void Register() {
		Integer user_ID = getUser_ID(); //allagh sto diagramma apo int se Integer
		String user_Name = getUser_Name();
		try {
			if (!user_Password.equals(null) && !user_Name.equals(null) && user_ID.equals(null)) {
				//Antistixisi user_ID me text field
				//Antistixisi user_Name me text field
				//Antistixisi user_Password me text field
				Supporter supporter = new Supporter(getUser_ID(), getUser_Name(), user_Password);
				supporterArrayList.add(supporter);
				//JOptionPane.showConfirmDialog(this,"Η Εγγραφή Πραγματοποιήθηκε Με Επιτυχία!");

			} else if (user_Password.equals(null) || user_Name.equals(null) || user_ID.equals(null)) {
				//JOptionPane.showMessageDialog(this,"Παρακαλώ Συμπληρώστε Τα Πεδία Κατάλληλα");
				//katharismos olwn twn textfields
			}
		}catch (RuntimeException ex){
			//JOptionPane.showMessageDialog(this, "Σφάλμα:" + " " +ex.getMessage().toString());
		}

	}

	public void Edit_Account() {
	}

	public void Delete_Account() {
	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}
}