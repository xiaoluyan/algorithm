package treenode;

public class J18HasSubtree {
    public boolean hasSubtree(TreeNode root1,TreeNode root2) {
    	boolean res = false;
    	if(root1 != null && root2 != null) {
    		if(root1.val == root2.val) {
    			res = doesTree1HasTree2(root1, root2);
    		}
    		
    		if(!res) {
    			res = hasSubtree(root1.left, root2);
    		}
    		
    		if(!res) {
    			res = hasSubtree(root1.right, root2);
    		}
    	}
    	
    	return res;
    }
    
    public boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
    	
    	//递归结束条件
    	if(root2 == null) {
    		return true;
    	}
    	//递归结束条件
    	if(root1 == null) {
    		return false;
    	}
    	//递归结束条件
    	if(root1.val != root2.val) {
    		return false;
    	}
    	
    	return doesTree1HasTree2(root1.left, root2.left) && doesTree1HasTree2(root1.right, root2.right);
    }
    
}
