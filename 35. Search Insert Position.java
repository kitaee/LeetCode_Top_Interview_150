class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end) {
            int midIndex = (start+end)/2;
            int midValue = nums[midIndex];
            if(midValue == target) {
                return midIndex;
            }
            else if(midValue < target) {
                start+=1;
            }
            else {
                end-=1;
            }
        }
        return start;
    }
}
