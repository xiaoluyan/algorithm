package str;
import java.util.Scanner;

public class ReverseThree {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int a = Integer.parseInt(ReverseThree.getReverseStr(strArr[0]));
        int b = Integer.parseInt(ReverseThree.getReverseStr(strArr[1]));
//        System.out.println(a);
//        System.out.println(b);
        int c = a + b;
        String cStr = String.valueOf(c);
        System.out.println(ReverseThree.getReverseStr(cStr));
	}
	
	public static String getReverseStr(String str) {
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (int i = str.length() - 1; i >= 0 ; i--) {
			if(str.charAt(i) != '0') {
				flag = true;
			}
			if(flag) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}