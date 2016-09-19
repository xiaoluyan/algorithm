package searchandsort;


public class MergingSort {
	
	public static void mergingSort(int[] arr, int left, int right) {
		if(left < right) {
			int middle = (left + right) / 2; 
			mergingSort(arr, left, middle); //对左边递归
			mergingSort(arr, middle + 1, right); //对右边递归
			merge(arr, left, middle, right); //合并
		}
	}
	
	public static void merge(int[] arr, int left, int middle, int right) {
		int[] tmpArr = new int[arr.length]; //中间结果数组
		int tmpIndex = left;
		
		int mid = middle + 1;  //右边的起始位置
		int third = left;
		
		while(left <= middle && mid <= right) {
			//从左右两个数组中找出最小的数放入中间结果数组中
			if(arr[left] <= arr[mid]) {
				tmpArr[third++] = arr[left++];
			} else {
				tmpArr[third++] = arr[mid++];
			}
		}
		
		//如果左边数组还有剩余元素没有加入中间结果数组中，则加入中间数组中
		while(left <= middle) {
			tmpArr[third++] = arr[left++];
		}
		
		//如果右边数组还有剩余元素没有加入中间结果数组，则加入中间数组中
		while(mid <= right) {
			tmpArr[third++] = arr[mid++];
		}
		
		//将中间结果数组复制回原数组
		while(tmpIndex <= right) {
			arr[tmpIndex] = tmpArr[tmpIndex++];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {49, 38, 65, 97, 76, 13, 27, 49};
		MergingSort.mergingSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
