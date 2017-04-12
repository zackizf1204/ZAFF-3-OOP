package animal.airanimal.phasianidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.airanimal.phasianidae.Phasianidae .java
 * Tanggal      : 27-Mar-17
 */
class PhasianidaeTest {
    @Test
    void getFamili() {
        Phasianidae E = new Phasianidae();
        String S = "Phasianidae";
        assertTrue(E.getFamili()== S);
    }

}