import java.util.*;

class Solution {

    public boolean canJump(int[] nums) {
        LinkedList<Integer> queue = new LinkedList<>();
        int[] visited = new int[nums.length];
        visited[0] = 1;
        queue.offer(0);

        while(!queue.isEmpty()) {
            int index = queue.poll();
            if(index == nums.length-1) {
                return true;
            }

            for(int i=1; i<=nums[index]; i++) {
                if(index+i < nums.length && visited[index+i] == 0) {
                    visited[index+i] = 1;
                    queue.offer(index+i);
                }
            }
        }
        
        return false;
    }
}
