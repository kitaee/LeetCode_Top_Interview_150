import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> tempNums = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                tempNums.add(nums[i]);
            }
        }

        for(int i=0; i<tempNums.size(); i++) {
            nums[i] = tempNums.get(i);
        }

        return tempNums.size();
    }
}
