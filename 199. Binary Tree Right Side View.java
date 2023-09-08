import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
 
        while(!queue.isEmpty()){
            int length = queue.size();
            
            for(int i = 0; i < length; i++){
                TreeNode current = queue.poll();
                if(current == null) {
                    break;
                }
                if(i == length - 1) {
                    answer.add(current.val);
                }
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return answer;
    }
}
