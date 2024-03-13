import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int h, m, time;
    h = sc.nextInt();
    m = sc.nextInt();
    time = sc.nextInt();

    m = m + time;
    if(m >= 60){
      h = h + m/60;
      m = m%60;
    }

    if(h >= 24){
      h = h%24;
    }
    System.out.println(h + " " + m);
  }
}
