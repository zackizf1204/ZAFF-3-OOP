import java.util.Scanner;

/**
 * Created by 13515017 / Putu Arya Pradipta.
 * Tanggal 4/27/2017.
 * FileName : Main.java.
 */
public class Main {
  private static int getMinDist(int x, int y, int posx, int posy) {
    int tempx, tempy;
    if (posx > x) {
      tempx = posx - x;
    } else {
      tempx = x - posx;
    }
    if (posy > y) {
      tempy = posy - y;
    } else {
      tempy = y - posy;
    }
    return (tempx + tempy);
  }
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int posx = s.nextInt();
    int posy = s.nextInt();
    int x[] = new int[5];
    int y[] = new int[5];
    for (int i = 0; i < 5; i++){
      x[i] = s.nextInt();
      y[i] = s.nextInt();
    }
    int curnum = getMinDist(x[0],y[0],posx,posy);
    int retval = 0;
    for (int i = 1; i < 5; i++) {
      if (getMinDist(x[i],y[i],posx,posy) < curnum) {
        retval = i;
        curnum = getMinDist(x[i],y[i],posx,posy);
      }
    }
    System.out.println(x[retval]+" "+y[retval]);
    // hitung jarak

  }
}
