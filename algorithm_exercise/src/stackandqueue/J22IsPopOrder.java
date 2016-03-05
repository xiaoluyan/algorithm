package stackandqueue;

import java.util.Stack;

public class J22IsPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
    	if(pushA.length == 0 || popA.length == 0) {
    		return false;
    	}
    	Stack<Integer> dataStack = new Stack<Integer>();
    	for(int i = 0, j = 0; i < popA.length; i++) {
    		//入栈序列入栈
    		dataStack.push(pushA[i]);
    		//根据出战序列判断是否出栈
    		while(j < popA.length && dataStack.peek() == popA[j]) {
    			dataStack.pop();
    			j++;
    		}
    	}
        
        return dataStack.isEmpty();
    }
}
