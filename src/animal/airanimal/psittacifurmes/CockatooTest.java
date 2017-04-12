package animal.airanimal.psittacifurmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : CockatooTest.java
 * Tanggal      : 27-Mar-17
 */
class CockatooTest {
    @Test
    void getFoodNum() {
        Cockatoo E = new Cockatoo();
        int I = 20;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        Cockatoo E = new Cockatoo();
        char C = 't';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        Cockatoo E = new Cockatoo();
        String S = "Calyptorhynchus lathami";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        Cockatoo E = new Cockatoo();
        String S = "Psittacifurmes";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Cockatoo E = new Cockatoo();
        String S = "It can talk??";
        assertTrue(E.getIsiExperience()== S);
    }

}