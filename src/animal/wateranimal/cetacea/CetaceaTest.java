package animal.wateranimal.cetacea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.cetacea.Cetacea .java
 * Tanggal      : 28-Mar-17
 */
class CetaceaTest {
    @Test
    void getFamili() {
        Cetacea E = new Cetacea();
        String S = "Cetacea";
        assertTrue(E.getFamili()== S);
    }

}