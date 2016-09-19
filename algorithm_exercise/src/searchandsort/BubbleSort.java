package searchandsort;

public class BubbleSort {
	
	//由小到大排序
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
	
	public static void main(String[] args) {
		int[] arr = {49, 38, 65, 97, 76, 13, 27, 49};
		BubbleSort.bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
