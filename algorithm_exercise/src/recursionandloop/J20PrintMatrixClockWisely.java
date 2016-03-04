package recursionandloop;

import java.util.ArrayList;

public class J20PrintMatrixClockWisely {
	
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
    	if(matrix == null) {
    		return null;
    	}
    	
    	ArrayList<Integer> resList = new ArrayList<>();
    	int rowsIndex = matrix.length - 1;
    	int colsIndex = matrix[0].length - 1;
    	//计算打印的圈数
    	int circles = (rowsIndex < colsIndex ? rowsIndex : colsIndex) / 2 + 1;
    	for (int i = 0; i < circles; i++) {
			//从左向右打印
    		for(int j = i; j <= colsIndex -i; j++ ) {
    			resList.add(matrix[i][j]);
    		}
    		//从上到下打印
    		if(i < (rowsIndex - i)) { //需要打印的前提是至少有两行，即终止行号大于起始行号
	    		for (int j = i + 1; j <= rowsIndex - i; j++) {
					resList.add(matrix[j][colsIndex - i]);
				}
    		}
    		//从右往左打印
    		if(i < (rowsIndex - i) && i < (colsIndex - i)) { //需要打印的前提是至少有两行两列，即终止行号大于起始行号且终止列号大于起始列号
    			for(int j = colsIndex -i -1; j >= i; j--) {
    				resList.add(matrix[rowsIndex - i][j]);
    			}
    		}
    		
    		//从下往上打印
    		if(i < (rowsIndex - i - 1 ) && i < colsIndex - i) { //需要打印的前提是至少有三行两列，即终止行号比起始行号至少大于2且终止列号大于起始列号
    			for (int j = rowsIndex - i - 1; j > i; j--) {
					resList.add(matrix[j][i]);
				}
    		}
		}
		return resList;
    }
    
    public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ArrayList<Integer> res = J20PrintMatrixClockWisely.printMatrix(matrix);
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
	}
    
}
