public class P72410 {

    public static void main(String[] args) {
        String name = "=.=";

        System.out.println(modifyName(name));
    }

    private static String modifyName(String new_id) {

        // 1단계: 모든 대문자를 대응되는 소문자로 치환
        StringBuilder sb = new StringBuilder(new_id.toLowerCase());

        // 2단계: 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        for (int i = 0; i < sb.length(); i++) {
            if (('a' <= sb.charAt(i) && 'z' >= sb.charAt(i)) || ('0' <= sb.charAt(i) && '9' >= sb.charAt(i))) {
                continue;
            }
            else if (sb.charAt(i) != '-' && sb.charAt(i) != '_' && sb.charAt(i) != '.') {
                sb.deleteCharAt(i);
                i--;
            }
        }

        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.') {
                for (int j = i + 1; j < sb.length(); j++) {
                    if (sb.charAt(j) == '.') {
                        sb.deleteCharAt(j);
                        j--;
                    } else break;
                }
            }
        }

        // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        if (sb.charAt(0) == '.') {
            if (sb.length() == 1) {
                sb = sb.deleteCharAt(0);
            } else {
                sb.deleteCharAt(0);
            }
        }
        if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        // 5단계: 빈 문자열이라면, sb에 "a"를 대입
        if (sb.length() == 0) sb.append('a');

        // 6단계: 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        //       만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (sb.length() > 15) {
            sb.replace(15, sb.length(), "");
        }
        if (sb.charAt(sb.length() - 1) == '.') sb.deleteCharAt(sb.length() - 1);

        // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        if (sb.length() <= 2) {
            while (sb.length() <= 2) {
                sb.append(sb.charAt(sb.length() - 1));
            }
        }

        return sb.toString();
    }
}
