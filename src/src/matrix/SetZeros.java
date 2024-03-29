package src.matrix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
https://leetcode.com/problems/set-matrix-zeroes/
Algorithm

We iterate over the matrix and we mark the first cell of a row i and first cell of a column j, if the condition in the pseudo code above is satisfied. i.e. if cell[i][j] == 0.

The first cell of row and column for the first row and first column is the same i.e. cell[0][0]. Hence, we use an additional variable to tell us if the first column had been marked
 or not and the cell[0][0] would be used to tell the same for the first row.

Now, we iterate over the original matrix starting from second row and second column i.e. matrix[1][1] onwards. 
For every cell we check if the row r or column c had been marked earlier by checking the respective first row cell or first column cell. 
If any of them was marked, we set the value in the cell to 0. Note the first row and first column serve as the row_set and column_set that we used in the first approach.

We then check if cell[0][0] == 0, if this is the case, we mark the first row as zero.

And finally, we check if the first column was marked, we make all entries in it as zeros.
*/
public class SetZeros {
        public static void setZeroes(int[][] matrix) {
            Boolean isCol = false;
            int R = matrix.length;
            int C = matrix[0].length;

            for (int i = 0; i < R; i++) {

                // Since first cell for both first row and first column is the same i.e. matrix[0][0]
                // We can use an additional variable for either the first row/column.
                // For this solution we are using an additional variable for the first column
                // and using matrix[0][0] for the first row.
                if (matrix[i][0] == 0) {
                    isCol = true;
                }

                for (int j = 1; j < C; j++) {
                    // If an element is zero, we set the first element of the corresponding row and column to 0
                    if (matrix[i][j] == 0) {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }

            // Iterate over the array once again and using the first row and first column, update the elements.
            for (int i = 1; i < R; i++) {
                for (int j = 1; j < C; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // See if the first row needs to be set to zero as well
            if (matrix[0][0] == 0) {
                for (int j = 0; j < C; j++) {
                    matrix[0][j] = 0;
                }
            }

            // See if the first column needs to be set to zero as well
            if (isCol) {
                for (int i = 0; i < R; i++) {
                    matrix[i][0] = 0;
                }
            }


            print2D(matrix);
        }

    public static void print2D(int mat[][])
    {
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
        System.out.println("***-------------***");
    }
    
    public static void main(String args[]) {
      
       // int[][] matrix = new int[3][3];
      //  [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int matrix[][] = { { 1},
                { 0}};
               
        
       
        print2D(matrix);
        setZeroes(matrix);
       
    }


}
