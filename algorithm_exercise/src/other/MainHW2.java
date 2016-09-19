package other;
import java.util.Scanner;


public class MainHW2 {
	
	public void getCurrentFileCounts() {
		int current = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			if(str.equals("end")) {
				System.out.print("current " + current);
				break;
			} else {
				String[] strArr = str.split(" ");
				if(strArr[0].equals("binding")) {
					current = current + Integer.parseInt(strArr[1]);
				} else if(strArr[0].equals("remove")) {
					current = current - Integer.parseInt(strArr[1]);
					if(current < 0) {
						current = 0;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MainHW2 test = new MainHW2();
		test.getCurrentFileCounts();
	}
}
