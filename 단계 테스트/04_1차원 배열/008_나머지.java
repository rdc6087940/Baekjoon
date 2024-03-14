import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    List<Integer> restList = new ArrayList<Integer>();

    for(int i=0; i<10; i++){
      int r = sc.nextInt()%42;
      
      int p = r;
      for(int rest: restList){
        if(rest == p){
          p = -1;
        }
      }
      if(p != -1){
        restList.add(p);
      }
      
    }
    System.out.println(restList.size());
  }
}
