package str;

import java.util.Scanner;

public class HW0516StrTo10Str {
	
	public static void main(String[] args) {
		
//		//方法一：自己实现十六进制字符串到十进制字符串
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextLine()) {
//			String str = sc.nextLine().substring(2);
//			int length = str.length();
//			int res = 0;
//			for (int i = 0; i < length; i++) {
//				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'F') {
//					res += (int) ((str.charAt(i) - 'A' + 10) * (Math.pow(16, length - i - 1)));
////					System.out.println((str.charAt(i) - 'A' + 10) * (Math.pow(16, length - i - 1)));
//				} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'f') {
//					res += (int) ((str.charAt(i) - 'a' + 10) * (Math.pow(16, length - i - 1)));
////					System.out.println((str.charAt(i) - 'a' + 10) * (Math.pow(16, length - i -1)));
//				} else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//					res += (int) ((str.charAt(i) - '0') * (Math.pow(16, length - i - 1)));
////					System.out.println((str.charAt(i) - '0') * (Math.pow(16, length - i - 1)));
//				}
//			}
//			System.out.println(res);
//		}
		
		//方法二：利用parseInt函数
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine().substring(2);
			System.out.println(Integer.parseInt(str, 16));
		}
	}
}
