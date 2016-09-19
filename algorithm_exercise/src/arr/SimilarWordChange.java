package arr;

import java.util.Scanner;

//相似单词变换
public class SimilarWordChange {
    public static void calcDist(char[] src, char[] obj) {
        if (src==null || obj==null){
            return;
        }
        final int rem = 1, ins = 1, rep = 1; // 考虑操作remove insert replace代价，越低越好
        
        int[][] leven = new int[src.length+1][obj.length+1];
        for (int i=0; i<=src.length; i++) {
            leven[i][0] = i * rem;
        }
        for (int i=0; i<=obj.length; i++) {
            leven[0][i] = i * ins;
        }
        for (int i=1; i<=src.length;i++) {
            for(int j=1; j<=obj.length;j++) {
                if (src[i-1] == obj[j-1]) {
                    leven[i][j] = leven[i-1][j-1];
                } else {
                    leven[i][j] = Math.min(Math.min(leven[i-1][j]+ins, leven[i][j-1]+rem), 
                            leven[i-1][j-1]+rep);
                }
            }
        }
        System.out.println(leven[src.length][obj.length]);   
    }
    
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while(in.hasNextLine()){
            String line = in.nextLine();
            String[] input = line.split(" ");
            if(input.length!=2) continue;
            calcDist(input[0].toCharArray(), input[1].toCharArray());
        }
    }

}
