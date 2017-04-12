package animal.wateranimal.cetacea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.cetacea.Whale .java
 * Tanggal      : 28-Mar-17
 */
class WhaleTest {
    @Test
    void getFoodNum() {
        Whale E = new Whale();
        int I = 300000;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Whale E = new Whale();
        char C = 'X';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Whale E = new Whale();
        String S = "Balaenoptera musculus";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Whale E = new Whale();
        String S = "Cetacea";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Whale E = new Whale();
        String S = "MASSIVE SEA-CREATURE";
        assertTrue(E.getIsiExperience()== S);
    }

}