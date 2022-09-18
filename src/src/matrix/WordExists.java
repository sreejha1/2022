package src.matrix;
/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
https://leetcode.com/problems/word-search/

 */

import java.util.Arrays;

public class WordExists {
    public static void print2D(String mat[][])
    {
        System.out.println("***-------------Row Length *** "+mat.length+" Column Num "+mat[0].length);
        for (String[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
        System.out.println("***-------------***");
    }

    public static void main(String args[]) {

        // int[][] matrix = new int[3][3];
        String matrix[][] = { { "A","B","C","E" },
                {"S","F","C","S" },
                { "A","D","E","E" },
                { "A","D","E","E" }};


        print2D(matrix);
        isWordExists(matrix,"ABCCE");

    }

    private static void isWordExists(String[][] matrix, String word) {
        int colLen = matrix[0].length;
        int rowLen = matrix.length;
        boolean travelDown = false;
        boolean travelRight = false;
        
       for(int  i=0; i< rowLen; i++){
           for (int j=0;j<colLen ; j++){
               String currentNum = matrix[i][j];
               String right = j <colLen -1 ? matrix[i][j+1]: "";
               String down = i< rowLen -1 ? matrix[i][j+1]: "";
               if(currentNum.equals(right)) travelRight = true;
               if(currentNum.equals(down)) travelDown = true;
               
           }
       }
    }
}
