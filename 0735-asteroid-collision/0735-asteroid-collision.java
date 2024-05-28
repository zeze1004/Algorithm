class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        main: for (int i = 0; i < asteroids.length; i++) {
            int a = asteroids[i];
            boolean canPush = true;
    
            if (a > 0) stack.push(a);
            else {
                while (!stack.isEmpty()) {
                    if (stack.peek() > 0 && stack.peek() < -a) stack.pop();
                    else if (stack.peek() > 0 && stack.peek() > -a) {
                        canPush = false;
                        break;
                    }
                    else if (stack.peek() == -a) {
                        stack.pop();
                        canPush = false;
                        break;
                    } 
                    else if (stack.peek() < 0) {
                        stack.push(a);
                        canPush = false;
                        break;
                    }
                }

                if (canPush) stack.push(a);
            }
        }

        int[] output = new int[stack.size()];
        
        for (int i = output.length - 1; i >= 0; i--) {
            output[i] = stack.pop();
        }

        return output;
    }
}