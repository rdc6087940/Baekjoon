import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    int amount;

    if (a == b && b == c) {
      amount = 10000 + a * 1000;
    } else if (a == b || a == c) {
      amount = 1000 + a * 100;
    } else if (b == c) {
      amount = 1000 + b * 100;
    } else {
      if (a > b && a > c) {
        amount = a * 100;
      } else if (b > a && b > c) {
        amount = b * 100;
      } else {
        amount = c * 100;
      }
    }

    System.out.println(amount);

  }
}
