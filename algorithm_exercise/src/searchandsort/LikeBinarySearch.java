package searchandsort;
import java.util.ArrayList;
import java.util.Scanner;


public class LikeBinarySearch {
	public static void main(String[] args) {
	  	Scanner sc = new Scanner(System.in);
	  	int findNum = sc.nextInt();
	  	int n = sc.nextInt();
	  	int count = n;
	  	ArrayList list = new ArrayList<Integer>();
	  	while(count > 0) {
	  		list.add(sc.nextInt());
	  		count--;
	  	}
	  	int[] num = new int[n];
	  	for (int i = 0; i < list.size(); i++) {
			num[i] = (int) list.get(i);
		}
	  	int res = binarySearch(num, findNum);
	  	System.out.println(res);
	}
	
	public static int binarySearch(int[] num, int findNum) {
		int low = 0;
	  	int high = num.length - 1;
	  	int mid = 0;
	  	int res = 0;
	  	while(low <= high) {
	  		mid = (low + high) / 2;
	  		if(num[mid] == findNum) {
//	  			System.out.println(mid);
	  			return mid;
	  		} else if(num[mid] <= findNum) {
	  			low = mid + 1;
	  		} else {
	  			high = mid - 1;
	  		}
	  	}
	  	if(num[mid] > findNum) {
	  		res = -1 - (mid);
	  	} else {
	  		res = -1 - (mid + 1);
	  	}
	  	return res;
	}
}
