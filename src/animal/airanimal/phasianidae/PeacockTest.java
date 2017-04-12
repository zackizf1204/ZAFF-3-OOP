package animal.airanimal.phasianidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.airanimal.phasianidae.Peacock .java
 * Tanggal      : 27-Mar-17
 */
class PeacockTest {
    @Test
    void getFoodNum() {
        Peacock E = new Peacock();
        int I = 15;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Peacock E = new Peacock();
        char C = 'M';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Peacock E = new Peacock();
        String S = "Afropavo congensis";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Peacock E = new Peacock();
        String S = "Phasianidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Peacock E = new Peacock();
        String S = "Rainbow Bird";
        assertTrue(E.getIsiExperience()== S);
    }

}