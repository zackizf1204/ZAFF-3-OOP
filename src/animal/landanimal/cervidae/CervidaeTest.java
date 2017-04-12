package animal.landanimal.cervidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : CervidaeTest.java
 * Tanggal      : 28-Mar-17
 */
class CervidaeTest {
    @Test
    void getFamili() {
        Cervidae E = new Cervidae();
        String S = "Cervidae";
        assertTrue(E.getFamili()== S);
    }

}