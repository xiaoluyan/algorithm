package stackandqueue;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author 65684
 *
 */
public class J07QueueWithTwoStacks {
	
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		
		//队列为空异常处理
		if(stack2.isEmpty()) {
			try {
				throw new Exception("队列为空，不能删除！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stack2.pop();
    } 
    
//    public static void main(String[] args) {
//		J07QueueWithTwoStacks j07QueueWithTwoStacks = new J07QueueWithTwoStacks();
//		j07QueueWithTwoStacks.pop();
//	}
}
