import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> tempNums = new ArrayList<>();
        tempNums.add(nums[0]);

        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                tempNums.add(nums[i]);
            }
        }

        for(int i=0; i<tempNums.size(); i++) {
            nums[i] = tempNums.get(i);
        }

        return tempNums.size();
    }
}
