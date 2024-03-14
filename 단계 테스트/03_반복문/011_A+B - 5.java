import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    List<Integer> ansList = new ArrayList<Integer>();

    while (true) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (a == 0 && b == 0) {
        break;
      }
      ansList.add(a + b);
    }

    for (int ans : ansList) {
      System.out.println(ans);
    }
  }
}
