import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    String word = sc.next();

    char a = 'a';
    for(int i=0;i<26;i++){
      System.out.print(word.indexOf((char)(a+i))+" ");
    }

  }
}
