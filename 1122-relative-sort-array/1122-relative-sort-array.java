class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map1 = new TreeMap<>();
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < map1.get(arr2[i]); j++) {
                output.add(arr2[i]);
            }
            map1.remove(arr2[i]);
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                output.add(entry.getKey());
            }
        }

        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}