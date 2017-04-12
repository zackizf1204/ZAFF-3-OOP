/**
 * 
 */
package cage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : CageTest.java
 * Tanggal : 28 Maret 2017
 */
public class CageTest {
	@Test
	  void getJumlahMakanan(){
		Cage nowCage=new Cage(0,1);
	    assertTrue(nowCage.getJumlahMakan()==0);
	  }
	@Test
	  void getNumberCage(){
		Cage nowCage=new Cage(0,1);
	    assertTrue(nowCage.getNumberCage()==0);
	  }
}
