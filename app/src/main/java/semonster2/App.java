package semonster2;

public class App {
  public String getGreeting() {
    return "こんにちは";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Player p1 = new Player("sota");
    Player p2 = new Player("megutel");

    Battle battle = new Battle();
    battle.startBattle(p1, p2);
  }
}
