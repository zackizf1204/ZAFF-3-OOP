package animal.landanimal.ursoidea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.ursoidea.Ursoidea .java
 * Tanggal      : 28-Mar-17
 */
class UrsoideaTest {
    @Test
    void getFamili() {
        Ursoidea E = new Ursoidea();
        String S = "Ursoidea";
        assertTrue(E.getFamili()== S);
    }

}