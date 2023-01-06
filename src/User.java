public abstract class User {

	private int user_ID;
	private String user_Name;

	public User(int user_ID, String user_Name){
		this.user_ID = user_ID;
		this.user_Name = user_Name;
	}

	public User() {

	}




	public int getUser_ID() {
		return user_ID;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
}