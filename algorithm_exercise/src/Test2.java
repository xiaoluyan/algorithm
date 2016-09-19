import java.util.ArrayList;
import java.util.Scanner;


public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sampleNum = sc.nextInt();
		ArrayList<String> sampleList = new ArrayList<String>();
		ArrayList<Integer> kList = new ArrayList<Integer>();
		ArrayList<Integer> resList = new ArrayList<Integer>();
				
		while(sampleNum > 0) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			int n = Integer.parseInt(strArr[0]);
			int k = Integer.parseInt(strArr[1]);
			kList.add(k);
			String sampleStr = sc.nextLine();
			sampleList.add(sampleStr);
			sampleNum--;
		}
		
		for (int i = 0; i < kList.size(); i++) {
			int k = kList.get(i);
			String sampleStr = sampleList.get(i);
			String[] str1 = sampleStr.split(" ");
			
			for (int j = 0; j < str1.length / 2; j++) {
				resList.add(Integer.parseInt(str1[j]));
//				res
			}
		}
 	}
	
}
