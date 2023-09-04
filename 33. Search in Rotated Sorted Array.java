import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
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

        int left = binarySearch(nums, target, 0, pivot);
        int right = binarySearch(nums, target, pivot+1, nums.length-1);

        return Math.max(left, right);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
