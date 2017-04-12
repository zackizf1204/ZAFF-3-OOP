package animal.amphibi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.amphibi.Amphibi .java
 * Tanggal      : 28-Mar-17
 */
class AmphibiTest {
    @Test
    void getType() {
        Amphibi A = new Amphibi();
        assertTrue((A.getType()[0]== 1)&&(A.getType()[2]== 1));
    }

}