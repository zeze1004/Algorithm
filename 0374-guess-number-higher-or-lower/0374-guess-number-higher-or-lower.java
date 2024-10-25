/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // n이 2^31까지이므로 오버플로우 예방을 위한 mid 연산
            int flag = guess(mid);
            if (flag == 0) return mid;
            else if (flag > 0) {           // mid가 pick보다 작을 때
                left = mid + 1;
            } else {                       // mid가 pick보다 클 때
                right = mid - 1;
            }
        }

        return -1;
    }
}