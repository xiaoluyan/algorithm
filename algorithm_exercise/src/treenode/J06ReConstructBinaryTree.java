package treenode;

public class J06ReConstructBinaryTree {

	/**
	 * 根据二叉树的前序和中序遍历数组，重建二叉树
	 * @param pre	前序遍历数组
	 * @param in	中序遍历数组
	 * @return
	 */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        
    	if(pre == null || in == null) {
    		return null;
    	}
    	
    	/**
    	 * 二叉树只有一个结点
    	 */
    	if(pre.length == 1 && in.length == 1) {
    		if(pre[0] == in[0]) {
    			TreeNode treeNode = new TreeNode(pre[0]);
    			return treeNode;
    		}
    	}
    	
    	TreeNode treeNode = reConstructBinaryTreeCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
    	return treeNode;
    }
    
    public TreeNode reConstructBinaryTreeCore(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
    	
    	if(startPre > endPre || startIn > endIn) {
    		return null;
    	}
    	
    	TreeNode root = new TreeNode(pre[startPre]);
    	for(int i = startIn; i <= endIn; i++) {
    		if(in[i] == pre[startPre]) {
    			root.left = reConstructBinaryTreeCore(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
    			root.right = reConstructBinaryTreeCore(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
    		}
    	}
    	return root;
    }
}
