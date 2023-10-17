import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        System.out.println(Fibo(N));
    }
    static int Fibo(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return Fibo(num - 1) + Fibo(num - 2);
    }
}
