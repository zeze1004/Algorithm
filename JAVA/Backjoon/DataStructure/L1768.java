public class L1768 {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();
        if (length1 > length2) {
            for (int i = 0; i < length2; i++) {
                sb.insert(i, word1.charAt(i));
            }
            for (int i = 0; i < length2; i++) {
                sb.insert(i * 2 + 1, word2.charAt(i));
            }
            for (int i = length2; i < length1; i++) {
                sb.append(word1.charAt(i));
            }
            return sb.toString();
        } else if (length1 < length2) {
            for (int i = 0; i < length1; i++) {
                sb.insert(i, word1.charAt(i));
            }
            System.out.println(sb);
            for (int i = 0; i < length1; i++) {
                sb.insert(i * 2 + 1, word2.charAt(i));
            }
            for (int i = length1; i < length2; i++) {
                sb.append(word2.charAt(i));
            }
            return sb.toString();
        } else {
            for (int i = 0; i < length1; i++) {
                sb.insert(i, word1.charAt(i));
            }
            for (int i = 0; i < length1; i++) {
                sb.insert(i * 2 + 1, word2.charAt(i));
            }
        }
        return sb.toString();

    }
}
