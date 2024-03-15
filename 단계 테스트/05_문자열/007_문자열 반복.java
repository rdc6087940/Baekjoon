import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    String ans = "";
    for(int i = 0; i < t; i++){
      int n = sc.nextInt();
      String word = sc.next();

      for(int j = 0; j < word.length(); j++){
        for(int k = 0; k < n; k++){
          ans += word.charAt(j);
        }
      }
      ans += "\n";

    }
    System.out.println(ans);

  }
}
