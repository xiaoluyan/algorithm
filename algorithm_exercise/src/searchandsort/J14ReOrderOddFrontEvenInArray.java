package searchandsort;

public class J14ReOrderOddFrontEvenInArray {
	
	/**
	 * 题目描述：
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
	 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分。
	 * 
	 * 解题思路：
	 * 原书中的方法，类似于快排。
	 * 维护两个指针，第一个指针index1指向第一个数，第二个指针index2指向最后一个数。
	 * index1只向后移动，直到遇到偶数，index2只向前移动，直到遇到奇数。交换两个指针指向的数字。
	 * @param array
	 */
    public void reOrderArray_1(int [] array) {
    	if(array == null || array.length == 0) {
    		return;
    	}
        int index1 = 0;
        int index2 = array.length - 1;
        while(index1 < index2) {
        	
        	//向后移动index1,直到它指向偶数
        	while((index1 < index2) && (!isEven(array[index1]))) {
        		index1++;
        	}
        	//向前移动index2，直到它指向奇数
        	while((index1 < index2) && (isEven(array[index2]))) {
        		index2--;
        	}
        	
        	//交换
        	if(index1 < index2) {
        		int temp = array[index1];
        		array[index1] = array[index2];
        		array[index2] = temp;
        	}
        }
    }
    
    /**
     * 题目描述：
     * 在上述基础上，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     * 
     * 解题思路：
     * 可以使用类似冒泡排序或插入排序的思想，
     * 因为这两种方法都是稳定的，不会改变数字的相对位置。
     * 本方法采用冒泡排序的思想。
     * @param array
     */
    public void reOrderArray_2(int [] array) {
    	if(array == null || array.length == 0) {
    		return;
    	}

    	for(int i = 0; i < array.length; i++) {
    		for (int j = array.length - 1; j > i; j--) {
    			//如果前偶后奇，交换位置
				if(isEven(array[j - 1]) && (!isEven(array[j]))) {
		        	//交换
	        		int temp = array[j - 1];
	        		array[j - 1] = array[j];
	        		array[j] = temp;
				}
			}
    	}
    }
    
    //判断是不是偶数。若是，返回true
    public boolean isEven(int num) {
    	return (num & 0x1) == 0;
    }
    
    public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		J14ReOrderOddFrontEvenInArray test = new J14ReOrderOddFrontEvenInArray();
//		test.reOrderArray_1(array);
		test.reOrderArray_2(array);
        //输出测试
        for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
        }
    }
}
