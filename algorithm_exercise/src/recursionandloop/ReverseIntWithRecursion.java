package recursionandloop;

public class ReverseIntWithRecursion {
	
	//num为非负整数，否则还需考虑-10<num<0和num<=-10的情况
	public static String reverseInt2Str(int num) {
		
		
		if(0 <= num && num < 10) {
			return Integer.toString(num);
		}
		
		return Integer.toString(num % 10) + reverseInt2Str(num / 10);
	}
	
	public static void main(String[] args) {
		int num = 210;
		System.out.println(reverseInt2Str(num));
	}
}
