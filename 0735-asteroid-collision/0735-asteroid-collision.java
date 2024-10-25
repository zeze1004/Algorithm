class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int val : asteroids) {
            if (val < 0) {
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.add(val);
                }
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() <= -val) {
                    if (stack.peek() < -val) {
                        stack.pop();
                        if (stack.isEmpty() || stack.peek() < 0) {
                            stack.add(val);
                            break;
                        }
                    } else if (stack.peek() == -val) {
                        stack.pop();
                        break;
                    }
                }
            } else {
                stack.add(val);
            }
        }

        int[] output = new int[stack.size()];
        int i = stack.size() - 1;
        while(!stack.isEmpty()) {
            output[i--] = stack.pop();
        }
        return output;
    }
}