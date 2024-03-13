import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();

    String word = "";
    for (int i = 0; i < n / 4; i++) {
      word += "long ";
    }

    System.out.println(word + "int");
  }
}
