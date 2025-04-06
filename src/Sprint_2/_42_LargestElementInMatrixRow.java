package Sprint_2;
import java.util.*;
/*Finding the Largest Element in Each Row of a Matrix
Difficulty: Easy
Topics: Matrix Operations
Description: Write a program to find the largest element in each row of a matrix.
Example:
Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: [3, 6, 9]
Explanation: The largest elements in each row are 3, 6, and 9.
 */

public class _42_LargestElementInMatrixRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int[] ans = largestElementInEachRow(mat,size);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
    public static int[] largestElementInEachRow(int[][] mat){
        List<Integer> res = new ArrayList<>();
        for(int[] row : mat){
            res.add(maxInArr(row));
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int maxInArr(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num : arr){
            max = Math.max(max,num);
        }
        return max;
    }
}
