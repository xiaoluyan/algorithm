package datastructure.array;

/**
 * 面试题3：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下的数序排列。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 * 解题思路：
 * 举例具体化问题，可以得出规律：
 * 首先选取数组中右上角的数字。如果该数字等于要查找的数字，查找过程结束；如果该数字大于要查找的数字，
 * 剔除这个数字所在的列；如果该数字小于要查找的数字，剔除这个数字所在的行。也就是说如果要查找的数字
 * 不在数组的右上角，则每一次都在数组的查找范围中剔除一行或一列，这样每一步都可以缩小查找的范围，
 * 直到找到查找的数字，或者查找范围为空。
 * @author 65684
 *
 */
public class J03FindValueFrom2DArray {

	public static boolean findValue(int[][] array, int target) {
		boolean found = false;
		if(array != null) {
			int rows = array.length;
			int columns = array[0].length;
			int row = 0;
			int column = columns - 1;
			while(row < rows && column >= 0) {
				if(array[row][column] == target) {
					found =true;
					break;
				} else if(array[row][column] > target) {
					column--;
				} else {
					row++;
				}
			}
		}
		return found;
	}

	public static void main(String[] args) {
		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int target = 7;
		boolean found = findValue(array, target);
		System.out.println(found);
	}
}
