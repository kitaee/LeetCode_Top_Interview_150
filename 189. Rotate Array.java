import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int rotateIndex = i+k;
            rotateIndex %= nums.length;
            map.put(rotateIndex, nums[i]);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            nums[entry.getKey()] = entry.getValue();
        }
    }
}
