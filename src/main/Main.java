/**
 * 
 */
package main;
import cell.Cell;

import pointer.Pointer;
import pointer.facility.park.Park;
import pointer.facility.restaurant.Restaurant;
import pointer.facility.road.Road;
import pointer.facility.road.entrance.Entrance;
import pointer.facility.road.exit.Exit;
import tour.Tour;
import cage.Cage;
import habitat.landhabitat.LandHabitat;
import habitat.waterhabitat.WaterHabitat;
import habitat.airhabitat.AirHabitat;
import animal.amphibi.cryptobranchidae.Salamander;
import animal.airanimal.accipitridae.Eagle;
import animal.airanimal.phasianidae.Peacock;
import animal.airanimal.psittacifurmes.Cockatoo;
import animal.landanimal.canidae.Fox;
import animal.landanimal.canidae.Wolf;
import animal.landanimal.cervidae.Kijang;
import animal.landanimal.cervidae.Reindeer;
import animal.landanimal.elephantidae.AfricanElephant;
import animal.landanimal.equidae.Horse;
import animal.landanimal.equidae.Zebra;
import animal.landanimal.felidae.Lion;
import animal.landanimal.felidae.Tiger;
import animal.landanimal.pythonidae.CarpetPython;
import animal.landanimal.pythonidae.IndianPython;
import animal.landanimal.ursoidea.Bear;
import animal.landanimal.ursoidea.Panda;
import animal.wateranimal.cetacea.Dolphin;
import animal.wateranimal.cetacea.Whale;
import animal.wateranimal.selachimorpha.WhiteShark;
import animal.wateranimal.syngnathydae.SeaDragon;
import java.util.Scanner;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Main.java
 * Tanggal : 28 Maret 2017
 */

