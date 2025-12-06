package Day12;

import com.sun.source.tree.Tree;

public class SymmetricTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean symmertictree(TreeNode root){
        if(root == null) return true;
        return isMirror(root.right,root.left);
    }
    private static boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;

        return isMirror(left.left,right.right) && isMirror(right.left,left.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.left.left = new TreeNode(3);
        System.out.println(symmertictree(root));
    }
}
