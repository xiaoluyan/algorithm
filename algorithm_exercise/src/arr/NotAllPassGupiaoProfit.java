package arr;
import java.util.ArrayList;
import java.util.Scanner;


public class NotAllPassGupiaoProfit {
	public static void main(String[] args) {
	  	Scanner sc = new Scanner(System.in);
	  	String str = sc.nextLine();
	  	String[] strArr = str.split(",");
	  	int[] arr = new int[strArr.length];
	  	for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
//	  	System.out.println(findGreatestLirun(arr));
	  	
	  	bubbleSort(arr);
	  	System.out.println(arr[arr.length - 1] - arr[0]);
	}
	
    public static int findGreatestLirun(int[] arr) {
        
        //最小值不能设为0，有可能最大值是负数
        int greatestLirun = Integer.MIN_VALUE;
        int lirun = 0;
        for(int i = 1; i < arr.length; i++) {
        	for(int j = 0; j < i; j++) {
        		lirun = arr[i] - arr[j];
	            if(lirun > greatestLirun) {
	                greatestLirun = lirun;
	            }
        	}
        }
        
        return greatestLirun;
    }

	
	public static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) { //当前要排好序的位置
			for (int j = arr.length - 1; j > i; j--) { //从尾到头，每次把最小的数冒上去
				if(arr[j] < arr[j - 1]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
