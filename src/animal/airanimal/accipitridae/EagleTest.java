package animal.airanimal.accipitridae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : EagleTest.java
 * Tanggal      : 27-Mar-17
 */
class EagleTest {
    @Test
    void getFoodNum() {
        Eagle E = new Eagle();
        int I = 12;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Eagle E = new Eagle();
        char C = 'E';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Eagle E = new Eagle();
        String S = "Aquila chrysaetos";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Eagle E = new Eagle();
        String S = "Accipitridae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Eagle E = new Eagle();
        String S = "screeech!";
        assertTrue(E.getIsiExperience()== S);
    }

}