import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int p = 0;
    int max = 0;
    for(int i=1;i<=9;i++){
      int a = sc.nextInt();
      if(max < a){
        p = i;
        max = a;
      }
    }
    System.out.println(max);
    System.out.println(p);

  }
}
