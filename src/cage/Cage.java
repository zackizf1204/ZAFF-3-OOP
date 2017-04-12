/**
 * 
 */
package cage;
import pointer.Pointer;
import animal.Animal;
import habitat.Habitat;
import java.util.Random;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Cage.java
 * Tanggal : 28 Maret 2017
 */
public class Cage {
  /**
   * habitatType adalah type dari habitat. 0:land, 1:water, 2:air
   */
  private int habitatType;
  /**
   * luasCage adalah luas total dari Cage
   */
  private int luasCage;
  /**
   * cageNumber adalah nomor urut dari cage
   */
  private int cageNumber;
  /**
   * jumlahMakanan adalah jumlah total makanan yang dibutuhkan di Cage
   */
  private double jumlahMakanan;
  /**
   * counterAnimal adalah counter untuk penigisan animalData saat ini di Cage
   */
  private int counterAnimal;
  /**
   * animalData adalah array data dari animal
   */
  private Animal animalData[];
  /**
   * animalLocation adalah array lokasi dari animal
   */
  private Pointer animalLocation[];
  /**
   * counterPoint adalah counter untuk pengisian listPoint
   */
  private int counterPoint;
  /**
   * listPoint adalah array dari Point untuk suatu cage
   */
  private Pointer listPoint[];
  /**
   * Constructor
   * @param inputHabitat
   * @param inputMaxLuas
   * I.S : Cage belum terdefinisi
   * F.S : Cage terdefinisi
   */
  public Cage(int inputHabitat, int inputMaxLuas){
    listPoint=new Pointer[inputMaxLuas];
    counterPoint=0;
    animalData=new Animal[inputMaxLuas*30/100];
    animalLocation=new Pointer[inputMaxLuas*30/100];
    counterAnimal=0;
    luasCage=0;
    habitatType=inputHabitat;
    jumlahMakanan=0;
  }
  /**
   * pengecekan syarat apakah bisa memasukkan hewan ke Cage
   * @param inputAnimal
   * @param x
   * @param y
   * @return
   * I.S : x, y dan inputAnimal terdefinisi
   * F.S : true jika bisa memasukkan hewan. False jika tidak bisa.
   */
  public boolean bisaAddHewan(Animal inputAnimal,int x, int y){
    boolean temp;
    int i,j;
    char test;
    temp=false;
    if(counterAnimal<(luasCage*30)/100){
      if((inputAnimal.getType())[habitatType] == 1){
        temp = true;
      }
    }
    if(temp){
      for(j=0;j<counterAnimal;j++){
        i=0;
        test=animalData[j].getRender();
        while((temp)&&(i<inputAnimal.getTopEnemy())){
          if ((inputAnimal.getEnemy())[i] == test){
            temp = false;
          }
          i=i+1;
        }
      }
    }
    return temp;
  }
  /**
   * Menambahkan Hewan
   * @param inputAnimal
   * @param x
   * @param y
   * I.S : inputAnimal, x dan y terdefinisi
   * F.S : inputAnimal ditambahkan ke dalam Cage jika bisa. jika tidak, maka ditampilkan pesan kesalahan.
   */
  public void addHewan(Animal inputAnimal, int x, int y){
    if(bisaAddHewan(inputAnimal,x,y)){
      animalData[counterAnimal]=inputAnimal;
      animalLocation[counterAnimal]=new Pointer(x,y);
      counterAnimal=counterAnimal+1;
      jumlahMakanan=jumlahMakanan+inputAnimal.getFoodNum();
      System.out.println("Berhasil ditambahkan");
    }else{
      System.out.println("Tidak bisa ditambahkan");
    }
  }
  /**
   * cek apakah x dan y di dalam cage
   * @param x
   * @param y
   * @return true jika iya. false jika tidak.
   */
  public boolean isInCage(int x, int y){
    boolean diDalam;
    int i;
    i=0;
    diDalam=false;
    while((!diDalam)&&(i<counterPoint)){
      if((listPoint[i].getPositionX()==x)&&(listPoint[i].getPositionY()==y)){
        diDalam=true;
      }
      i=i+1;
    }
    return diDalam;
  }
  /**
   * cek apakah ada hewan di lokasi x dan y
   * @param x
   * @param y
   * @return true jika iya. false jika tidak.
   */
  public boolean adaHewan(int x,int y){
    boolean temp2;
    int i;
    i=0;
    temp2=false;
    if(isInCage(x,y)){
      while((!temp2)&&(i<counterAnimal)){
    	if((animalLocation[i].getPositionX()==x)&&(animalLocation[i].getPositionY()==y)){
          temp2=true;
        }
        i=i+1;
      }
      return(temp2);
    }else{
      return(false);
    }
  }
  /**
   * menambahkan habitat pada cage
   * @param inputHabitat
   */
  public void addHabitat(Habitat inputHabitat){
    inputHabitat.setCageNumber(cageNumber);
    luasCage=luasCage+1;
    listPoint[counterPoint]=new Pointer(inputHabitat.getPositionX(),inputHabitat.getPositionY());
    counterPoint=counterPoint+1;
  }
  /**
   * menampilkan experienceHewan
   */
  public void experienceHewan(){
    int i;
    for(i=0;i<counterAnimal;i++){
      animalData[i].getExperience();
    }
  }
  /**
   * melakukan set render pada c
   * @param c
   */
  public void render(char c[][]){
    int i;
    for(i=0;i<counterAnimal;i++){
  	  c[animalLocation[i].getPositionX()][animalLocation[i].getPositionY()]=animalData[i].getRender();
    }
  }
  /**
   * menggerakan hewan
   */
  public void move(){
    int moveCommand,i;
    for(i=0;i<counterAnimal;i++){
      Random randomMove=new Random();
      moveCommand=randomMove.nextInt(3);
      if(moveCommand==0){
        if(isInCage(animalLocation[i].getPositionX(),animalLocation[i].getPositionY()-1)){
          if(!(adaHewan(animalLocation[i].getPositionX(),animalLocation[i].getPositionY()-1))){
            animalLocation[i].setPositionX(animalLocation[i].getPositionY()-1);
          }
        }
      }else if(moveCommand==1){
        if(isInCage(animalLocation[i].getPositionX()+1,animalLocation[i].getPositionY())){
          if(!(adaHewan(animalLocation[i].getPositionX()+1,animalLocation[i].getPositionY()))){
            animalLocation[i].setPositionX(animalLocation[i].getPositionX()+1);
          }
        }
      }else if(moveCommand==2){
        if(isInCage(animalLocation[i].getPositionX()-1,animalLocation[i].getPositionY())){
          if(!(adaHewan(animalLocation[i].getPositionX()-1,animalLocation[i].getPositionY()))){
            animalLocation[i].setPositionX(animalLocation[i].getPositionX()-1);
          }
        }
      }else if(moveCommand==3){
        if(isInCage(animalLocation[i].getPositionX(),animalLocation[i].getPositionY()+1)){
          if(!(adaHewan(animalLocation[i].getPositionX(),animalLocation[i].getPositionY()+1))){
            animalLocation[i].setPositionY(animalLocation[i].getPositionY()+1);
          }
        }
      }
    }
  }
  /**
   * mendapatkan render dari hewan
   * @param x
   * @param y
   * @return character render dari hewan
   */
  public char getRender(int x,int y){
    int i;
    i=0;
	while ((i<counterAnimal)&&((x!=animalLocation[i].getPositionX())||(y!=animalLocation[i].getPositionY()))){ 
	  i=i+1;
	}
	return(animalData[i].getRender());
  }
  /**
   * setter untuk cageNumber
   * @param inputNumber
   */
  public void setCageNumber(int inputNumber){
    cageNumber=inputNumber;
  }
  /**
   * getter untuk jumlahMakanan
   * @return jumlahMakanan
   */
  public double getJumlahMakan(){
	return(jumlahMakanan);  
  }
  /**
   * getter untuk cageNumber
   * @return cageNumber
   */
  public int getNumberCage(){
    return(cageNumber);
  }
  /**
   * getter untuk animalLocation
   * @return animalLocation
   */
  public Pointer[] getAnimalLocation(){
    return(animalLocation);
  }
  /**
   * getter untuk counterAnimal
   * @return counterAnimal
   */
  public int getCounterAnimal(){
    return(counterAnimal);
  }
  /**
   * getter untuk luasCage
   * @return luasCage
   */
  public int getLuasCage(){
    return(luasCage);
  }
}
