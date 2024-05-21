class Solution {
    public String fractionAddition(String expression) {
        List<int[]> fractions = new ArrayList<>();
        int index = 0;
        int sign = 1;
        
        while (index < expression.length()) {
            if (expression.charAt(index) == '+' || expression.charAt(index) == '-') {
                sign = expression.charAt(index) == '+' ? 1 : -1;
                index++;
            }
            
            int numerator = 0;
            while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
                numerator = numerator * 10 + (expression.charAt(index) - '0');
                index++;
            }
            
            index++; // Skip '/'
            
            int denominator = 0;
            while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
                denominator = denominator * 10 + (expression.charAt(index) - '0');
                index++;
            }
            
            fractions.add(new int[]{sign * numerator, denominator});
        }
        
        int resultNumerator = 0;
        int resultDenominator = 1;
        
        for (int[] fraction : fractions) {
            resultNumerator = resultNumerator * fraction[1] + resultDenominator * fraction[0];
            resultDenominator *= fraction[1];
        }
        
        int gcd = getGCD(Math.abs(resultNumerator), resultDenominator);
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