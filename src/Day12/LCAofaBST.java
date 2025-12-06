package Day12;

public class LCAofaBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public static TreeNode lca(TreeNode root,TreeNode p,TreeNode q){
            int parentVal = root.val;
            int pvalue = p.val;
            int qvalue = q.val;

            if(pvalue > parentVal && qvalue > parentVal){
                return lca(root.right,p,q);
            }else if(pvalue < parentVal && qvalue < parentVal){
                return lca(root.left,p,q);
            }else{
                return root;
            }
        }
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode leftp = root.left;
        TreeNode rightq = root.right;
        TreeNode output = lca(root,leftp,rightq);
        System.out.println(output.val);
    }
}
