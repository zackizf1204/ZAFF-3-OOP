package animal.wateranimal.syngnathydae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.syngnathydae.Syngnathydae .java
 * Tanggal      : 28-Mar-17
 */
class SyngnathydaeTest {
    @Test
    void getFamili() {
        Syngnathydae E = new Syngnathydae();
        String S = "Syngnathydae";
        assertTrue(E.getFamili()== S);
    }

}