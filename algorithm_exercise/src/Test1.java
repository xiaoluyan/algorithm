import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		int sampleNums = sc.nextInt(); 
		int count = 0;
		ArrayList kList = new ArrayList<Integer>();
		ArrayList listAs = new ArrayList<ArrayList<Integer>>();
		while (count < sampleNums) {
			ArrayList<Integer> listA = new ArrayList<Integer>(); 
			ArrayList<Integer> listB = new ArrayList<Integer>();
			int n = sc.nextInt(); 
			int k = sc.nextInt(); 
			kList.add(k);
			for (int i = 0 ; i < n ; i++) {
				int input = sc.nextInt(); 
				listA.add(input); 
			}
			for (int i = 0 ; i < n ; i++) {
				int input = sc.nextInt(); 
				listB.add(input); 
			}
			
			Test1 test = new Test1(); 
			ArrayList<Integer> list = new ArrayList<Integer>(); 
			for( int j = 0; j < k; j++) {
				list.clear();
				list.addAll(test.swap(listA, listB)); 
				listA.clear();
				listB.clear();
				int a; 
				for ( a = 0; a < list.size()/2 ; a++) {
					listA.add(list.get(a));
				}
				for (; a < list.size(); a++) {
					listB.add(list.get(a));
				}
			}
			int i ; 
			for (i = 0; i < list.size() - 1; i++) {
				System.out.print(list.get(i) +" "); 
			}
			System.out.print(list.get(i)); 
			if(count < sampleNums) {
				System.out.println();
			}
			count++;
		}
	}
	
	public ArrayList<Integer> swap(ArrayList<Integer> listA, ArrayList<Integer> listB) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.clear();
		for(int i = 0; i < listA.size(); i++) {
			list.add(listA.get(i)); 
			list.add(listB.get(i)); 
		}
		return list; 
	}
}