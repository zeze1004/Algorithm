class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] output = new int[queries.length];
        int even = 0;

        // nums의 짝수의 합을 구하자
        for (int i = 0; i < queries.length; i++) {
            if (nums[i] % 2 == 0) even += nums[i];
        }

        System.out.println(even);

        // 쿼리를 돌리자
        for (int i = 0; i < queries.length; i++) {
            int tmp = nums[queries[i][1]];      // 원래 값
            nums[queries[i][1]] += queries[i][0];
            
            
            if (nums[queries[i][1]] % 2 == 0) {  // 짝수라면
                // 원래 값이 짝수가 아닌데 짝수가 된 경우
                if (tmp % 2 != 0) {
                    even += nums[queries[i][1]];     // 짝수 합에 쿼리로 업데이트된 값을 더함
                    output[i] = even;
                } else {
                    even -= tmp;                     // 원래 값을 빼고
                    even += nums[queries[i][1]];     // 짝수 합에 쿼리로 업데이트된 값을 더함
                    output[i] = even;
                }
                
            } else {                             // 홀수라면 짝수 합에서 원래 값만 제거
                if (tmp % 2 != 0) {
                    output[i] = even;
                } else {
                    even -= tmp;
                    output[i] = even;
                }
            }
        }

        return output;
    }
}