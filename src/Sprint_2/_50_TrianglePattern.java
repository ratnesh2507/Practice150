package Sprint_2;
import java.util.*;
/*Generating a Triangle Pattern of Stars with a Given Height
Difficulty: Easy
Topics: Patterns
Description: Write a program to create a triangle pattern of stars with a specified height.
Example:
Input: height = 4
Output:

        *
        **
        ***
        ****
 */


public class _50_TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for(int i=0;i<height;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
