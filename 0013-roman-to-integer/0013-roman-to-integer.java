import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        int output = 0;

        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);

        if (s.length() == 1)
            return ht.get(s.charAt(0));

        for (int i = 0; i < s.length() - 1; i++) {
            if (ht.get(s.charAt(i)) < ht.get(s.charAt(i + 1))) {
                output += ht.get(s.charAt(i + 1)) - ht.get(s.charAt(i));
                i++;
            }
            else output += ht.get(s.charAt(i));
        }
        
        if (ht.get(s.charAt(s.length() - 2)) >= ht.get(s.charAt(s.length() - 1)))
            output += ht.get(s.charAt(s.length() - 1));
        
        return output;
    }
}