package Sprint_2;
/*Generating a Matrix with a Spiral Pattern
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a matrix filled with numbers in a spiral pattern.
Example:
Input: size = 3
Output:
        1 2 3
        8 9 4
        7 6 5
 */

//Link https://www.geeksforgeeks.org/form-a-spiral-matrix-from-the-given-array/
// LC : https://leetcode.com/problems/spiral-matrix-ii/

import java.util.Scanner;

public class _17_SpiralMatrix {
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
    public static int[][] spiralMatrix(int n) {
        int r1=0,r2=n-1;
        int c1=0,c2=n-1;
        int[][] arr = new int[n][n];
        int val = 1;
        while(r1<=r2 && c1<=c2){
            //right
            for(int col=c1;col<=c2;col++) arr[r1][col] = val++;
            //down
            for(int row=r1+1;row<=r2;row++) arr[row][c2] = val++;
            //left and up
            if(r1<r2 && c1<c2){
                //left
                for(int col=c2-1;col>c1;col--) arr[r2][col] = val++;
                //up
                for(int row=r2;row>r1;row--) arr[row][c1] = val++;
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        return arr;
    }
}
