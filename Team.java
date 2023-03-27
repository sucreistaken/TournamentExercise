import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();

    }
    public void addPlayer(Player P){
        players.add(P);
    }
    public void removePlayer(Player P){
        players.remove(P);
    }
    public void listPlayer(){
        for(Player player : players){
            System.out.println(player.getName() + " position" + player.getPosition() +"⚽");
        }

    }
    public void  play(){
        System.out.println(getName() + "isPlaying");
        System.out.println("Players");
        for(Player player : players){
            player.play();

        }
    }
    public void skillCheck(Skills player){
        if(player.canKick()){
            System.out.println("Futball");
        }else System.out.println("Basketball");
    }
}
