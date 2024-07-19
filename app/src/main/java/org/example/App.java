
package semonster2;

public class App {
  public String getGreeting() {
    return "こんにちは";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    player p1 = new player("isobe");
    player p2 = new player("cafe");

    Battle battle = new Battle();
    battle.startBattle(p1, p2);
  }
}
