import java.util.ArrayList;
public class MAIN {


    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<Team> teams = new ArrayList<Team>();
        ArrayList<User> users = new ArrayList<User>();
        users.add(new Admin(1,"Admin"));
        users.add(new Secretary(2, "Secretary"));

        new RegisterForm();



    }
}
