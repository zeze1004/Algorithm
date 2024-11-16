class Trie {
    private Trie[] letters = new Trie[26];
    private boolean isEnd = false;
    
    public void insert(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            if (node.letters[c - 'a'] == null) { // 새로운 문자를 추가할 수 있어서 기존 경로를 유지한 채 isEnd만 true로 변경 가능
                                                 // ex. apple이란 단어가 insert되고 app이 insert되면 p는 isEnd = true가 됨
                                                 // 만약에 null체크를 안했다면 app 문자열을 insert할 때 글자마다 새로운 인스턴스를 생성하기 때문에 apple 문자열의 인스턴스가 날라감
                node.letters[c - 'a'] = new Trie();
            }
            node = node.letters[c - 'a'];
        }

        node.isEnd = true;
    }
    
    public boolean search(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            node = node.letters[c - 'a'];
            if (node == null) return false;
        }
        
        return node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Trie node = this;
        for (char c : prefix.toCharArray()) {
            if (node.letters[c - 'a'] == null) {
                return false;
            }
            node = node.letters[c - 'a'];
            if (node == null) return false;
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */