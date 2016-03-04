package stackandqueue;

import java.util.Stack;

public class J21StackWithMin {
	//数据栈
	Stack<Integer> dataStack = new Stack<Integer>();
	//辅助栈
	Stack<Integer> minStack = new Stack<Integer>();
	
    public void push(int node) {
    	dataStack.push(node);
    	if(minStack.empty() || node < minStack.peek()) {
    		minStack.push(node);
    	} else {
    		minStack.push(minStack.peek());
    	}

    }
    
    public void pop() {
        dataStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}
