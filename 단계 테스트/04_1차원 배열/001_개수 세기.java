import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    List<Integer> targetList = new ArrayList<Integer>();

    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        targetList.add(sc.nextInt());
    }

    int v = sc.nextInt();
    int num = 0;
    for(int target : targetList){
        if(target == v){
            num++;
        }
    }

    System.out.println(num);
  }
}
