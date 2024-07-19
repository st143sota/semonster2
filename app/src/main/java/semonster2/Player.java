package semonster2;

import java.util.ArrayList;

public class Player {
  String name;
  ArrayList<Monster> list;

  public Player(String name) {
    this.name = name;
    this.list = new ArrayList<>();
  }

  // ゲッターとセッター
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Monster> getList() {
    return list;
  }

  public void setList(ArrayList<Monster> list) {
    this.list = list;
  }
}

public class Monster {
  String monsterName;
  int rarity;

  public Monster(String monsterName, int rarity) {
    this.monsterName = monsterName;
    this.rarity = rarity;
  }

  // ゲッターとセッター
  public String getMonsterName() {
    return monsterName;
  }

  public void setMonsterName(String monsterName) {
    this.monsterName = monsterName;
  }

  public int getRarity() {
    return rarity;
  }

  public void setRarity(int rarity) {
    this.rarity = rarity;
  }
}
