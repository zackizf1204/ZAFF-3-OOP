package animal.wateranimal.selachimorpha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.selachimorpha.Selachimorpha .java
 * Tanggal      : 28-Mar-17
 */
class SelachimorphaTest {
    @Test
    void getFamili() {
        Selachimorpha E = new Selachimorpha();
        String S = "Selachimorpha";
        assertTrue(E.getFamili()== S);
    }

}