package animal.airanimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.airanimal.AirAnimal .java
 * Tanggal      : 27-Mar-17
 */
class AirAnimalTest {
    @Test
    void getType() {
        AirAnimal A = new AirAnimal();
        assertTrue(A.getType()[1]== 1);
    }

}