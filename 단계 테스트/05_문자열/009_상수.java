import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuffer sb = new StringBuffer(sc.next());       
    int a = Integer.parseInt(sb.reverse().toString());

    sb = new StringBuffer(sc.next());       
    int b = Integer.parseInt(sb.reverse().toString());

    if(a>b){
      System.out.println(a);
    }else{
      System.out.println(b);
    }

  }

}
