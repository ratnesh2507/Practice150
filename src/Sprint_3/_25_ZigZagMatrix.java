package Sprint_3;
/*Problem 25: Print a Matrix with Zigzag Pattern
        Difficulty: Hard
        Topics: Matrix Pattern
        Hint: Print a matrix with a zigzag pattern of numbers. The numbers should alternate direction row-wise.
        Example 1: Input: n = 3
        Output:
        1 2 3 4
        8 7 6 5
        9 10 11 12
 */
import java.util.*;
public class _25_ZigZagMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = 4;
        int[][] matrix = generateZigzagMatrix(rows, cols);
        printMatrix(matrix);
    }
    // Function to generate a zigzag matrix
    public static int[][] generateZigzagMatrix(int rows, int cols){
        int[][] mat = new int[rows][cols];
        int num = 1;
        for(int i=0;i<rows;i++){
            if(i%2 == 0){
                // Left to right
                for(int j=0;j<cols;j++){
                    mat[i][j] = num++;
                }
            }else{
                // Right to left
                for(int j=cols-1;j>=0;j--){
                    mat[i][j] = num++;
                }
            }
        }
        return mat;
    }
    // Function to print a matrix
    public static void printMatrix(int[][] mat){
        for(int[] row : mat){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
