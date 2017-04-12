package animal.landanimal.pythonidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.pythonidae.IndianPython .java
 * Tanggal      : 28-Mar-17
 */
class IndianPythonTest {
    @Test
    void getFoodNum() {
        IndianPython E = new IndianPython();
        int I = 6;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        IndianPython E = new IndianPython();
        char C = 'F';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        IndianPython E = new IndianPython();
        String S = "Python molurus";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        IndianPython E = new IndianPython();
        String S = "Pythonidae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        IndianPython E = new IndianPython();
        String S = "Hssssssh!";
        assertTrue(E.getIsiExperience()== S);
    }

}