package arr;
import java.util.Scanner;

public class AnheiStrCount {
	
	public static int countAnhei(boolean same, int length, int index){
		
		int sum = 0;
		
		if(index == (length - 1)){
			if(same)
				return 3;
			else
				return 2;
		}
		
		if(same){
			sum += countAnhei(true, length, index + 1);
			sum += 2 * countAnhei(false, length, index + 1);
		}else{
			sum += countAnhei(false, length, index + 1);
			sum += countAnhei(true, length, index + 1);
		}
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			if(1 == n){
				sb.append(3 + "\n");
			}else if(2 == n){
				sb.append(9 + "\n");
				
			}else{
				int sum = 0;
				sum = 3 * countAnhei(true, n, 2);
				sum += 6 * countAnhei(false, n, 2);
				sb.append(sum + "\n");
			}
		}
		
		String result = sb.toString();
		int resLength = result.length();
		System.out.println(result.substring(0, resLength - 1));
		
	}

}