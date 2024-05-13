class Solution {
    public String addStrings(String num1, String num2) {
        Long a = Long.parseLong(num1); Long b = Long.parseLong(num2);
        System.out.println(a + " " + b);
        String output = Long.toString(a + b);
        return output;
        // return output.substring(0, output.length() - 2);
    }
}