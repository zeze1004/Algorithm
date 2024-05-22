class Solution {
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] leftSide = evaluate(parts[0]);
        int[] rightSide = evaluate(parts[1]);
        
        int coefficientDiff = leftSide[0] - rightSide[0];
        int constantDiff = rightSide[1] - leftSide[1];
        
        if (coefficientDiff == 0) {
            if (constantDiff == 0) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        } else {
            return "x=" + (constantDiff / coefficientDiff);
        }
    }
    
    private int[] evaluate(String expression) {
        String[] tokens = expression.replace("-", "+-").split("\\+");
        int coefficient = 0;
        int constant = 0;
        
        for (String token : tokens) {
            if (token.equals("x")) {
                coefficient++;
            } else if (token.equals("-x")) {
                coefficient--;
            } else if (token.contains("x")) {
                coefficient += Integer.parseInt(token.substring(0, token.length() - 1));
            } else if (!token.isEmpty()) {
                constant += Integer.parseInt(token);
            }
        }
        
        return new int[]{coefficient, constant};
    }
}