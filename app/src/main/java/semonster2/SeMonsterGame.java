package main.java.semonster2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Player {
  String name;
  int hp;
  ArrayList<Monster> list;
  LinkedList<Integer> numbers;

  public Player(String name) {
    this.name = name;
    this.hp = 100; // 初期HPを設定
    this.list = new ArrayList<>();
    this.numbers = new LinkedList<>();
    for (int i = 0; i < 8; i++) {
      this.list.add(new Monster("Monster" + i, i));
      this.numbers.add(i);
    }
  }

  // 省略: ゲッターとセッター

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.name + "'s monsters (HP: " + this.hp + "):\n");
    for (Monster monster : this.list) {
      sb.append(monster.toString() + "\n");
    }
    return sb.toString();
  }
}

public class SeMonsterGame {
  Map<String, Player> players;

  public SeMonsterGame() {
    this.players = new HashMap<>();
  }

  public void addPlayer(String playerName) {
    this.players.put(playerName, new Player(playerName));
  }

  public void draw(String playerName) {
    Player player = this.players.get(playerName);
    if (player != null) {
      // プレイヤーがモンスターを引く処理を実装します
      // ここでは詳細な実装は省略します
    }
  }
}
