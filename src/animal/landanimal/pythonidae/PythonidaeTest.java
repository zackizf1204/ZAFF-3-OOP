package animal.landanimal.pythonidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.pythonidae.Pythonidae .java
 * Tanggal      : 28-Mar-17
 */
class PythonidaeTest {
    @Test
    void getFamili() {
        Pythonidae E = new Pythonidae();
        String S = "Pythonidae";
        assertTrue(E.getFamili()== S);
    }

}