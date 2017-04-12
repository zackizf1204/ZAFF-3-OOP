package animal.landanimal.equidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.equidae.Horse .java
 * Tanggal      : 28-Mar-17
 */
class HorseTest {
    @Test
    void getFoodNum() {
        Horse E = new Horse();
        int I = 3000;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Horse E = new Horse();
        char C = 'J';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Horse E = new Horse();
        String S = "Equus caballus";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Horse E = new Horse();
        String S = "Equidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Horse E = new Horse();
        String S = "Neiiiiigh!";
        assertTrue(E.getIsiExperience()== S);
    }

}