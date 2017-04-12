package animal;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * <br>NIM          : 13515147
 * <br>Nama File    : Animal.java
 * <br>Tanggal      : 25-Mar-17
 */
public class Animal {
    /** Type habitat hewan. 0 : darat, 1 : udara, 2 : air
     */
    protected int[] type;
    /** Family hewan
     */
    protected String famili;
    /** Species hewan
     */
    protected String species;
    /** Experience hewan
     */
    protected String experience;
    /** Jenis Makanan hewan. 1 : herbifor, 2 : karnivor, 3 : omnifor
     */
    protected short jenis_makanan;
    /**  Berat hewan
     */
    protected int berat;
    /** Char yang digunakan untuk render
     */
    protected char animalChar;
    /** Array of char yang berisi list musuhnya
     */
    protected char[] enemyChar;
    /** Pointer EnemyChar yang available
     */
    protected int topEnemy;

    public Animal() {
      int i;
        type = new int[3];
        for(i=0;i<3;i++){
            type[i]=0;
        }
        enemyChar = new char[10];
        topEnemy = 0;
    }
    /** Komunikasi dengan hewan
     */
    public void getExperience() {
        System.out.println( "Hewan ini tinggal di : ");
        if (type[0]==1) System.out.println("darat ");
        if (type[1]==1) System.out.println("udara ");
        if (type[2]==1) System.out.println("air ");
        System.out.print("Hewan ini tergabung di famili ");
        System.out.print(famili);
        System.out.print(" dan dengan nama spesies ");
        System.out.println(species);
        System.out.println(experience);
    }

    public double getFoodNum(){
        double jumlah_makanan;
        if(jenis_makanan==1){
            jumlah_makanan=berat*0.5;
        }
        else{
            if(jenis_makanan==2){
                jumlah_makanan=berat*0.2;
            }
            else{
                jumlah_makanan=berat*0.3;
            }
        }
        return jumlah_makanan;
    }

    /**  Print karakter simbol pada peta
     * @return char
     */
    public char getRender() {

        return (animalChar);
    }
    /** Set karakter hewan
     * @param cc Karakter hewan tsb
     */
    public void setEnemy(char cc) {
        enemyChar[topEnemy] = cc;
        topEnemy++;
    }
    /** Ambil list musuh
     * @return List Musuh
     */
    public char[] getEnemy() {
        return enemyChar;
    }
    /** dapat jumlah musuh
     * @return jumlah musuh
     */
    public int getTopEnemy() {
        return topEnemy;
    }

    /** Ambil tipe habitat hewan
     * @return List habitat
     */
    public int[] getType() {
        return (type);
    }
    /** Ambil species hewan
     * @return string species
     */
    public String getSpecies() {
        return species;
    }
    /** Ambil famili hewan
     * @return string famili
     */
    public String getFamili() {
        return famili;
    }
    /** Ambil experience hewan
     * @return string experience
     */
    public String getIsiExperience() {
        return experience;
    }
}
