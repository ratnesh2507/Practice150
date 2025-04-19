package Sprint_3;
/*Problem 1: Print a Right-Angle Triangle of Stars
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a right-angle triangle pattern of stars (*). Each row should contain an increasing number of stars, starting from 1 star in the first row.

        Example 1: Input: n = 4
Output:

        *
        **
        ***
        ****
 */

import java.util.*;
public class _1_RightTriangleOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
