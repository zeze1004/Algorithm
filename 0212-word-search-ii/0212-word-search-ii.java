class Solution {
    int dx[] = {0, -1, 1, 0};
    int dy[] = {-1, 0, 0, 1};

    public List<String> findWords(char[][] board, String[] words) {
        List<String> output = new ArrayList<>();
        Trie trie = new Trie();
        for (int i = 0; i < words.length; i++) {
            // System.out.println(words[i]);
            trie.insert(words[i]);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int c = board[i][j] - 'a';
                if (trie.letters[c] != null) {
                    dfs(board, trie, output, i, j, new StringBuilder());
                }
            }
        }
        return output;
    }

    public void dfs(char[][] board, Trie node, List<String> output, int x, int y, StringBuilder sb) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] == '#') {
            return;
        }

        char isVisted = board[x][y];
        sb.append(board[x][y]);
        board[x][y] = '#';

        Trie nextNode = node.letters[isVisted - 'a'];
        if (nextNode.isEnd) {
            output.add(sb.toString());
            nextNode.isEnd = false; // 중복 방지
        }

        for (int d = 0; d < 4; d++) {
            int newX = x + dx[d];
            int newY = y + dy[d];

            if (newX < 0 || newY < 0 || newX >= board.length || newY >= board[0].length || board[newX][newY] == '#') {
                continue;
            }
            
            if (nextNode.letters[board[newX][newY] - 'a'] != null) {
                dfs(board, nextNode, output, newX, newY, sb);
            }
        }
        // 백트래킹
            board[x][y] = isVisted;
            // if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            // }
    }
}

class Trie {
    Trie[] letters = new Trie[26];
    boolean isEnd;

    public void insert(String word) {
        Trie node = this;

        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            if (node.letters[c] == null) {
                // System.out.println(word.charAt(i));
                node.letters[c] = new Trie();
            }
            node = node.letters[c];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = this;

        for (int i = 0; i < word.length(); i++) {
            // System.out.println(word.charAt(i));
            int c = word.charAt(i) - 'a';
            if (node.letters[c] == null) {
                return false;
            }
            node = node.letters[c];
        }

        return node.isEnd;
    }
}