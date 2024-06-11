class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        // 덱을 오름차순으로 정렬
        Arrays.sort(deck);
        
        // 결과를 저장할 큐를 생성
        Deque<Integer> resultQueue = new LinkedList<>(); // deque ?A?
        
        // 가장 큰 카드부터 작은 카드 순서로 배치
        for (int i = deck.length - 1; i >= 0; i--) {
            // System.out.println(resultQueue);
            if (!resultQueue.isEmpty()) {
                int last = resultQueue.removeLast();
                // System.out.printf("que's last: %d\n", last);
                // 큐의 마지막 요소를 큐의 맨 앞으로 이동
                resultQueue.addFirst(last);
            }
            // 현재 카드를 큐의 맨 앞에 추가
            // System.out.printf("que's first: %d\n", deck[i]);
            resultQueue.addFirst(deck[i]);
        }
        
        // 결과 큐를 배열로 변환
        int[] result = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            result[i] = resultQueue.removeFirst();
        }
        
        return result;
    }
}