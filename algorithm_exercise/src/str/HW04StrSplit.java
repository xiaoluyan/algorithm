package str;

import java.util.Scanner;

public class HW04StrSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		getSplitedStr(str1);
		getSplitedStr(str2);
	}
	
	public static void getSplitedStr(String str) {
		if(!"".equals(str)) {
			int length1 = str.length();
			int count1 = length1 / 8;
			if(count1 == 0) {
				int buLength = 8 - str.length();
				StringBuffer tmpSb = new StringBuffer();
				tmpSb.append(str);
				for(int i = 1; i <= buLength; i++) {
					tmpSb.append("0");
				}
				System.out.println(tmpSb.toString());
			} else {
				for (int i = 0; i < count1; i++) {
					System.out.println(str.substring(i * 8, i * 8 + 8));
				}
				if(length1 % 8 != 0) {
					int buLength = 8 - str.substring(count1 * 8, length1).length();
					StringBuffer tmpSb = new StringBuffer();
					tmpSb.append(str.substring(count1 * 8, length1));
					for(int i = 1; i <= buLength; i++) {
						tmpSb.append("0");
					}
					System.out.println(tmpSb.toString());
				}
			}
		} else  {
			System.out.println(str);
		}
	}
}
