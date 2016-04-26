package searchandsort;

import java.util.ArrayList;
import java.util.TreeSet;

public class J30GetLeastKNums {
	/**
	 * 求数组中最小的K个数
	 * @param input
	 * @param k
	 * @return
	 */
	  public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        //TreeSet默认是从小到大排序
	        TreeSet<Integer> treeSet = new TreeSet<Integer>();
	        if(input == null || input.length == 0 || k <= 0) {
	        	return res;
	        }
	        
	        for(int i = 0; i < input.length; i++) {
	        	if(treeSet.size() < k) {
	        		treeSet.add(input[i]);
	        	} else if (treeSet.size() > 0 && treeSet.last() > input[i]) {
	        		treeSet.pollLast();
	        		treeSet.add(input[i]);
	        	}
	        }
	        
	        if(treeSet.size() == k) {
	        	res.addAll(treeSet);
	        }
	        
	        return res;
	  }
}
