package algorithm.searchandsort;

import java.util.Random;

public class SortAlgorithm {

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            //get the pivot position, and divide.
//        	int partitionPosition = partition_1(array, low, high); 
        	int partitionPosition = partition_2(array, low, high);
            // the left part of the array.
        	quickSort(array, low, partitionPosition - 1); 
            // the right part of the array.
        	quickSort(array, partitionPosition + 1, high); 
        }
    }
    
    /**
     * 从前往后依次进行，比partition2(从两端向中间进行)增加比较次数和运行时间
     * @param array
     * @param low
     * @param high
     * @return
     */
    public int partition_1(int[] array, int low, int high) {
        Random rd = new Random();
        int tempPivot = rd.nextInt(high - low + 1) + low;
        swap(tempPivot, high, array);
        
        int startPoint = low;  
        for (int j = low; j < high; j++) {
            if (array[j] < array[high]) {
            	if(j != startPoint) {
                swap(startPoint, j, array);
            	}
                startPoint++;
            }
        }
        swap(high, startPoint, array);
        return startPoint;
    }
    
    /**
     *最佳实现思路：从表的两端交替地向中间扫描。
     * @param array
     * @param low
     * @param high
     * @return
     */
    public int partition_2(int[] array, int low, int high) {
    	int pivotKey = array[low];
    	//从表的两端交替地向中间扫描
        while(low < high) {
        	while(low < high && array[high] >= pivotKey) {
        		high--;
        	}
        	//将比枢轴小的记录移动低端
        	array[low] = array[high];
        	
        	while(low < high && array[low] <= pivotKey) {
        		low++;
        	}
        	//将比枢轴大的记录移到高端
        	array[high] = array[low];
        }
        
        array[low] = pivotKey;
        return low;
    }
    
    private void swap(int p1, int p2, int[] array)
    {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    
	public static void main(String[] args) {
		
		SortAlgorithm sortAlgorithm = new SortAlgorithm();
		int[] array = {49, 38, 65, 97, 76, 13, 27, 49};
		sortAlgorithm.quickSort(array, 0, array.length - 1);
		for (int i : array) {
			System.out.print(i + "  ");
		}
	}
}
