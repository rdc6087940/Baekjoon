import java.util.*;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] scoreList = new int[n];

    double max = 0;
    for(int i=0;i<n;i++){
      scoreList[i] = sc.nextInt();
      if(scoreList[i] > max){
        max = scoreList[i];
      }
    }

    double total = 0;
    for(int score : scoreList){
      total += score/max*100.0;
    }

    System.out.println(total/n);
  }
}
