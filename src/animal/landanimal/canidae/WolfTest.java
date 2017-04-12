package animal.landanimal.canidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.canidae.Wolf.java
 * Tanggal      : 28-Mar-17
 */
class WolfTest {
    @Test
    void getFoodNum() {
        Wolf E = new Wolf();
        int I = 100;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Wolf E = new Wolf();
        char C = 'W';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Wolf E = new Wolf();
        String S = "Canis lupus arctos";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Wolf E = new Wolf();
        String S = "Canidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Wolf E = new Wolf();
        String S = "Howl!";
        assertTrue(E.getIsiExperience()== S);
    }

}