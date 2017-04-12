package animal.landanimal.equidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.equidae.Equidae .java
 * Tanggal      : 28-Mar-17
 */
class EquidaeTest {
    @Test
    void getFamili() {
        Equidae E = new Equidae();
        String S = "Equidae";
        assertTrue(E.getFamili()== S);
    }

}