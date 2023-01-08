import java.util.Comparator;

public class teamComparator implements Comparator<Team> {

    @Override
    public int compare(Team team1, Team team2) {
        return team1.compareTo(team2);
    }
}
