import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	while(n > 0) {
        	int m = sc.nextInt();
          	if(m <= 0) {
          		System.out.println(0);
            } else if(m == 1) {
            	System.out.println(1);
            } else if(m == 2) {
          		System.out.println(1);
            } else {
	        	int res = 0;
	          	int f1 = 1;
	          	int f2 = 1;
	          	for(int i = 3; i <= m; i++) {
	            	res = f1 + f2;
	              	f1 = f2;
	              	f2 = res;
	            }
          		System.out.println(res);
            }
          	n--;
        }
    }
  
//  	public static int getCounts(int m) {
//      	if(m <= 0) {
//        	return 0;
//        }
//        if(m == 1) {
//        	return 1;
//        }
//      	if(m == 2) {
//        	return 2;
//        }
//    	int res = 0;
//      	int f1 = 1;
//      	int f2 = 2;
//      	for(int i = 3; i <= m; i++) {
//        	res = f1 + f2;
//          	f1 = f2;
//          	f2 = res;
//        }
//      	return res;
//    }
}
