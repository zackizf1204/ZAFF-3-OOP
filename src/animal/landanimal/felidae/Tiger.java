package animal.landanimal.felidae;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * <br>NIM          : 13515147
 * <br>Nama File    : Tiger.java
 * <br>Tanggal      : 26-Mar-17
 */
public class Tiger extends Felidae{
    /**
     * Konstruktor Tiger
     */
    public Tiger() {
        super();
        species = "Panthera tigris tigris";
        experience = "ROAR!";
        berat = 2000;
        animalChar = 'T';
        jenis_makanan =2;
        setEnemy('C');
    }
}
