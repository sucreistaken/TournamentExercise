import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Football("Alex",30,"Striker",10));
        players.add(new Basketball("Volkan",31,"Goalkeeper",1));
        players.add(new Football("Lionel Messi",37,"Striker",30));
        players.add(new Football("C. Ronaldo",38,"Striker",7));
        Team fb = new Team("FenerBahçe💙💛");
        Team gs = new Team("Galatasaray");
        Team lakers = new Team("Lakers");
        Team ChicagoBulls = new Team("Chicago Bulls🐂♉");
        List<Team> teamList = new ArrayList<>();
        teamList.add(lakers);
        teamList.add(ChicagoBulls);
        BasketballTournament basketballTournament = new BasketballTournament(teamList);
        List<Team> teams = new ArrayList<>();
        teams.add(fb);
        teams.add(gs);
        fb.addPlayer(new Football("Alex",30,"Striker",10));
        FootballTournament futboll = new FootballTournament(teams);
        futboll.play();
        fb.skillCheck(players.get(1));

    }
}