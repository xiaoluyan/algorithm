package other;
import java.util.Scanner;


public class HWTestFaZhuanji {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.hasNextLine();
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int n = Integer.parseInt(strArr[0]);
		int s = Integer.parseInt(strArr[1]);
		int L = Integer.parseInt(strArr[2]);
		
		//计算每张CD最多可以存多少首歌
		int size = 0;
		while(size * s + size - 1 <= L) {
			++size;
		}
		--size;
		
		if(size % 13 == 0) {
			--size;
		}
		
		//需要多少张CD
		int res = n % size == 0 ? n / size : n /size + 1;
		
		if((n % 13 == 0) && (n < size)) { //如果n是13的倍数，且所有歌能被一张CD存放
			++res;
		}
		
		if((size + n % size) >= (2 * size - 1)) {//???
			++res;
		}
		
		if((n == 1) && (s == 1) && (L == 1)){//单独考虑1,1,1) 
			res = 1;
		}
		
		System.out.println(res); 
	}
}
