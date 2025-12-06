package Day11;

import javax.swing.tree.TreeNode;

public class MaximumDepthOfBinaryTree {
   static class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;

       TreeNode(int val){
           this.val = val;
       }
   }
   public static int maxdepth(TreeNode root){
       if(root == null) return 0;

       int leftDepth = maxdepth(root.left);
       int rightDepth = maxdepth(root.right);

       return 1 + Math.max(leftDepth,rightDepth);
   }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int depth = maxdepth(root);
        System.out.println(depth);

    }
}
