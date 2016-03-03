package treenode;

public class J19MirrorOfBinaryTree {
    public void mirror(TreeNode root) {
    	//边界条件判断，也是递归结束条件
        if(root == null || (root.left == null && root.right == null)) {
        	return;
        }
        //交换左右子树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        if(root.left != null) {
        	mirror(root.left); 
        }
        
        if(root.right != null) {
        	mirror(root.right);
        }
    }
}
