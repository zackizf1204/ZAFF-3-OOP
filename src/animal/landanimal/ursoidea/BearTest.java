package animal.landanimal.ursoidea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.ursoidea.Bear .java
 * Tanggal      : 28-Mar-17
 */
class BearTest {
    @Test
    void getFoodNum() {
        Bear E = new Bear();
        int I = 1410;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Bear E = new Bear();
        char C = 'B';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Bear E = new Bear();
        String S = "Ursus arctos";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Bear E = new Bear();
        String S = "Ursoidea";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Bear E = new Bear();
        String S = "BROAARGH";
        assertTrue(E.getIsiExperience()== S);
    }

}