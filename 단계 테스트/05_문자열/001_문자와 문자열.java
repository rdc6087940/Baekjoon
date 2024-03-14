import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    char[] word = sc.nextLine().toCharArray();

    int p = sc.nextInt();

    System.out.println(word[p-1]);
  }
}
