import java.util.Arrays;

public class MinDaysMakeBouquets1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        // m * k가 inf 범위를 넘어가서 long으로 형변환 필요
        if ((long)m * k > bloomDay.length) return -1;
        int left = Arrays.stream(bloomDay).min().getAsInt();
        int right = Arrays.stream(bloomDay).max().getAsInt();

        while (right > left) {
            int mid = (left + right) / 2;
            if (countBouque(bloomDay, k, mid) >= m) {
                right = mid; // 부케를 만들 수 있는 종류가 지정 수 보다 많으므로, 가장 큰 수인 right를 mid로 줄이고 새로운 mid값을 만듦
                // mid 수가 적어 만들어야하는 부케의 수를 충족시키지 못한걸수도 있어 left를 mid + 1로 변경하고 숫자를 하나 씩 증가시켜 다시 비교하게 함
            } else
                left = mid + 1;
        }
        // left가 right 보다 커져서 반복문 나옴
        // 가장 빠른 날은 인접한 꽃이 피는 날 중 가장 작은 날인 left
        return left;
    }

    public int countBouque(int[] bloomDay, int k, int mid) {
        int count = 0;
        int requiredDay = k;

        for (int day : bloomDay) {
            if (day > mid) {
                // mid 값 보다 큰 날짜가 있는 경우, 다음 원소부터 인접한 k 번째의 원소까지 값이 mid보다 낮은지 확인
                requiredDay = k;
            } else if (--requiredDay == 0) { // k 번째 인접한 원소도 mid보다 값이 작으면 필요한 부케 conunt 1씩 증가
                ++count;
                requiredDay = k; // 다시 인접한 수를 초기화 시켜서 비교
            }
        }
        return count; // 부케를 만들 수 있는 경우의 수 리턴
    }
}
