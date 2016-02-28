package datastructure.listnode;

import java.util.ArrayList;
import java.util.Stack;

public class J05PrintListFromTailToHead {

//	/**
//	 * 采用栈的方法
//	 * @param listNode
//	 */
//	public static void printListFromTailToHead1_1(ListNode listNode) {
//    	if(listNode == null) {
//    		System.out.println("This listnode is mull");
//    		return;
//    	}
//    	
//    	Stack<ListNode> stack = new Stack<ListNode>();
//
//    	while(listNode != null) {
//    		stack.push(listNode);
//    		listNode = listNode.getNext();
//    	}
//    	
//    	while(!stack.isEmpty()) {
//    		System.out.println(stack.pop().getVal());
//    	}
//    }
    
	/**
	 * 采用栈的方法：牛客网提交
	 * @param listNode
	 * @return
	 */
    public static ArrayList<Integer> printListFromTailToHead1_2(ListNode listNode) {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
        if(listNode == null) {
    		System.out.println("This listnode is mull");
    		return list;
    	}
    	Stack<ListNode> stack = new Stack<ListNode>();
    	
    	while(listNode != null) {
    		stack.push(listNode);
    		listNode = listNode.next;
    	}
    	
    	while(!stack.isEmpty()) {
    		list.add(stack.pop().val);
//    		System.out.println(stack.pop().val);
    	}
//    	for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
    	return list;
    }
	
    /**
     * 采用递归的方法
     * @param listNode
     */
    public static void printListFromTailToHead2(ListNode listNode) {
    	
    	if(listNode != null) {
    		if(listNode.next != null) {
    			printListFromTailToHead2(listNode.next);
    		}
    		System.out.println(listNode.val);
    	} 
    }
    
    
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(67);
		ListNode listNode2 = new ListNode(0);
		ListNode listNode3 = new ListNode(24);
		ListNode listNode4 = new ListNode(58);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		printListFromTailToHead1_2(listNode1);
//		printListFromTailToHead2(listNode1);
	}

}
