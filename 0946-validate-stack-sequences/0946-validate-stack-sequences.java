class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int idx = 0;

        for (int i : pushed) {
            stack.push(i);
            // System.out.printf("i: %d\n", i);
            while(!stack.isEmpty() && stack.peek() == popped[idx]) {
                // System.out.printf("stack.peek(): %d, popped[%d]: %d\n", stack.peek(), idx, popped[idx]);
                stack.pop();
                idx++;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}