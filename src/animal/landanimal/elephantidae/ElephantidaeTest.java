package animal.landanimal.elephantidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.elephantidae.Elephantidae .java
 * Tanggal      : 28-Mar-17
 */
class ElephantidaeTest {
    @Test
    void getFamili() {
        Elephantidae E = new Elephantidae();
        String S = "Elephantidae";
        assertTrue(E.getFamili()== S);
    }

}