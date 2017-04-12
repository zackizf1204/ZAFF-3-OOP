package animal.wateranimal.syngnathydae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.syngnathydae.SeaDragon .java
 * Tanggal      : 28-Mar-17
 */
class SeaDragonTest {
    @Test
    void getFoodNum() {
        SeaDragon E = new SeaDragon();
        int I = 2;
        assertTrue(E.getFoodNum()== I);
    }

    @Test
    void getRender() {
        SeaDragon E = new SeaDragon();
        char C = 'V';
        assertTrue(E.getRender()== C);
    }

    @Test
    void getSpecies() {
        SeaDragon E = new SeaDragon();
        String S = "Phycodurus eques";
        assertTrue(E.getSpecies()== S);
    }

    @Test
    void getFamili() {
        SeaDragon E = new SeaDragon();
        String S = "Syngnathydae";
        assertTrue(E.getFamili()== S);
    }

    @Test
    void getIsiExperience() {
        SeaDragon E = new SeaDragon();
        String S = "It's a Dragon but on water";
        assertTrue(E.getIsiExperience()== S);
    }

}