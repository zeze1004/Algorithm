class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> output = new ArrayList<>();

        find(s, wordDict, output, 0, new ArrayList<>());

        return output;
    }

    private void find(String s, List<String> wordDict, List<String> output,
        int idx, List<String> tmp) {
            // wordDict에 있는 문자들만 넣었기에 s와 길이 같다면 곧 동일한 단어로 조합된 문자열이란 뜻
            if (idx == s.length()) {
                // System.out.println(tmp.toString());
                // tmp 예시(s = "catsanddog")
                // tmp = { [cat, sand, dog]
                //         [cats, and, dog] }
                output.add(String.join(" ", tmp));
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = idx; i < s.length(); i++) {
                sb.append(s.charAt(i));

                // sb 문자열이 wordDict에 있다면
                if (wordDict.contains(sb.toString())) {
                    tmp.add(sb.toString());
                    // System.out.println("add");
                    // System.out.println(tmp.toString() + " i: " + i);
                    find(s, wordDict, output, i + 1, tmp);
                    tmp.remove(tmp.size() - 1);
                    // System.out.println("remove");
                    // System.out.println(tmp.toString() + " i: " + i);
                }
            }
        }
}