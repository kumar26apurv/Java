public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}//Constructor
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
