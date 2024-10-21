class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int left = 0, right = skill.length - 1;
        int sum = skill[left] + skill[right];
        long output = skill[left] * skill[right];
        while (left < right) {
            left++; right--;
            if (sum != skill[left] + skill[right]) return -1;
            else if (sum == skill[left] + skill[right] && left < right) {
                output += skill[left] * skill[right];
            }
        }

        return output;
    }
}