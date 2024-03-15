import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);

      String ans = "";
      
      for(int i = 0;i<6;i++){
        int n = sc.nextInt();

        if(i<=1){
          ans += 1-n + " ";
        }else if(i<=4){
          ans += 2-n + " ";
        }else{
          ans += 8-n;
        }
      }
      System.out.println(ans);
      
    }
}
