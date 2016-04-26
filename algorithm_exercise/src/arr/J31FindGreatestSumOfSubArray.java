package arr;

public class J31FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        
        
        if(array == null || array.length <= 0) {
            return 0;
        }
        //最小值不能设为0，有可能最大值是负数
        int greatestSubSum = Integer.MIN_VALUE;
        int subSum = 0;
        for(int i = 0; i < array.length; i++) {
            if(subSum <= 0) {
                subSum = array[i];
            } else {
                subSum += array[i];
            }
            
            if(subSum > greatestSubSum) {
                greatestSubSum = subSum;
            }
        }
        
        return greatestSubSum;
    }
}
