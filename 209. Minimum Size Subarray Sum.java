import java.util.*;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int answer = Integer.MAX_VALUE;

        while(endIndex < nums.length) {
            sum += nums[endIndex];
            endIndex+=1;

            while(sum >= target) {
                answer = Math.min(answer, endIndex-startIndex);
                sum -= nums[startIndex];
                startIndex+=1;
            }
        }

        if(answer == Integer.MAX_VALUE) {
            return 0;
        }
        return answer;
    }
}
