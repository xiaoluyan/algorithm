package arr;
import java.util.ArrayList;
import java.util.Scanner;

public class TiaozhengHuiwen {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n > 0) {
        	list.add(sc.nextInt());
        	n--;
        }
        
        int head = 0;
        int tail = list.size() - 1;
        int cnt = 0;
        int[] ll = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			ll[i] = list.get(i);
		}
        while(head < tail) {
        	if(ll[head] == ll[tail]) {
        		head += 1;
        		tail -= 1;
        		continue;
        	}
        	
        	while(head <= tail && ll[head] != ll[tail]) {
        		 if(ll[head] > ll[tail]) {
        			 ll[tail - 1] += ll[tail];
                     tail -= 1;
        		 } else {
                     ll[head + 1] += ll[head];
                     head += 1;
        		 }
                 cnt += 1;
        	}
        
        }
    	System.out.println(cnt);
	}
	
	
}