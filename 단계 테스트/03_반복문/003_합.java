import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();

    int result;
    if (n % 2 == 0) {
      result = (n + 1) * n / 2;
    } else {
      result = (n + 1) * (n / 2) + (n / 2 + 1);
    }

    System.out.println(result);

  }
}
