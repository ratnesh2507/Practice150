package Sprint_2;

/*Generating a Matrix of Fibonacci Numbers
Difficulty: Medium
Topics: Arrays, Matrix Operations
Description: Write a program to generate a matrix where each element is a Fibonacci number.
Example:
Input: size = 3
Output:
        1 1 2
        3 5 8
        13 21 34
*/

//Link

import java.util.Scanner;

public class _12_FibonacciMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] ans = FibonacciMatrix(size);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] FibonacciMatrix(int size) {
        int[][] mat = new int[size][size];
        int totalfibs = size*size;
        int[] fib = new int[totalfibs];
        fib[0] = 1;
        if (totalfibs > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < totalfibs; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        int idx=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                mat[i][j] = fib[idx++];
            }
        }
        return mat;
    }
}
