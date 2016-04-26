package recursionandloop;

import java.util.LinkedList;

public class FindSum {
	/**
	 * 题目：输入两个整数n和m,从数列1,2,3，……n中随意取几个数，使其和等于m。要求将所有的可能组合列出来。
	 * 解题思路：背包问题。
	 * @param m
	 * @param n
	 * @param list
	 */
	public static void findSum(int m, int n, LinkedList<Integer> list) {

		if(m < 0 || n < 0) {
			return;
		}
		//跳出递归的条件
		if (m == 0) {
			for (int i = 0; i < list.size(); i++)
				System.out.print(list.get(i) + " ");
			System.out.println();
			return;
		}
		
		list.add(n);
		// n加入，取n=n-1,m=m-n
		findSum(m - n, n - 1, list);
		list.removeLast();
		// n没有加入，取n=n-1,m=m
		findSum(m, n - 1, list);
	}

	public static void main(String[] args) {
//		int m = 10;
//		int n = 12;
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		findSum(m, n, list);
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		int c=1;
		Integer e = 1;
		System.out.println("a==b:"+(a==b));
		System.out.println("a==c:"+(a==c));
		System.out.println("a==e:"+(a==e));
		System.out.println("c==e:"+(c==e));
	}
}
