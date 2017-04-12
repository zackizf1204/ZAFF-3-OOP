/**
 * 
 */
package tour;

import cell.Cell;
import java.util.Scanner;
import pointer.Pointer;
import cage.Cage;
import habitat.Habitat;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Tour.java
 * Tanggal : 28 Maret 2017
 */
public class Tour {
  /**
   * nowX adalah posisi x sekarang dari tour
   */
  private int nowX;
  /**
   * nowY adalah posisi y sekarang dari tour
   */
  private int nowY;
  /**
   * constructor
   * @param zoo
   */
  public Tour(Cell zoo){
	Pointer nowLocation;
    nowLocation=searchEntrance(zoo);
    nowX=nowLocation.getPositionX();
    nowY=nowLocation.getPositionY();
  }
  /**
   * Mencari lokasi entrance pada zoo
   * @param zoo
   * @return Pointer yang berupa entrance
   */
  public Pointer searchEntrance(Cell zoo){
    int x,y;
    x=0;
    y=0;
    while((!(zoo.getPoint(x,y).isEntrance()))&&(y<zoo.getSizeY())){
      x=x+1;
      if(x>=zoo.getSizeX()){
        y=y+1;
        x=0;
      }
    }
    return(zoo.getPoint(x, y));
  }
  /**
   * bergerak ke kiri
   * @param zoo
   * @return Pointer lokasi kiri dari posisi sekarang
   */
  public Pointer moveKiri(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY);
    if (nowY-1>0){
      if(zoo.getPoint(nowX,nowY-1).isJalan()){
        nowLocation=zoo.getPoint(nowX,nowY-1);
        nowY=nowY-1;
      }
    }
    return(nowLocation);
  }
  /**
   * bergerak ke kanan
   * @param zoo
   * @return Pointer lokasi kanan dari posisi sekarang
   */
  public Pointer moveKanan(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY);
    if (nowY+1<zoo.getSizeX()){
      if(zoo.getPoint(nowX,nowY+1).isJalan()){
        nowLocation=zoo.getPoint(nowX,nowY+1);
        nowY=nowY+1;
      }
    }
    return(nowLocation);
  }
  /**
   * bergerak ke atas
   * @param zoo
   * @return Pointer lokasi atas dari posisi sekarang
   */
  public Pointer moveAtas(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY);
    if (nowX-1>0){
      if(zoo.getPoint(nowX-1,nowY).isJalan()){
        nowLocation=zoo.getPoint(nowX-1,nowY);
        nowX=nowX-1;
      }
    }
    return(nowLocation);
  }
  /**
   * bergerak ke bawah
   * @param zoo
   * @return Pointer lokasi bawah dari posisi sekarang
   */
  public Pointer moveBawah(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY);
    if (nowX+1<zoo.getSizeX()){
      if(zoo.getPoint(nowX+1,nowY).isJalan()){
        nowLocation=zoo.getPoint(nowX+1,nowY);
        nowX=nowX+1;
      }
    }
    return(nowLocation);
  }
  /**
   * mengecek apakah diatas ada habitat
   * @param zoo
   * @return true jika diatas dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkUpHabitat(Cell zoo){
    return((zoo.getPoint(nowX-1,nowY)).isHabitat());
  }
  /**
   * mengecek apakah dibawah ada habitat
   * @param zoo
   * @return true jika dibawah dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkDownHabitat(Cell zoo){
    return((zoo.getPoint(nowX+1,nowY)).isHabitat());
  }
  /**
   * mengecek apakah dikiri ada habitat
   * @param zoo
   * @return true jika dikiri dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkLeftHabitat(Cell zoo){
    return((zoo.getPoint(nowX,nowY-1)).isHabitat());
  }
  /**
   * mengecek apakah di kanan ada habitat
   * @param zoo
   * @return true jika dikanan dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkRightHabitat(Cell zoo){
    return((zoo.getPoint(nowX,nowY+1)).isHabitat());
  }
  public boolean checkDiDalam(Pointer check, Cell zoo){
    int i;
    boolean diDalam;
    Cage tempListCage[];
    tempListCage=zoo.getListCage();
    i=0;
    diDalam=false;
    while((!diDalam)&&(i<zoo.getCounterCage())){
      if(tempListCage[i].isInCage(check.getPositionX(),check.getPositionY())){
        diDalam=true;
      }
      i=i+1;
    }
    return(diDalam);
  }
  /**
   * melihat habitat dari Pointer yang akan dicek
   * @param check
   * @param zoo
   */
  public void seeHabitat(Pointer check, Cell zoo){
    int k;
    Cage tempListCage[];
    tempListCage=zoo.getListCage();
    k=0;
    while((k<zoo.getCounterCage())&&(!tempListCage[k].isInCage(check.getPositionX(),check.getPositionY()))){
      k=k+1;
    }
    if(k>zoo.getCounterCage()-1){
      k=k-1;
    }
    tempListCage[k].experienceHewan();
  }
  /**
   * melihat keadaan sekitar dari posisi sekarang
   * @param zoo
   */
  public void checkSurrounding(Cell zoo){
    if(nowX>0){
      if((checkUpHabitat(zoo))&&(checkDiDalam(zoo.getPoint(nowX-1, nowY),zoo))){
        System.out.println("Di atas, ");
        seeHabitat(zoo.getPoint(nowX-1, nowY),zoo);
        System.out.println("==");
      }
    }
    if(nowY>0){
      if((checkLeftHabitat(zoo))&&(checkDiDalam(zoo.getPoint(nowX, nowY-1),zoo))){
        System.out.println("Di kiri, ");
        seeHabitat(zoo.getPoint(nowX, nowY-1),zoo);
        System.out.println("==");
      }
    }
    if(nowY+1<zoo.getSizeY()){
      if((checkRightHabitat(zoo))&&(checkDiDalam(zoo.getPoint(nowX, nowY+1),zoo))){
        System.out.println("Di kanan, ");
        seeHabitat(zoo.getPoint(nowX, nowY+1),zoo);
        System.out.println("==");
      }
    }
    if(nowX+1<zoo.getSizeX()){
      if((checkDownHabitat(zoo))&&(checkDiDalam(zoo.getPoint(nowX+1, nowY),zoo))){
        System.out.println("Di bawah, ");
        seeHabitat(zoo.getPoint(nowX+1, nowY),zoo);
        System.out.println("==");
      }
    }
  }
  /**
   * mendisplay zoo saat tour
   * @param zoo
   */
  public void tourGambar(Cell zoo){
    int i,j,k;
    Cage tempListCage[];
    k=0;
    tempListCage=zoo.getListCage();
    for(i=0;i<zoo.getSizeX();i++){
      for(j=0;j<zoo.getSizeY();j++){
        k=0;
        if((i==nowX)&&(j==nowY)){
          System.out.print('$');	
        }else{
          while((k<zoo.getCounterCage())&&(!tempListCage[k].isInCage(i,j))){
            k=k+1;
          }
          if(k>zoo.getCounterCage()-1){
            k=k-1;
          }
          if(tempListCage[k].adaHewan(i,j)){
            System.out.print(tempListCage[k].getRender(i,j));
          }else{
            System.out.print(zoo.getPoint(i,j).render());
          }
        }
      }
      System.out.println();
    }
  }
  /**
   * bergerak hingga ke exit
   * @param zoo
   */
  public void gerak(Cell zoo){
    Scanner input;
    int i;
    char inputscan;
    Pointer now;
    Cage tempListCage[];
    int counter;
    tempListCage=zoo.getListCage();
    counter=zoo.getCounterCage();
    input=new Scanner(System.in);
    inputscan=input.next().charAt(0);
    while(!(zoo.getPoint(nowX,nowY).isExit())){
      checkSurrounding(zoo);
      tourGambar(zoo);
      System.out.print(nowX);
      System.out.print(",");
      System.out.println(nowY);
      System.out.println("Pilih Jalan(w:atas.s:bawah,a:kiri,d:kanan)");
      if(inputscan=='w'){
        now=moveAtas(zoo);
        nowX=now.getPositionX();
        nowY=now.getPositionY();
      }else if(inputscan=='s'){
        now=moveBawah(zoo);
        nowX=now.getPositionX();
        nowY=now.getPositionY();
      }else if(inputscan=='d'){
        now=moveKanan(zoo);
        nowX=now.getPositionX();
        nowY=now.getPositionY();
      }else if(inputscan=='a'){
        now=moveKiri(zoo);
        nowX=now.getPositionX();
        nowY=now.getPositionY();
      }
      for(i=0;i<counter;i++){
        tempListCage[i].move();
      }
      input=new Scanner(System.in);
      inputscan=input.next().charAt(0);
    }
  }
}
