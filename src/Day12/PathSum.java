package Day12;

public class PathSum {
    private static int total;
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean totalsumofpath(TreeNode root, int target){
        if(root == null) return false;
        int remaining = Math.abs(target - root.val);

        if(root.left == null && root.right == null) return remaining == 0;

        return totalsumofpath(root.left,remaining) || totalsumofpath(root.right,remaining);

    }
    public static void main(String[] args){
        int targetSum = 22;
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        boolean output = totalsumofpath(root,targetSum);
        System.out.println(output);
    }
}