public class Main {
  public static void main(String[] args){
    char inputScan;
    Pointer nowPoint;
    Cage kandangLand[];
    Cage kandangAir[];
    Cage kandangWater[];
    Cell zoo=new Cell();
    int i,j,landCounter,waterCounter,airCounter,counter;
    Scanner input;
    kandangLand=new Cage[3];
    kandangAir=new Cage[3];
    kandangWater=new Cage[3];
    for(i=0;i<3;i++){
      kandangLand[i]=new Cage(0,100);
      kandangAir[i]=new Cage(1,100);
      kandangWater[i]=new Cage(2,100);
    }
    for(i=0;i<zoo.getSizeX();i++){
      zoo.setPoint(0,i,new Park(0,i));
    }
    for(i=0;i<zoo.getSizeY()-1;i++){
      for(j=1;j<4;j++){
        zoo.setPoint(j,i,new LandHabitat(j,i));
        nowPoint=zoo.getPoint(j,i);
        nowPoint.setHabitat(new LandHabitat(j,i));
      }
    }
    for(i=zoo.getSizeY()-4;i<zoo.getSizeY()-1;i++){
      for(j=4;j<zoo.getSizeX();j++){
        zoo.setPoint(j,i,new AirHabitat(j,i));
        nowPoint=zoo.getPoint(j,i);
        nowPoint.setHabitat(new AirHabitat(j,i));
      }
    }
    counter=0;
    i=5;
    while(i<zoo.getSizeX()-1){
      for(j=0;j<zoo.getSizeY()-5;j++){
        if(counter%3==0){
          zoo.setPoint(i,j,new WaterHabitat(i,j));
          nowPoint=zoo.getPoint(i,j);
          nowPoint.setHabitat(new WaterHabitat(i,j));
          zoo.setPoint(i+1,j,new WaterHabitat(i+1,j));
          nowPoint=zoo.getPoint(i+1,j);
          nowPoint.setHabitat(new WaterHabitat(i+1,j));
          zoo.setPoint(i+2,j,new WaterHabitat(i+2,j));
          nowPoint=zoo.getPoint(i+2,j);
          nowPoint.setHabitat(new WaterHabitat(i+2,j));
        }else if(counter%3==1){
          zoo.setPoint(i,j,new LandHabitat(i,j));
          nowPoint=zoo.getPoint(i,j);
          nowPoint.setHabitat(new LandHabitat(i,j));
          zoo.setPoint(i+1,j,new LandHabitat(i+1,j));
          nowPoint=zoo.getPoint(i+1,j);
          nowPoint.setHabitat(new LandHabitat(i+1,j));
          zoo.setPoint(i+2,j,new LandHabitat(i+2,j));
          nowPoint=zoo.getPoint(i+2,j);
          nowPoint.setHabitat(new LandHabitat(i+2,j));
        }else if(counter%3==2){
          zoo.setPoint(i,j,new AirHabitat(i,j));
          nowPoint=zoo.getPoint(i,j);
          nowPoint.setHabitat(new AirHabitat(i,j));
          zoo.setPoint(i+1,j,new AirHabitat(i+1,j));
          nowPoint=zoo.getPoint(i+1,j);
          nowPoint.setHabitat(new AirHabitat(i+1,j));
          zoo.setPoint(i+2,j,new AirHabitat(i+2,j));
          nowPoint=zoo.getPoint(i+2,j);
          nowPoint.setHabitat(new AirHabitat(i+2,j));
        }
      }
      counter=counter+1;
      i=i+3;
    }
    zoo.setPoint(4,0, new Entrance(4,0));
    zoo.setPoint(19,15, new Exit(19,15));
    for(i=1;i<zoo.getSizeY()-4;i++){
      zoo.setPoint(4,i,new Road(4,i));
    }
    for(i=4;i<zoo.getSizeX()-1;i++){
      zoo.setPoint(i,zoo.getSizeY()-5,new Road(i,zoo.getSizeY()-5));
    }
    for(i=1;i<zoo.getSizeX();i++){
      zoo.setPoint(i,19, new Restaurant(i,19));
    }
    landCounter=0;
    zoo.setCage(kandangLand[landCounter]);
    for(i=0;i<zoo.getSizeY()-1;i++){
      for(j=1;j<4;j++){
   	    kandangLand[landCounter].addHabitat(new LandHabitat(j,i));
      }
    }
    airCounter=0;
    zoo.setCage(kandangAir[airCounter]);
    for(i=zoo.getSizeY()-4;i<zoo.getSizeY()-1;i++){
      for(j=4;j<zoo.getSizeX();j++){
        kandangAir[airCounter].addHabitat(new AirHabitat(j,i));
      }
    }
    landCounter=1;
    airCounter=1;
    waterCounter=0;
    counter=0;
    i=5;
    while(i<zoo.getSizeX()-1){
      if(counter%3==0){
       	zoo.setCage(kandangWater[waterCounter]);
        waterCounter=waterCounter+1;
      }else if(counter%3==1){
        zoo.setCage(kandangLand[landCounter]);
        landCounter=landCounter+1;
      }else if(counter%3==2){
        zoo.setCage(kandangAir[airCounter]);
        airCounter=airCounter+1;
      }
      for(j=0;j<zoo.getSizeY()-5;j++){
        if(counter%3==0){
          kandangWater[waterCounter-1].addHabitat(new WaterHabitat(i,j));
          kandangWater[waterCounter-1].addHabitat(new WaterHabitat(i+1,j));
          kandangWater[waterCounter-1].addHabitat(new WaterHabitat(i+2,j));
        }else if(counter%3==1){
          kandangLand[landCounter-1].addHabitat(new LandHabitat(i,j));
          kandangLand[landCounter-1].addHabitat(new LandHabitat(i+1,j));
          kandangLand[landCounter-1].addHabitat(new LandHabitat(i+2,j));
        }else if(counter%3==2){
          kandangAir[airCounter-1].addHabitat(new AirHabitat(i,j));
          kandangAir[airCounter-1].addHabitat(new AirHabitat(i+1,j));
          kandangAir[airCounter-1].addHabitat(new AirHabitat(i+2,j));
        }
      }
      counter=counter+1;
      i=i+3;
    }
    kandangAir[0].addHewan(new Cockatoo(), 4, 18);
    kandangAir[0].addHewan(new Peacock(), 9, 18);
    kandangAir[1].addHewan(new Eagle(), 11, 0);
    kandangLand[0].addHewan(new Kijang(), 2, 6);
    kandangLand[0].addHewan(new Bear(),3, 3);
    kandangLand[0].addHewan(new Reindeer(), 2, 9);
    kandangLand[0].addHewan(new Zebra(), 2, 18);
    kandangLand[0].addHewan(new IndianPython(), 3, 6);
    kandangLand[1].addHewan(new Lion(), 8, 0);
    kandangLand[1].addHewan(new Horse(), 10, 3);
    kandangLand[1].addHewan(new AfricanElephant(), 10, 2);
    kandangLand[1].addHewan(new Tiger(), 8, 3);
    kandangLand[1].addHewan(new Panda(),9,2);
    kandangLand[2].addHewan(new Salamander(),19,0);
    kandangLand[2].addHewan(new Fox(), 18, 2);
    kandangLand[2].addHewan(new Wolf(), 17, 3);
    kandangLand[2].addHewan(new CarpetPython(),18, 5);
    kandangWater[0].addHewan(new Dolphin(), 5, 5);
    kandangWater[0].addHewan(new Whale(),6, 8);
    kandangWater[1].addHewan(new WhiteShark(),14,5);
    kandangWater[1].addHewan(new SeaDragon(), 15, 2);
    System.out.println("Selamat datang di ZaffZoo");
    System.out.println("Menu yang tersedia: ");
    System.out.println("1. Display Virtual Zoo");
    System.out.println("2. Tour Virtual Zoo");
    System.out.println("3. Display Makanan Total");
    System.out.println("4. Exit Zoo");
    System.out.println("Masukkan menu pilihan : ");
    input=new Scanner(System.in);
    inputScan=input.next().charAt(0);
    do{
      if (inputScan == '1'){
        zoo.gambar();
      }
      else if (inputScan == '2'){
        Tour tour=new Tour(zoo);
        tour.gerak(zoo);
      }
      else if (inputScan == '3'){
        System.out.print("Jumlah makanan yang dibutuhkan adalah : ");
        System.out.println(zoo.getMakananTotal());
      }
      System.out.println("Menu yang tersedia: ");
      System.out.println("1. Display Virtual Zoo");
      System.out.println("2. Tour Virtual Zoo");
      System.out.println("3. Display Makanan Total");
      System.out.println("4. Exit Zoo");
      System.out.println("Masukkan menu pilihan : ");
      input=new Scanner(System.in);
      inputScan=input.next().charAt(0);
    } while (inputScan !='4');
  }
}
