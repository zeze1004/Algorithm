import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        int steps = 0;
        BigInteger num = new BigInteger(s, 2); // 이진 문자열을 BigInteger로 변환

        while (!num.equals(BigInteger.ONE)) {
            if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                num = num.divide(BigInteger.TWO);
            } else {
                num = num.add(BigInteger.ONE);
            }
            steps++;
        }
        
        return steps;


        // 2진법을 10진법으로 구하기
        // for (int i = 0; i < len; i++) {
        //     if (s.charAt(i) == '1') {
        //         binary += Math.pow(2, len - 1 - i);
        //     }
        // }

        // while 문으로 1이 될 때까지 홀수면 +1 / 짝수면 나누기 2
        // while (binary != 1) {
        //     output++;
        //     if (binary % 2 != 0) { // 홀수면
        //         binary++;
        //     } else {               // 짝수면
        //         binary /= 2;
        //     }
        // }

    }
}