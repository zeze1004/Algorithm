class Solution {
    public boolean isRobotBounded(String s) {
        int[][] direction = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}}; // up, left, down, right
                                                          // left, right는 홀수 위치에 넣어야 4의 나머지 연산을 사용할 수 있음 
        int dir = 0, x = 0, y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'G') {
                x += direction[dir][0];
                y += direction[dir][1];
            } else if (s.charAt(i) == 'L') {
                dir = (dir + 1) % 4;
            } else if (s.charAt(i) == 'R') {
                dir = (dir + 3) % 4;
            }
            // System.out.printf("dir: %d, x: %d, y: %d\n", dir, x, y);
        }

        // 로봇이 원점으로 돌아오거나, 방향이 북쪽을 향하지 않는다면 반복할시 다시 원점으로 돌아오게됨
        return x == 0 && y == 0 || dir != 0;
    }
}