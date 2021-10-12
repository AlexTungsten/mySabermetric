package MLB;

public class Game {
  Team home;
  Team away;
  int year;
  int homeScore;
  int awayScore;

  public Game(Team h, Team a, int y, int hs, int as) {
    this.home = h;
    this.away = a;
    this.year = y;
    this.homeScore = hs;
    this.awayScore = as;
  }
  
}
