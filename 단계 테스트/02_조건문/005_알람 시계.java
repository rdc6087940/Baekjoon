import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int h, m;
    h = sc.nextInt();
    m = sc.nextInt();

    if (m < 45) {
      m = m + 15;
      h = h - 1;
      if (h < 0) {
        h = 23;
      }
    } else {
      m = m - 45;
    }

    System.out.println(h + " " + m);
  }
}
