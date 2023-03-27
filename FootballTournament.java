import java.util.Collections;
import java.util.List;

public class FootballTournament {
    private List<Team> teams;

    public FootballTournament(List<Team> teams) {
        this.teams = teams;
    }
    public void play(){
        System.out.println("Welcome to Football tournament⚽");
        Collections.shuffle(teams);
        for (int i = 0; i < teams.size(); i+= 2) {
            Team team1 = teams.get(i);
            Team team2 = teams.get(i+1);
            System.out.println(team1.getName()  +"vs" + team2.getName());
            team1.play();
            team2.play();
        }
    }
}
