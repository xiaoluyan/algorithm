package str;

import java.util.Scanner;

public class HW01ComputeLastStrLength {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		System.out.println(strArr[strArr.length - 1].length());
 	}
}
