import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] basket = new int[n];

    for(int i =0;i<n;i++){
      basket[i] = i+1;
    }

    for(int i=0;i<m;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();

      for(int j=a-1;j<=b-1;j++){
        int t = --b;
        int temp = basket[j];
        
        basket[j] = basket[t];
        basket[t] = temp;
      }
    }

    String ans = "";
    for(int bas : basket){
      ans += bas + " ";
    }
    System.out.println(ans.substring(0,ans.length()-1));
    
  }
}
