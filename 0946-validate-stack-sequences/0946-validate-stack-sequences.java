class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque = new LinkedList<>();
        int idx = 0;
        for (Integer i : pushed) {
            deque.push(i);
            while (!deque.isEmpty() && deque.peek() == popped[idx]) {
                deque.pop();
                idx++;
            }
        }

        return deque.isEmpty() ? true : false;
    }
}