import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int[] basket = new int[30];
    for(int i=0; i<30; i++){
      basket[i] = i+1;
    }
    for(int i=0;i<28;i++){
      int a = sc.nextInt();
      basket[a-1] = 0; 
    }

    String ans = "";
    for(int bas : basket){
      if(bas != 0){
        ans += bas + " ";
      }
    }
    System.out.println(ans.substring(0,ans.length()-1));
  }
}
