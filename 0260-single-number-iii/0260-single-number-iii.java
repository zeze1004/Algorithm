class Solution {
    public int[] singleNumber(int[] nums) {
        List<Long> output = new ArrayList<>();
        Map<Long, Long> map = new HashMap<>();
        
        for (Integer i : nums) {
            Long tmp = i.longValue();
            map.put(tmp, map.getOrDefault(tmp, 0L) + 1);
        }

        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            if (entry.getValue() == 1L) output.add(entry.getKey());
        }

        int[] outputArray = new int[output.size()];

        int idx = 0;
        for (Long l : output) {
            outputArray[idx] = l.intValue();
            idx++;
        }

        return outputArray;
    }
}