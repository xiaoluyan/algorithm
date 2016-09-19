package other;
import java.util.Scanner;

public class MainHW1 {
	
	public void getUpStr(String str) {
		char[] cs = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		boolean flag = false;
		for (int i = 0; i < cs.length; i++) {
			if(cs[i] >= 'A' && cs[i] <= 'Z') {
				flag = true;
				sb.append(cs[i]);
			} else if(cs[i] == ' ' && flag) {
				sb.append(cs[i]);
			}
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		MainHW1 test = new MainHW1();
		test.getUpStr(str);
	}
}
