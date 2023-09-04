class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int pivot = 0;

        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] >= nums[0]) {
                pivot = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        if(pivot+1 == nums.length) {
            return nums[0];
        }

        return nums[pivot+1];
    }
}
