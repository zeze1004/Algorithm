class Solution {
    public int clumsy(int n) {
        List<Integer> tmpList = new ArrayList<>();
        int output = n;
        int idx =  n / 4; 
        int tmpI = 0;
        int plus = 0;
        
        for (int i = 0; i < n; i+=4) {      // i = 0, 4, 8
            if (idx == 0) {
                tmpI = i;
                break;
            }

            output = (n - i) * (n - i - 1); // (10 * 9), (6 * 5)
            output = output / (n - i - 2);  // (output / 8), (output / 4)
            plus += n - i - 3;              // (output + 7), (ouptut + 3)

            tmpList.add(output);
            idx--;
        }

        if (n % 4 != 0) {  
            if (n % 4 == 1 || n % 4 == 2) tmpList.add(n - tmpI);
            else if (n % 4 == 3) {
                output = (n - tmpI) * (n - tmpI - 1);
                output = output / (n - tmpI - 2);
                tmpList.add(output);
            }
        }

        int rns = tmpList.get(0);
        for (int i = 1; i < tmpList.size(); i++) {
            rns -= tmpList.get(i);
        }

        return rns + plus;
    }
}
