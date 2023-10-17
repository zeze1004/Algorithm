import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(recursive(stdIn.nextInt()));
    }

    private static long recursive(int num) {
        if(num <= 1)
                return 1;
        return recursive(num - 1) * num;
    }
}