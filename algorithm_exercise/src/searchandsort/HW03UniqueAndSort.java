package searchandsort;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 对输入的多行整数去重并从小到大排序
 *
 *
 */
public class HW03UniqueAndSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			TreeSet set = new TreeSet<Integer>();
			int count = sc.nextInt();
			while(count > 0) {
				int num = sc.nextInt();
				set.add(num);
				count--;
			}
			//Set要用iterator遍历
			Iterator<Integer> iterator = set.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	
	}
}
