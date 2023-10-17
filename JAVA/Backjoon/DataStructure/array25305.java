import java.util.Arrays;
import java.util.Scanner;

public class array25305 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char[] arr = stdIn.nextLine().toCharArray();
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}
