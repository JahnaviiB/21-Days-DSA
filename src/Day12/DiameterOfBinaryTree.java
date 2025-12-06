package Day12;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

public class DiameterOfBinaryTree {
    public static int maxDiameter = 0;
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
        public static int binarytreediameter(TreeNode root){
            height(root);
            return maxDiameter;
        }
        private static int height(TreeNode node){
            if(node == null) return 0;
            int left = height(node.left);
            int right = height(node.right);

            maxDiameter = Math.max(maxDiameter, left + right);
            return 1 + Math.max(left, right);
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        System.out.println(TreeNode.binarytreediameter(root));
    }
}
