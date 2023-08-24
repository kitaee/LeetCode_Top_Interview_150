import java.util.*;

class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int MAX = Integer.MIN_VALUE;
        int answer = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                int temp = map.get(nums[i]);
                map.put(nums[i], temp+1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(MAX < value) {
                MAX = value;
                answer = key;
            }
        }

        return answer;
    }
}
