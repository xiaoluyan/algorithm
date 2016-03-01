package recursionandloop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 题目：输入数字n，按顺序打印出从1最大的的n位数十进制数。
 * 比如输入3，则打印出1，2，3一直到最大的3位数即999.
 * @author Luyan Xiao
 *
 */
public class J12Print1TOMaxOfN {

	//【不推荐！！！】方法1：先求出最大的n位数，然后循环打印
	//但当n很大的时候，最大的n位数会溢出。
	public static void print1ToMaxOfN_1(int n) {
		long num = 1;
		for(int i = 0; i < n; i++) {
			num *= 10;
		}
		for(int i = 1; i < num; i++) {
			System.out.println(i);
		}
	}
	
	
	//方法2：可以用字符串或数组表达大数
	public static void print1ToMaxOfN_2(int n) {
		if(n <= 0) {
			try {
				throw new Exception("输入非法！");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
		ArrayList<Integer> nList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			nList.add(0);
		}
		while(!increment(nList)) {
			printNumber(nList);
		}
		nList.clear();
	}
	
	//使数字每次+1，然后输出.nList[0]表示最高位
	public static boolean increment(ArrayList<Integer> nList) {
		boolean isOverFlow = false;
		int carrayBit = 0;
		int index = nList.size() - 1;
		for(int i = index; i >= 0; i--) {
			int sum = nList.get(i) + carrayBit;
			//最低位数值+1
			if(i == index) {
				sum++;
			}
			
			if(sum >= 10) {
				//最高位产生进位，达到最大值
				if(i == 0) {
					isOverFlow = true;
				} else {
					sum -= 10;
					carrayBit = 1;
					nList.set(i, sum);
				}
			} else {
				nList.set(i, sum);
			}
		}
		return isOverFlow;
	}
	
	//输出数字，将最高位的0舍去
	public static void printNumber(ArrayList<Integer> nList) {
		Iterator<Integer>  iter = nList.iterator();
		boolean isHead = false;
		while(iter.hasNext()) {
			int num = iter.next();
			//找到第1个不为0的位置
			if(num != 0) {
				isHead = true;
			}
			if(isHead) {
				System.out.print(num);
			}
		}
		System.out.println();
	}
	
	//方法3：思路2的递归实现
	public static void print1ToMaxOfN_3(int n) {
		if(n <= 0) {
			try {
				throw new Exception("输入非法！");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			nList.add(0);
		}
		
		for(int i = 0; i < 10; i++) {
			nList.set(0, i);
			print1ToMaxNRecursively(nList, n, 0);
		}
		
		nList.clear();
	}
	
	public static void print1ToMaxNRecursively(ArrayList<Integer> nList, int length, int index) {
		if(index == length - 1) {
			printNumber(nList);
			return;
		}
		
		for(int i = 0; i < 10; i++) {
			nList.set(index + 1, i);
			print1ToMaxNRecursively(nList, length, index + 1);
		}
	}
	
	public static void main(String[] args) {
//		J12Print1TOMaxOfN.print1ToMaxOfN_1(0);
//		J12Print1TOMaxOfN.print1ToMaxOfN_2(0);
		J12Print1TOMaxOfN.print1ToMaxOfN_3(2);
	}
}
