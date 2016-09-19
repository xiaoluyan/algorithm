package arr;

import java.util.Scanner;

public class NotRunCheckOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){			
			char[] s = sc.next().toCharArray();
			int[] t = new int[10];
			for(int i=0;i<10;i++){
				t[i]=s[i]-'0';
			}
				
			boolean ret = checkCanSplit(t, 0, 9);
			if(ret){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
		}

	}

	private static boolean checkCanSplit(int[] t, int start, int end) {
		if(start==end)return true;
		boolean flag=is_in_order(t,start,end);
		if(flag){
			return flag;
		}
		int i;
		int lmin,lmax;
		int rmin,rmax;
		
		//check[start-round] >< [round+1:end]
		for(i=start;i<end;i++){
			lmin = min(t,start,i);
			rmin = min(t,i+1,end);
			lmax = max(t,start,i);
			rmax = max(t,i+1,end);
			if(lmin>rmax || lmax<rmin){
				break;
			}
		}
		
		if(i==end){return false;}
		return checkCanSplit(t,start,i) && checkCanSplit(t,i+1,end);
	}

	private static int min(int[] t, int start, int end) {
		int ret=t[start];
		for(int i=start+1;i<=end;i++){
			if(ret>t[i]){
				ret=t[i];
			}
		}
		return ret;
	}

	private static int max(int[] t, int start, int end) {
		int ret=t[start];
		for(int i=start+1;i<=end;i++){
			if(ret<t[i]){
				ret=t[i];
			}
		}
		return ret;
		
	}

	private static boolean is_in_order(int[] t, int start, int end) {
		int i=start;
		while(i<end){
			if(t[i]>t[i+1]){
				return false;
			}
			i+=1;
		}
		return true;
	}
}
