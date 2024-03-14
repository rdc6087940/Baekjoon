import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    List<Integer> targetList = new ArrayList<Integer>();

    int n = sc.nextInt();
    int min=0;
    int max=0;
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      if(a<min || min == 0){
        min = a;
      }
      if(a>max || max == 0){
        max = a;
      }
    }
    System.out.println(min + " " + max);

  }
}
