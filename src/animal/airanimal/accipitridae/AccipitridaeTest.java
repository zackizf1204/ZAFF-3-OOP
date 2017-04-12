package animal.airanimal.accipitridae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : AccipitridaeTest.java
 * Tanggal      : 27-Mar-17
 */
class AccipitridaeTest {
    @Test
    void getFamili() {
        Accipitridae E = new Accipitridae();
        String S = "Accipitridae";
        assertTrue(E.getFamili()== S);
    }

}