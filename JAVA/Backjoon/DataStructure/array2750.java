import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array2750 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = stdIn.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[k - 1]);
    }
}