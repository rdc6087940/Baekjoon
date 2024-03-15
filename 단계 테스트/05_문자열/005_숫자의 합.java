import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int len = sc.nextInt();
    String word = sc.next();

    int total = 0;
    for(int i=1; i<=len; i++){
      total += Integer.parseInt(word.substring(i-1,i));
    }
  
    System.out.println(total);

  }
}
