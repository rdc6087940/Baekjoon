import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        System.out.print(binomial(N,K));

    }

    public static int binomial(int N,int K) {
        return fact(N)/(fact(K)*fact(N-K));
    }

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return fact(n-1) * n;
    }
}
