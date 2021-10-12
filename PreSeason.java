package MLB;
import java.util.ArrayList;

public class PreSeason {
  int year; 
  ArrayList<Game> gameList = new ArrayList<Game>();
  public PreSeason(int y){
    this.year =  y;
  }
  public void addGame(Game g) {
    this.gameList.add(g);
  }
}
