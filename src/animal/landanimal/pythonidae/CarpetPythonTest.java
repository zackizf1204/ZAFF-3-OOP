package animal.landanimal.pythonidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.pythonidae.CarpetPython .java
 * Tanggal      : 28-Mar-17
 */
class CarpetPythonTest {
    @Test
    void getFoodNum() {
        CarpetPython E = new CarpetPython();
        int I = 24;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        CarpetPython E = new CarpetPython();
        char C = 'Q';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        CarpetPython E = new CarpetPython();
        String S = "Morelia spilota";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        CarpetPython E = new CarpetPython();
        String S = "Pythonidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        CarpetPython E = new CarpetPython();
        String S = "SSSSSSSSSSSSSSSSSSSSSSSSS";
        assertTrue(E.getIsiExperience()== S);
    }

}