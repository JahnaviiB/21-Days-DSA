package Day11;

import javax.swing.tree.TreeNode;
import java.util.List;

public class InvertBinaryTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode inverttree(TreeNode root){
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        inverttree(root.left);
        inverttree(root.right);

        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.println(inverttree(root));
    }
}
