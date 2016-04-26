package recursionandloop;

import java.util.Stack;

public class J28Combine {
	/**
	 * 字符串的组合：一个字符串，比如ABC， 把所有的组合，即：A, B, C, AB, AC, BC, ABC, 都找出来. 解题思路：
	 * 以考虑求长度为n的字符串中m个字符的组合，设为C(n,m)。 原问题的解即为C(n, 1), C(n, 2),...C(n, n)的总和。
	 * 对于求C(n, m)，从第一个字符开始扫描，每个字符有两种情况，要么被选中，要么不被选中。 如果被选中，递归求解C(n-1,
	 * m-1)；如果未被选中，递归求解C(n-1, m)。 不管哪种方式，n的值都会减少，递归的终止条件n=0或m=0。
	 * 
	 * @param chs
	 * @return
	 */
	public static void combiantion(char[] chs) {
		if (chs.length == 0)
			return;

		Stack<Character> stack = new Stack<Character>();
		for (int i = 1; i <= chs.length; i++) {
			combine(chs, 0, i, stack);
		}
	}

	// 从字符数组中第begin个字符开始挑选number个字符加入stack中
	public static void combine(char[] chs, int begin, int number, Stack<Character> stack) {
		if (number == 0) {
//			System.out.println(stack.toString());
			for (int i = 0; i < stack.size(); i++) {
				System.out.print(stack.elementAt(i));
			}
			System.out.println();
			return;
		}
		if (begin == chs.length) {
			return;
		}
		//选中当前元素
		stack.push(chs[begin]);
		combine(chs, begin + 1, number - 1, stack);
		//不选中当前元素,则把上一步加入的元素从stack中剔除掉
		stack.pop();
		combine(chs, begin + 1, number, stack);
	}

	public static void main(String[] args) {
		String str = "abc";
		combiantion(str.toCharArray());
	}
}
