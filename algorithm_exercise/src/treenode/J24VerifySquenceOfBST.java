package treenode;

public class J24VerifySquenceOfBST {
    public boolean verifySquenceOfBST(int [] sequence) {
    	int length = sequence.length;
    	if(length <= 0) {
        	return false;
        }
    	return isBST(sequence, 0, sequence.length - 1);
    }
    
    public boolean isBST(int[] sequence, int start, int end) {
    	
    	if(start >= end) {
    		return true;
    	}
        //根节点是后序遍历的最后一个结点
        int root = sequence[end];
        //二叉搜索树的左子树结点小于根节点(题目中的二叉搜索树中结点不重复)
        int i = start ;
        for (; i < end; i++) {
			if(sequence[i] > root) {
				break;
			}
		}
        //二叉搜索树的右子树结点大于根节点
        int j = i;
        for(; j < end; j++) {
        	if(sequence[j] < root) {
        		return false;
        	}
        }
        
        //判断左子树和右子树是不是二叉搜索树
        return isBST(sequence, start, i - 1) && isBST(sequence, i, end - 1);
    }
}
