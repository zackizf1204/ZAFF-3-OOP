package animal.landanimal.felidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.felidae.Felidae .java
 * Tanggal      : 28-Mar-17
 */
class FelidaeTest {
    @Test
    void getFamili() {
        Felidae E = new Felidae();
        String S = "Felidae";
        assertTrue(E.getFamili()== S);
    }

}