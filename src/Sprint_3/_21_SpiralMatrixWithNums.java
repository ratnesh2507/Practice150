package Sprint_3;
/*Problem 21: Print a Spiral Matrix
Difficulty: Hard
Topics: Matrix Pattern
Hint: Print a matrix filled with numbers in a spiral pattern. The numbers should start from 1 and increment as you move around the spiral.

Example 1: Input: n = 3
Output:

        1 2 3
        8 9 4
        7 6 5
 */
import java.util.*;

import static Sprint_2._17_SpiralMatrix.spiralMatrix;

public class _21_SpiralMatrixWithNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = spiralMatrix(size);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
