import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t,a,b;
    t = sc.nextInt();

    List<Integer> ansList = new ArrayList<>();

    for (int i = 0; i < t; i++) {
      a = sc.nextInt();
      b = sc.nextInt();
      ansList.add(a+b);
    }

    for(int ans : ansList){
      System.out.println(ans);
    }
  }
}
