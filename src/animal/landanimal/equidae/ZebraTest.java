package animal.landanimal.equidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.equidae.Zebra .java
 * Tanggal      : 28-Mar-17
 */
class ZebraTest {
    @Test
    void getFoodNum() {
        Zebra E = new Zebra();
        int I = 1750;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Zebra E = new Zebra();
        char C = 'Z';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Zebra E = new Zebra();
        String S = "Equus quagga";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Zebra E = new Zebra();
        String S = "Equidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Zebra E = new Zebra();
        String S = "Its like a horse but black and white";
        assertTrue(E.getIsiExperience()== S);
    }

}