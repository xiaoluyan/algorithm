package bitcalc;


/**
 * 一个数组中含有1001个元素，存放了1,2,3...1000和一个重复的数。
 * 只有唯一一个数是重复的，其它均只出现一次。
 * 要求设计一个算法找出这个重复的数，要求：每个数组元素只能访问一次，不用辅助存储空间。
 */
public class FindRepeatNumber {
	
	
	public static int findRepeatNumber(int[] arr, int length) {
		int res = 0;
		for (int i = 0; i < length; i++) { //重复的数执行了两次异或，其他数执行一次异或
			res ^= arr[i]; 
		}
		
		for(int i = 1; i < length; i++) { //重复的数执行了三次异或，其他数执行两次异或
			res ^= i;
		}
		System.out.println(res);
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 2, 4, 3, 6};
		FindRepeatNumber.findRepeatNumber(arr, arr.length);
	}
}
