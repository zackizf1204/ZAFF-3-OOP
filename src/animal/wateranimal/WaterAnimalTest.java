package animal.wateranimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.WaterAnimal .java
 * Tanggal      : 28-Mar-17
 */
class WaterAnimalTest {
    @Test
    void getType() {
        WaterAnimal A = new WaterAnimal();
        assertTrue(A.getType()[2]== 1);
    }

}