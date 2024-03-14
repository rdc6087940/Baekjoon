import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    List<Integer> targetList = new ArrayList<Integer>();

    int n = sc.nextInt();
    int x = sc.nextInt();
    String ans = "";
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      if(a<x){
        ans += a + " ";
      }
    }
    System.out.println(ans.substring(0, ans.length()-1));

  }
}
