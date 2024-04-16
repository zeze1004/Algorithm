import java.util.Scanner;

public class B1251 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        // scanner.close();
        String input = "mobitel";
        String result = getSmallestReversedWord(input);
        System.out.println(result);
    }

    private static String getSmallestReversedWord(String input) {
        String result = "}";

        for (int i = 0; i < input.length() - 2; i++) {         // 처음 단어는 문장 끝에서 첫, 두번째 글자는 포함 못함
            for (int j = i + 1; j < input.length() - 1; j++) { // 중간 단어는 문장 끝의 첫 번째 글자는 포함 못함
                StringBuilder val = new StringBuilder();

                for (int u = i; u >= 0; u--)
                    val.append(input.charAt(u));

                for (int u = j; u > i; u--)
                    val.append(input.charAt(u));

                for (int u = input.length() - 1; u > j; u--)
                    val.append(input.charAt(u));

                if (result.compareTo(val.toString()) > 0) // result가 val보다 사전순으로 크면 0을 반환
                    result = val.toString();
            }
        }

        return result;
    }
}
