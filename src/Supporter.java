import java.util.ArrayList;

public class Supporter extends User {

	private String user_Password;
	public ArrayList <Supporter> supporterArrayList = new ArrayList<Supporter>();



	public void Register(String user_Name ,String user_Password) {
		int user_id = getUser_ID();
		Supporter supporter = new Supporter(user_id + 1, user_Name, user_Password);
		supporterArrayList.add(supporter);
		}



	public Supporter() {
	}

	public Supporter(int user_id, String user_name, String user_Password){
		super(user_id, user_name);
		this.user_Password = user_Password;
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