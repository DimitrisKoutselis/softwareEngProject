public class Supporter extends User {

	private String user_Password;

	public Supporter(int user_id, String user_name, String user_Password){
		super(user_id, user_name);
		this.user_Password = user_Password;
	}

	public void Register() {
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