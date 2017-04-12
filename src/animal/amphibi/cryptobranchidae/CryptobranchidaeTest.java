package animal.amphibi.cryptobranchidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.amphibi.cryptobranchidae.Cryptobranchidae .java
 * Tanggal      : 28-Mar-17
 */
class CryptobranchidaeTest {
    @Test
    void getFamili() {
        Cryptobranchidae E = new Cryptobranchidae();
        String S = "Cryptobranchidae";
        assertTrue(E.getFamili()== S);
    }

}