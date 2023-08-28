class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        int div = matrix[0].length;

        while(start <= end) {
            int midIndex = (start+end)/2;
            int midValue = matrix[midIndex/div][midIndex%div];

            if(midValue == target) {
                return true;
            }
            else if(midValue < target) {
                start+=1;
            }
            else {
                end-=1;
            }
        }

        return false;
    }
}
