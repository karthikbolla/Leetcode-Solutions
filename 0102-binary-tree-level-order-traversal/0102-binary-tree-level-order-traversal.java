/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> arr=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
               TreeNode node=queue.peek();
               queue.remove();
               if(node.left!=null) queue.add(node.left);
               if(node.right!=null) queue.add(node.right);
               arr.add(node.val);
        }
            ans.add(arr);
    }
        return ans;
    }

}