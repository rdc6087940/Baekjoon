import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] basket = new int[n];
    for(int i=0;i<m;i++){
      int start = sc.nextInt();
      int end = sc.nextInt();
      int num = sc.nextInt();

      for(int j=start-1;j<end;j++){
        basket[j] = num;
      }
    }

    String ans = "";
    for(int bas : basket){
      ans += bas + " ";
    }
    System.out.println(ans.substring(0,ans.length()-1));
  }
}
