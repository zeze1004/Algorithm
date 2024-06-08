class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> tmp = new ArrayList<>();
        Arrays.sort(arr);

        for (Integer i : arr) {
            // int count = map.getOrDefault(map.get(i), 0) + 1;
            // System.out.println(i + " " + count);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // System.out.println(entry.getKey() + " " + entry.getValue());
            tmp.add(entry.getValue());
        }

        Collections.sort(tmp);

        for (int i = 0; i < tmp.size(); i++) {
            int n = tmp.get(i);
            tmp.remove(i);
            if (tmp.contains(n)) return false;
        }

        return true;
    }
}