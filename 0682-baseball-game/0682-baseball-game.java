class Solution {
    public int calPoints(String[] operations) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                output.add(output.get(output.size() - 2) + output.get(output.size() - 1));
            } else if (operations[i].equals("D")) {
                output.add(output.get(output.size() - 1) * 2);
            } else if (operations[i].equals("C")) {
                output.remove(output.size() - 1);
            } else {
                int tmp = Integer.parseInt(operations[i]);
                output.add(tmp);
            }
        }

        int sum = 0;
        for (Integer i : output) {
            sum += i;
        }

        return sum;
    }
}