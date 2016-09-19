package str;

import java.util.Scanner;

/**
 * 整数的质数因子分解
 */
public class HW06ZhishuYinzi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		while(num != 1) {
			for (int i = 2; i <= num; i++) {
				if(num % i == 0) {
					System.out.print(i + " ");
					num /= i;
					break;
				}
			}
		}
	}
}
