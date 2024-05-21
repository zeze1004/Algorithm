class Solution {
    public String fractionAddition(String expression) {
        List<int[]> fractions = new ArrayList<>();
        int idx = 0;
        int sign = 1;
        
        while (idx < expression.length()) {
            if (expression.charAt(idx) == '+' || expression.charAt(idx) == '-') {
                if (expression.charAt(idx) == '+') {
                    sign = 1;
                } else sign = -1;
                idx++;
            }

            int numerator = 0; // 분자
            while (idx < expression.length()&& expression.charAt(idx) != '/') { // '/' 앞에 있는 숫자가 분자
                numerator = numerator * 10 + (expression.charAt(idx) - '0');    // ex. 분자: 123인 경우, (1) numerator =  (0 * 10) + 1 (2) numerator =  (1 * 10) + 2 (3) numerator =  (12 * 10) + 3
                System.out.printf("idx: %d, numerator: %d \n", idx, numerator);
                idx++;
            }
            
            idx++; // '/' 다음의 숫자 인덱스가 됨
            
            int denominator = 0; // 분모
            while (idx < expression.length() && expression.charAt(idx) != '+' && expression.charAt(idx) != '-') {
                denominator = denominator * 10 + (expression.charAt(idx) - '0');
                System.out.printf("idx: %d, denominator: %d \n", idx, denominator);
                idx++;
            }
            
            fractions.add(new int[]{sign * numerator, denominator});
        }
        
        int resultNumerator = 0;
        int resultDenominator = 1;

        // for(int[] f : fractions) {
        //     System.out.println(Arrays.toString(f));
        // }
        
        // 최종 분자 = 이전 분자 * 현재 분모 + 이전 분모 * 현재 분자 를 계산해서 이전 분수와 현재 분수의 분모를 맞췄을 때 분자값을 계산한다
        // 최종 분모 = 이전 분모들을 곱한 값
        for (int[] fraction : fractions) {
            resultNumerator = resultNumerator * fraction[1] + resultDenominator * fraction[0];
            resultDenominator *= fraction[1];
            // System.out.printf("resultNumerator: %d, resultDenominator: %d\n", resultNumerator, resultDenominator);
        }
        
        // 최종 분자와 최종 분모의 최대공약수를 계산해서
        // 기약분수로 만들고 리턴한다
        int gcd = getGCD(Math.abs(resultNumerator), resultDenominator);
        // System.out.printf("resultNumerator: %d, resultDenominator: %d, gcd: %d\n", Math.abs(resultNumerator), resultDenominator, gcd);
        resultNumerator /= gcd;
        resultDenominator /= gcd;
        
        return resultNumerator + "/" + resultDenominator;
    }
    
    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}