package MLB;
import java.util.ArrayList;


public class Team {
  String name;
  ArrayList<String> cityList = new ArrayList<String>();
  ArrayList<Game> gameList = new ArrayList<Game>();

  public Team (String n){
    this.name = n;
  }
  public void addGame(Game g) {
    this.gameList.add(g);
  }

  public void addTeam(Game t) {
    this.gameList.add(t);
  }
}
