import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    List<String> list = new ArrayList<>();

    for(int i=0;i<t;i++){
      String word = sc.next();
      list.add(word.substring(0,1) + word.substring(word.length()-1));
    }

    for(String ans : list){
      System.out.println(ans);
    }

  }
}
