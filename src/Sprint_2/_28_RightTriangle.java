package Sprint_2;

import java.util.Scanner;

/*Generating a Right-Angle Triangle Pattern of Numbers
Difficulty: Easy
Topics: Patterns
Description: Write a program to create a right-angle triangle pattern with numbers.
        Example:
Input: height = 4
Output:

        1
        12
        123
        1234
 */
public class _28_RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        RightTriangle(height);
    }
    public static void RightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
