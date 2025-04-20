package Sprint_3;
/*Problem 13: Print a Pattern of Consecutive Numbers
Difficulty: Medium
Topics: Matrix Pattern
Hint: Print a matrix of consecutive numbers starting from 1, filling rows sequentially.

        Example 1: Input: n = 3
Output:

        1 2 3
        4 5 6
        7 8 9
 */
import java.util.*;

public class _13_NumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = squareMatrix(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] squareMatrix(int n){
        int[][] matrix = new int[n][n];
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                matrix[i][j] = num;
                num++;
            }
        }
        return matrix;
    }
}
