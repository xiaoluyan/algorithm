package arr;

public class J29MoreThanHalfNum {
	/**
	 * 数组中有一个数字出现的次数超过数组长度的一半，
	 * 也就是说它出现的次数比其他所有数字出现的次数的和还要多。
	 * 因此我们可以遍历数组的时候保存两个值：一个是数组中的一个数字，一个是次数。
	 * 当我们遍历到下一个数字的时候，如果下一个数字和我们之前保存的数字相同，则次数加1；
	 * 如果下一个数字和我们之前保存的数字不同，则次数减1.
	 * 如果次数为0，我们需要保存下一个数字，并把次数设为1.
	 * 由于我们要找的数字出现的次数比其他所有数字出现的次数之和还要多，
	 * 那么要找的数字肯定是最后一次把次数设为1时对应的数字。
	 * @param array
	 * @return
	 */
  public int MoreThanHalfNum_Solution(int [] array) {
        
	  if(array == null || array.length <= 0) {
		  return 0;
	  }
	  
	  int res = array[0];
	  int times = 1;
	  for(int i = 1; i < array.length; i++) {
		  if(times == 0) {
			  res = array[i];
			  times = 1;
		  } else if (res == array[i]) {
			  times++;
		  } else {
			  times--;
		  }
	  }
	  if(!checkIsMoreThanHalf(array, res)) {
		  return 0;
	  }
	  return res;
  }
  
  public boolean checkIsMoreThanHalf(int[] array, int res) {
	  boolean flag = true;
	  int times = 0;
	  for(int i =0; i < array.length; i++) {
		  if(res == array[i]) {
			  times++;
		  }
	  }
	  if(times * 2 <= array.length) {
		  flag = false;
	  }
	  return flag;
  }
}
