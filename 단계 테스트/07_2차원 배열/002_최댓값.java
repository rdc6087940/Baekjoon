import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int pointA = 0;
    int pointB = 0;
    int max = -1;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        int a = sc.nextInt();

        if (max < a) {
          max = a;
          pointA = i + 1;
          pointB = j + 1;
        }
      }
    }

    System.out.println(max);
    System.out.print(pointA + " " + pointB);
    sc.close();
  }
}
