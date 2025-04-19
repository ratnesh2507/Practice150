package Sprint_3;
/*Problem 2: Print a Square of Stars
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a square pattern of stars (*). Each row and column should have the same number of stars.

        Example 1: Input: n = 5
Output:

        *****
        *****
        *****
        *****
        *****
 */

import java.util.*;
public class _2_SquareOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
