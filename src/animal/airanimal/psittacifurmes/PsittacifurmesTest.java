package animal.airanimal.psittacifurmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.airanimal.psittacifurmes.Psittacifurmes .java
 * Tanggal      : 27-Mar-17
 */
class PsittacifurmesTest {
    @Test
    void getFamili() {
        Psittacifurmes E = new Psittacifurmes();
        String S = "Psittacifurmes";
        assertTrue(E.getFamili()== S);
    }

}