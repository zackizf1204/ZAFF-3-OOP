package animal.amphibi.cryptobranchidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.amphibi.cryptobranchidae.Salamander .java
 * Tanggal      : 28-Mar-17
 */
class SalamanderTest {
    @Test
    void getFoodNum() {
        Salamander E = new Salamander();
        int I = 60;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Salamander E = new Salamander();
        char C = 'U';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Salamander E = new Salamander();
        String S = "Adnrias japonicus";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Salamander E = new Salamander();
        String S = "Cryptobranchidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Salamander E = new Salamander();
        String S = "Salamander";
        assertTrue(E.getIsiExperience()== S);
    }

}