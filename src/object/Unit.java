package object;

<<<<<<< .merge_file_a06084


||||||| .merge_file_a07360
=======
import object.item.PowerUp;
import object.item.Recovery;
>>>>>>> .merge_file_a06540
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
<<<<<<< .merge_file_a06084

    type = 0;

||||||| .merge_file_a07360
    type = 0;
=======
    type = 4;
>>>>>>> .merge_file_a06540
  }

<<<<<<< .merge_file_a06084


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

||||||| .merge_file_a07360
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
=======
  public Unit(int type,int x,int y){
    super(x,y);
>>>>>>> .merge_file_a06540
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
<<<<<<< .merge_file_a06084

    else{

||||||| .merge_file_a07360
    else{
=======
    else{ //default type
>>>>>>> .merge_file_a06540
      maxHp = 100;

      maxMp = 50;

      currentHp = 100;

      maxMp = 100;

      strength = 10;

      intelligence = 10;

      mov = 5;

      agi = 10;
<<<<<<< .merge_file_a06084

      this.type = 0;

||||||| .merge_file_a07360
      this.type = 0;
=======
      this.type = 4;
>>>>>>> .merge_file_a06540
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
<<<<<<< .merge_file_a06084

      super.setOrdinat(super.getOrdinat()+1);

||||||| .merge_file_a07360
      super.setOrdinat(super.getOrdinat()+1);
=======
      setOrdinat(getOrdinat()+1);
>>>>>>> .merge_file_a06540
    }

    else if (i == 1) { //Move down
<<<<<<< .merge_file_a06084

      super.setOrdinat(super.getOrdinat()-1);

||||||| .merge_file_a07360
      super.setOrdinat(super.getOrdinat()-1);
=======
      setOrdinat(getOrdinat()-1);
>>>>>>> .merge_file_a06540
    }

    else if (i == 2) { //Move left
<<<<<<< .merge_file_a06084

      super.setAbsis(super.getAbsis()+1);

||||||| .merge_file_a07360
      super.setAbsis(super.getAbsis()+1);
=======
      setAbsis(getAbsis()-1);
>>>>>>> .merge_file_a06540
    }

    else if (i == 3){ //Move left
<<<<<<< .merge_file_a06084

      super.setAbsis(super.getAbsis()-1);

||||||| .merge_file_a07360
      super.setAbsis(super.getAbsis()-1);
=======
      setAbsis(getAbsis()+1);
>>>>>>> .merge_file_a06540
    }

  }

<<<<<<< .merge_file_a06084


  public void Skill(int i){

    //Belum di pikir

||||||| .merge_file_a07360
  public void Skill(int i){
    //Belum di pikir
=======
  public void Skill(int i,Unit target){
    Random rand = new Random();
    int n = rand.nextInt(5)+7;
    if (type == 0){
      if (i == 1){
        currentMp = currentMp - 5;
        currentHp = currentHp - 10;
        target.currentHp = target.currentHp - (3*strength*n/19);
      }
      else if (i == 2){
        currentMp = currentMp - 15;
        currentHp = currentHp - 30;
        target.currentMp = target.currentHp - (5*strength*n/19);
      }
      else if (i == 3){
        currentMp = currentMp-10;
        target.currentHp = target.currentHp - (3*strength*n/10);
        addHp(3*strength*n/5);
      }
    }
    if (type == 1) {
      if (i == 1){
        currentMp = currentMp -5;
        target.currentHp = target,currentHp - (2*strength*n/10);
      }
      else if (i == 2){
        addHp(currentMp*5);
        currentMp = 0;
      }
      else if (i == 3){
        currentMp = currentMp - 10;
        target.currentHp = target.currentMp - (2*strength*n/10);
        addHp(2*strength*n/5);
      }
    }
    if (type == 2){
      if (i == 1){
        currentMp = currentMp - 5;
        target.currentHp = target.currentHp - (5*intelligence*n/10);
      }
      else if (i == 2){
        currentMp = currentMp - 20;
        target.currentHp = target.currentHp - (5*intelligence*n/10)
        addMp(5*intelligence*n/20);
      }
      else if (i == 3){
        addMp(currentHp);
        currentHp = currentHp/2;
      }
    }
    if (type == 3){
      if (i == 1){
        currentMp = currentMp - 5;
        target.currentHp = target.currentHp - (5*strength*n/20);
      }
      else if (i == 2){
        currentMp = currentMp - 10;
        target.currentHp = target.currentHp - (2*strength*n/10);
        addHp(2*strength*n/20);
      }
      else if (i == 3){
        currentMp = currentMp - 15;
        target.currentHp = target.currentHp - (2*strength*n/10);
        n = rand.nextInt(100);
        if (n < 5)
          target.currentHp = 0;
      }
    }
>>>>>>> .merge_file_a06540
  }



  public void Wait(){
<<<<<<< .merge_file_a06084

    currentHp = currentHp + 20;

    currentMp = currentMp + 10;

    if (currentHp > maxHp)

      currentHp = maxHp;

    if (currentMp > maxMp)

      currentMp = maxMp;

||||||| .merge_file_a07360
    currentHp = currentHp + 20;
    currentMp = currentMp + 10;
    if (currentHp > maxHp)
      currentHp = maxHp;
    if (currentMp > maxMp)
      currentMp = maxMp;
=======
    addHp(20);
    addMp(10);
  }

  public void Pick(PowerUp pu){
    maxHp = maxHp + pu.getAddMaxHp();
    maxMp = maxMp + pu.getAddMaxMp();
    strength = strength + pu.getAddStrength();
    intelligence = intelligence + pu.getAddIntelligence();
    agi = agi + pu.getAddAgility();
    mov = mov + pu.getAddMov();
>>>>>>> .merge_file_a06540
  }

<<<<<<< .merge_file_a06084


  public void Pick(){

    //Belum di pikir

||||||| .merge_file_a07360
  public void Pick(){
    //Belum di pikir
=======
  public void Pick(Recovery recov){
    addHp(recov.getAddHp());
    addMp(recov.getAddMp());
>>>>>>> .merge_file_a06540
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
<<<<<<< .merge_file_a06084

  }
||||||| .merge_file_a07360
  }
=======
  }W
>>>>>>> .merge_file_a06540



  public int getAgi(){

    return agi;

  }
<<<<<<< .merge_file_a06084

}
||||||| .merge_file_a07360
}
=======

  public void addHp(int x){
    currentHp = currentHp + x;
    if (currentHp > maxHp)
      currentHp = maxHp;
  }

  public void addMp(int x){
    currentMp = currentMp +x;
    if (currentMp > maxMp)
      currentMp = maxMp;
  }
}
>>>>>>> .merge_file_a06540
