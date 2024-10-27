package Sprint_1;/*Generating a Pascal’s Triangle
Difficulty: Medium
Topics: Arrays, Mathematical Computations
Description: Write a program to generate Pascal's Triangle up to a given number of rows.
Example:
Input: rows = 4
Output:
        1
        1 1
        1 2 1
        1 3 3 1
Explanation: Pascal's Triangle with 4 rows is generated.
 */

//Link https://www.geeksforgeeks.org/pascal-triangle/

import java.util.Scanner;

public class _31_PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(PascalCoeff(i,j)+" ");
            }
            System.out.println();
        }
    }
    public static int PascalCoeff(int i,int j){
        int res =1;
        if(j> i-j){
            j = i-j;
        }
        for (int k = 0; k < j; ++k)
        {
            res *= (i - k);
            res /= (k + 1);
        }
        return res;
    }
}
