import java.util.ArrayList;
public class MAIN {
    public ArrayList<Player> players = new ArrayList<Player>();
    public ArrayList<Team> teams = new ArrayList<Team>();


    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new Admin(1,"Admin"));
        users.add(new Secretary(2, "Secretary"));


        new createTeamForm();


    }

    public void addPlayer(Player player){
        players.add(player);
    }
    public void removePlayer(Player player){
        for (int i=0;i<players.size();i++){
            if (players.get(i).equals(player)){
                players.remove(i);
            }
        }
    }
}
