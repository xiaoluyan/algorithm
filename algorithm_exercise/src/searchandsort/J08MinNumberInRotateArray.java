package searchandsort;

public class J08MinNumberInRotateArray {

	 public int minNumberInRotateArray(int [] array) {
		 
		 if(array == null || array.length == 0) {
			 try {
				throw new Exception("arry不能为空。");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		 } else {
			 int index1 = 0;
			 int index2 = array.length - 1;
			 int indexMid = index1;
	
			 while(array[index1] >= array[index2]) {
				 if(index2 - index1 == 1) {
					 indexMid = index2;
					 break;
				 }
				 
				 indexMid = (index1 + index2) / 2;
				 
				 //如果下标为index1，index2和indexMid指向的三个元素相等
				 //只能顺序查找
				 if(array[index1] == array[index2] && array[indexMid] == array[index1]) {
					 return minInOrder(array, index1, index2);
				 } else if(array[indexMid] >= array[index1]) {
					 index1 = indexMid;
				 } else if(array[indexMid] <= array[index2]) {
					 index2 = indexMid;
				 }
			 }
	 		return array[indexMid];
		 }
	 }
	
	 //顺序查找
	public int minInOrder(int[] array, int index1, int index2) {
		int res = array[index1];
		for(int i = index1 + 1; i <= index2; i++) {
			if(array[i] < res) {
				res = array[i];
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		J08MinNumberInRotateArray j08MinNumberInRotateArray = new J08MinNumberInRotateArray();
		int[] originArray = {0, 1, 1, 1, 1};
//		int[] rotateArray = {0, 1, 1, 1, 1};
//		int[] rotateArray = {1, 1, 1, 0, 1};
//		int[] rotateArray = {1, 1, 0, 1, 1};
//		int[] rotateArray = {};
		int[] rotateArray = {1};
		int res = j08MinNumberInRotateArray.minNumberInRotateArray(rotateArray);
		System.out.println(res);
	}

}
