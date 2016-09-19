import java.util.Scanner;


public class CopyOfMain {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNextLine()) {
    		String str = sc.nextLine();
//    		int[] arrOld = new int[str.length()];
    		int[] arr = new int[str.length()];
    		for (int i = 0; i < str.length(); i++) {
//    			arrOld[i] = i;
				arr[i] = str.charAt(i);
			}
    		int res = judge(arr, 0, 0);
    		if(res <= 8) {
    			System.out.println("yes");
    		} else {
    			System.out.println("no");
    		}
    	}
	}
	
	public static int judge(int[] arr, int start, int count) {
//		int index = 0;
//		for (int i = 0; i < arrOld.length; i++) {
//			if(arrOld[i] == arr[start]) {
//				index = i;
//				break;
//			}
//		}
		int res = count;
		if(start >= arr.length - 1) {
			return res;
		}
		for (int i = start; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1] || arr[i] + 1 < arr[i + 1]) {
				count = count + 1;
				res = count;
				judge(arr, i + 1, count);
			}
		}
		return res;
	}
}
