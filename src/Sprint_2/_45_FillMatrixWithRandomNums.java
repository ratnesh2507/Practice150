package Sprint_2;
import java.util.*;
/*Generating a Matrix with Random Numbers
Difficulty: Easy
Topics: Random Number Generation, Matrix Operations
Description: Write a program to generate a matrix filled with random numbers.
        Example:
Input: rows = 2, columns = 3
Output:

        3 8 1
        7 4 6
 */

public class _45_FillMatrixWithRandomNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] mat = new int[rows][columns];
        fillMatrixWithRandomValues(mat,rows,columns);
    }
    public static void fillMatrixWithRandomValues(int[][] mat,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = (int) Math.floor(Math.random()*10 + 1);
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
