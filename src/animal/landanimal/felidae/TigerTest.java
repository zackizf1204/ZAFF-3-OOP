package animal.landanimal.felidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.felidae.Tiger .java
 * Tanggal      : 28-Mar-17
 */
class TigerTest {
    @Test
    void getFoodNum() {
        Tiger E = new Tiger();
        int I = 400;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Tiger E = new Tiger();
        char C = 'T';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Tiger E = new Tiger();
        String S = "Panthera tigris tigris";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Tiger E = new Tiger();
        String S = "Felidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Tiger E = new Tiger();
        String S = "ROAR!";
        assertTrue(E.getIsiExperience()== S);
    }

}