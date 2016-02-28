package algorithm.recursionandloop;

public class J09Fibonacci {

	//递归方法求斐波那契数列的第n项
    public int fibonacciWithRecursion(int n) {
    	
    	if(n <= 0) {
    		return 0;
    	}
    	
    	if(n == 1) {
    		return 1;
    	}
    	
    	return fibonacciWithRecursion(n - 1) + fibonacciWithRecursion(n - 2);
    }
    
	//循环方法求斐波那契数列的第n项
    public int fibonacciWithLoop(int n) {
    	
    	if(n <= 0) {
    		return 0;
    	}
    	
    	if(n == 1) {
    		return 1;
    	}
    	
    	int f1 = 0;
    	int f2 = 1;
    	int res = 0;
    	for(int i = 2; i <= n; i++) {
    		res = f1 + f2;
    		f1 = f2;
    		f2 = res;
    	}
    	
    	return res;
    }
	
	public static void main(String[] args) {
		J09Fibonacci j09Fibonacci = new J09Fibonacci();
//		int res = j09Fibonacci.fibonacciWithRecursion(3);
		int res = j09Fibonacci.fibonacciWithLoop(3);
		System.err.println(res);
	}

}
