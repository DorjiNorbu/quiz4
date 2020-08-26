package quiz4.question12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorji Norbu on 25-Aug-20.
 */
public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int rowMin=matrix[i][0], rowMinIndex=0, colMax=0;
            for(int j=0;j<matrix[i].length;j++){
//                rowMin=Integer.min(rowMin,matrix[i][j]);

                if (rowMin > matrix[i][j]) {
                    rowMin = matrix[i][j];
                    rowMinIndex = j;
                }
            }
            for(int j=0;j<matrix.length;j++){
                colMax=Integer.max(colMax,matrix[j][rowMinIndex]);
            }
            if(rowMin==colMax){
                list.add(rowMin);
            }
        }
        return list;
    }
}
