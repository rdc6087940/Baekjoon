import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    List<String> ansList = new ArrayList<String>();

    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      ansList.add(a + " + " + b + " = " + (a + b));
    }

    for (int i = 1; i <= ansList.size(); i++) {
      System.out.println("Case #" + i + ": " + ansList.get(i - 1));
    }

  }

}
