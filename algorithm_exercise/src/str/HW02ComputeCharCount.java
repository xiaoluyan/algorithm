package str;

import java.util.Scanner;

public class HW02ComputeCharCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			
			if(str2.equalsIgnoreCase(String.valueOf(str1.charAt(i)))) { //不区分大小写
				count += 1;
			}
		}
		System.out.println(count);
 	}
}
