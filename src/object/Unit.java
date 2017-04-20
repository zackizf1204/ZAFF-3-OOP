package object;

import java.util.Random;

/**
 * Created by Fathur on 13-Apr-17.
 * NIM : 13515068
 * File : Unit.java
 */
public class Unit extends MapObject {
  private int maxHp;
  private int maxMp;
  private int currentHp;
  private int currentMp;
  private int strength;
  private int intelligence;
  private int mov;
  private int agi;
  private final int type;

  public Unit(){
    super();
    setObjectType("Unit");
    maxHp = 100;
    maxMp = 50;
    currentHp = 100;
    maxMp = 100;
    strength = 10;
    intelligence = 10;
    mov = 5;
    agi = 10;
    type = 0;
  }

  public Unit(int mhp, int mmp, int strength, int intelligence, int mov, int agi, int absis,int ordinat,int type){
    super(absis,ordinat);
    setObjectType("Unit");
    maxHp = mhp;
    maxMp = mmp;
    this.strength = strength;
    this.intelligence = intelligence;
    this.mov = mov;
    this.agi = agi;
    this.type = type;
  }

  public Unit(int type){
    super();
    setObjectType("Unit");
    if (type == 0) { //Type Attacker ?
      maxHp = 100;
      maxMp = 25;
      currentHp = 100;
      currentMp = 25;
      strength = 20;
      intelligence = 3;
      mov = 5;
      agi = 7;
      this.type = 0;
    }
    else if (type == 1) { //Type Tank ?
      maxHp = 200;
      maxMp = 40;
      currentHp = 200;
      currentMp = 40;
      strength = 15;
      intelligence = 1;
      mov = 5;
      agi = 5;
      this.type = 1;
    }
    else if (type == 2) { //Type caster ?
      maxHp = 100;
      maxMp = 100;
      currentHp = 100;
      currentMp = 100;
      strength = 1;
      intelligence = 20;
      mov = 5;
      agi = 3;
      this.type = 2;
    }
    else if (type == 3) { //Type runner ?
      maxHp = 150;
      maxMp = 30;
      currentHp = 150;
      currentMp = 30;
      strength = 5;
      intelligence = 5;
      mov = 7;
      agi = 10;
      this.type = 3;
    }
    else{
      maxHp = 100;
      maxMp = 50;
      currentHp = 100;
      maxMp = 100;
      strength = 10;
      intelligence = 10;
      mov = 5;
      agi = 10;
      this.type = 0;
    }

  }

  public void Attack(Unit target){
    Random rand = new Random();
    int n = rand.nextInt(100)+1;
    if(n <= (target.agi*2)){
      //Attack Miss;
    }
    else{
      n = rand.nextInt(5) + 7;
      target.currentHp = target.currentHp - (strength*n/10);
    }
  }

  public void Move(int i){
    if(i == 0) { //Move up
      super.setOrdinat(super.getOrdinat()+1);
    }
    else if (i == 1) { //Move down
      super.setOrdinat(super.getOrdinat()-1);
    }
    else if (i == 2) { //Move left
      super.setAbsis(super.getAbsis()+1);
    }
    else if (i == 3){ //Move left
      super.setAbsis(super.getAbsis()-1);
    }
  }

  public void Skill(int i){
    //Belum di pikir
  }

  public void Wait(){
    currentHp = currentHp + 20;
    currentMp = currentMp + 10;
    if (currentHp > maxHp)
      currentHp = maxHp;
    if (currentMp > maxMp)
      currentMp = maxMp;
  }

  public void Pick(){
    //Belum di pikir
  }

  public void setMaxHp(int x){
    maxHp = x;
  }

  public void setMaxMp(int x){
    maxMp = x;
  }

  public void setCurrentHp(int x){
    currentHp = x;
  }

  public void setCurrentMp(int x){
    currentMp = x;
  }

  public void setStrength(int x){
    strength = x;
  }

  public void setIntelligence(int x){
    intelligence = x;
  }

  public void setMov(int x){
    mov = x;
  }

  public void setAgi(int x){
    agi = x;
  }

  public int getMaxHp(){
    return maxHp;
  }

  public int getMaxMp(){
    return maxMp;
  }

  public int getCurrentHp(){
    return currentHp;
  }

  public int getCurrentMp(){
    return currentMp;
  }

  public int getStrength(){
    return strength;
  }

  public int getIntelligence(){
    return intelligence;
  }

  public int getMov(){
    return mov;
  }

  public int getAgi(){
    return agi;
  }
}
