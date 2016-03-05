package treenode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class J23PrintFromTopToBottom {
	
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        if(root == null) {
        	return resList;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //Adds the specified element as the tail (last element) of this list.
        queue.offer(root); //queue.add(root)也可以
        while(!queue.isEmpty()) {
        	//Retrieves and removes the head (first element) of this list.
        	TreeNode treeNode = queue.poll(); //queue.remove()也可以
        	resList.add(treeNode.val);
        	if(treeNode.left != null) {
        		queue.offer(treeNode.left);
        	}
        	if(treeNode.right != null) {
        		queue.offer(treeNode.right);
        	}
        }
        
        return resList;
    }
}
