package Sprint_3;

import java.util.Scanner;

/*Problem 30: Print a Cross Pattern of Stars with Diagonals
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a cross pattern using stars with intersecting diagonals.

        Example 1: Input: n = 5
Output:

        * * * * *
         * * * *
          * * *
           * *
            *
           * *
          * * *
         * * * *
        * * * * *
 */
public class _30_HourglassUsingStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n - (2*i+1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j< 2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}