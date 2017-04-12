package animal.landanimal.canidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.canidae.Canidae .java
 * Tanggal      : 28-Mar-17
 */
class CanidaeTest {
    @Test
    void getFamili() {
        Canidae E = new Canidae();
        String S = "Canidae";
        assertTrue(E.getFamili()== S);
    }

}