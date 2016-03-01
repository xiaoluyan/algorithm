package stackandqueue;

import java.util.LinkedList;

public class J07StackWithTwoQueue {
	LinkedList<Integer> queue1 = new LinkedList<Integer>();
	LinkedList<Integer> queue2 = new LinkedList<Integer>();
	
	public void push(int node) {
		if(queue1.isEmpty() && queue2.isEmpty()) {
			queue1.addLast(node);
		} 
		
		if(!queue1.isEmpty()) {
			queue1.addLast(node);
		} else if (!queue2.isEmpty()) {
			queue2.addLast(node);
		}
	}
	
	public int pop() {
		
		//栈为空异常处理
		if(queue1.isEmpty() && queue2.isEmpty()) {
			try {
				throw new Exception("栈为空，不能删除！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int re = Integer.MAX_VALUE;
		
		if(queue2.isEmpty()) {
			while(!queue1.isEmpty()) { 
				re = queue1.removeFirst();
				//queue1已经从队头删除掉一个元素了，所以只需判断queue1的size大于0
				if(queue1.size() > 0) {
					queue2.addLast(re);
				}
			}
		} else if (queue1.isEmpty()) {
			while(!queue2.isEmpty()) {
				re = queue2.removeFirst();
				//queue2已经从队头删除掉一个元素了，所以只需判断queue2的size大于0
				if(queue2.size() > 0) {
					queue1.addLast(re);
				}
			}
		}

		return re;
	}
	
	public static void main(String[] args) {
		J07StackWithTwoQueue stackWithTwoQueue = new J07StackWithTwoQueue();
		int node1 = 1;
		stackWithTwoQueue.push(node1);
		int node2 = 2;
		stackWithTwoQueue.push(node2);
		int node3 = 3;
		stackWithTwoQueue.push(node3);
		System.out.println(stackWithTwoQueue.pop());
		System.out.println(stackWithTwoQueue.pop());
		int node4 = 4;
		stackWithTwoQueue.push(node4);
		System.out.println(stackWithTwoQueue.pop());
		System.out.println(stackWithTwoQueue.pop());
	}
}
