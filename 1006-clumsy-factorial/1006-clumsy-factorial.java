class Solution {
    public int clumsy(int n) {
        int output = n, sign = 0;
        int idx =  n / 4; int t = 0; int plus = 0;
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < n; i+=4) { // i = 0, 4, 8
            if (idx == 0) {
                t = i;
                break;
            }
            output = (n - i) * (n - i - 1); // (10 * 9), (6 * 5)
            output = output / (n - i - 2); // (output / 8), (output / 4)
            plus += n - i - 3;            // (output + 7), (ouptut + 3)
            System.out.printf("output: %d\n", output);
            tmp.add(output);
            idx--;
        }

        if (n % 4 != 0) { // idx = 1, 2, 3 {
            if (n % 4 == 1 || n % 4 == 2) tmp.add(n - t);
            else if (n % 4 == 3) {
                output = (n - t) * (n - t - 1);
                output = output / (n - t - 2);
                tmp.add(output);
            }
        }
        


        int output2 = tmp.get(0);
        for (int i = 1; i < tmp.size(); i++) {
            System.out.println(output2);
            output2 -= tmp.get(i);
        }

        return output2 + plus;
    }
}
