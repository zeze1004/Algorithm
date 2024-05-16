class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        // (a + bi) * (c + di)
        // ac - bd + (ad + bc)i
        
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(num1.substring(0, num1.indexOf("+")));
        int bi = Integer.parseInt(num1.substring(num1.indexOf("+") + 1, num1.length() - 1));

        int c = Integer.parseInt(num2.substring(0, num2.indexOf("+")));
        int di = Integer.parseInt(num2.substring(num2.indexOf("+") + 1, num2.length() - 1));

        int ans1 = (a * c) - (bi * di);
        int ans2 = (a * di) + (c * bi);

        sb.append(ans1).append("+").append(ans2).append("i");

        return sb.toString();
    }
}