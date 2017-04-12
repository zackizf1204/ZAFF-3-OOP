package animal.landanimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.LandAnimal .java
 * Tanggal      : 28-Mar-17
 */
class LandAnimalTest {
    @Test
    void getType() {
        LandAnimal A = new LandAnimal();
        assertTrue(A.getType()[0]== 1);
    }

}