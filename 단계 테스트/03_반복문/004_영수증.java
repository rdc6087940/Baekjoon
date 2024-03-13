import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int x, n, a, b;
    x = sc.nextInt();
    n = sc.nextInt();

    int result = 0;
    for (int i = 0; i < n; i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      result += a * b;
    }

    if (result == x) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
