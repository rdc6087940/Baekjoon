import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      for(int i=0;i<n;i++){
        for(int j=n-i-1; j>0; j--){
          System.out.print(" ");
        }
        for(int k=0; k<i+1; k++){
          System.out.print("*");
        }
        for(int k=0; k<i; k++){
          System.out.print("*");
        }
        System.out.println("");
      }
      for(int i=n-2;i>=0;i--){
        for(int j=n-i-1; j>0; j--){
          System.out.print(" ");
        }
        for(int k=0; k<i+1; k++){
          System.out.print("*");
        }
        for(int k=0; k<i; k++){
          System.out.print("*");
        }
        if(i==0){
          break;
        }
        System.out.println("");
      }
    }
}
