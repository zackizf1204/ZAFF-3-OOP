package animal.wateranimal.selachimorpha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.selachimorpha.WhiteShark .java
 * Tanggal      : 28-Mar-17
 */
class WhiteSharkTest {
    @Test
    void getFoodNum() {
        WhiteShark E = new WhiteShark();
        int I = 1800;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        WhiteShark E = new WhiteShark();
        char C = 'S';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        WhiteShark E = new WhiteShark();
        String S = "Carcharodon carcharias";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        WhiteShark E = new WhiteShark();
        String S = "Selachimorpha";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        WhiteShark E = new WhiteShark();
        String S = "It's a Big Shark";
        assertTrue(E.getIsiExperience()== S);
    }

}