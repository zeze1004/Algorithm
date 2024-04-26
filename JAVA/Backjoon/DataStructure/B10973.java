import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10973 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (findPrevPermutation(arr)) {
            // 이전 순열을 찾는 데 성공한 경우
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            // 이전 순열이 존재하지 않는 경우
            System.out.println(-1);
        }
    }

    static boolean findPrevPermutation(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] <= arr[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        // 뒤의 숫자끼리만 교체해도 이전 순열이면 돌지 않음 + reverse도 필요없음
        int j = arr.length - 1;
        while (arr[j] >= arr[i - 1]) {
            j--;
        }

        swap(arr, i - 1, j);

        reverse(arr, i, arr.length - 1);

        return true;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 내림차순으로 정렬
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
