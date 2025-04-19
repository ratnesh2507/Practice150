package Sprint_3;
/*Problem 6: Print a Number Triangle
        Difficulty: Easy
        Topics: Pattern Printing
        Hint: Print a right-angle triangle pattern with numbers. Each row should contain an increasing sequence of numbers starting from 1.

        Example 1: Input: n = 4
        Output:

        1
        12
        123
        1234
 */

import java.util.Scanner;

public class _6_NumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
