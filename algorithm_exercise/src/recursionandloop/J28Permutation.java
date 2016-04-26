package recursionandloop;

import java.util.ArrayList;
import java.util.Collections;

public class J28Permutation {
	/**
	 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
	 * 例如输入字符串abc,则打印出由字符a,b,c
	 * 所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
	 * 结果请按字母顺序输出。 
	 * @param str
	 * @return
	 */
   public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
 
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, res);
            Collections.sort(res);//字典排序
        }
 
        return res;
    }
 
    public void PermutationHelper(char[] cs, int i, ArrayList<String> strList) {
        if(i == cs.length - 1) { //解空间的一个叶节点
            strList.add(String.valueOf(cs)); //找到一个解
        } else {
            for(int j = i; j < cs.length; ++j) {
                if(j == i || cs[j] != cs[i]) {
                    swap(cs, i, j);
                    PermutationHelper(cs, i + 1, strList);
                    swap(cs, i, j); //复位
                }
            }
        }
    }
    
   public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
       
   public static void main(String[] args) {
		
	   J28Permutation j28Permutation = new J28Permutation();
	   String str = "abc";
	   ArrayList<String> res = j28Permutation.Permutation(str);
	   for (int i = 0; i < res.size(); i++) {
		System.out.println(res.get(i));
	   }
   }
}
