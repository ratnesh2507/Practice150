package Sprint_2;
import java.util.*;

import static Sprint_2._45_FillMatrixWithRandomNums.fillMatrixWithRandomValues;
/*Generating a Square Matrix with Random Values
Difficulty: Easy
Topics: Random Number Generation, Matrix Operations
Description: Write a program to generate a square matrix where each element is a random value.
        Example:
Input: size = 3
Output:

        7 3 5
        2 6 9
        1 8 4
 */

public class _48_SquareMatrixWithRandoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        fillMatrixWithRandomValues(mat,size,size);
    }
}
