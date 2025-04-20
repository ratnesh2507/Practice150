package Sprint_3;
/*Problem 19: Print an Inverted Pyramid Pattern with Characters
Difficulty: Medium
Topics: Pattern Printing
Hint: Print an inverted pyramid pattern using characters. Each row should have decreasing characters from the top row.

Example 1: Input: n = 3
Output:

        CCC
         BB
          A
 */
import java.util.*;
public class _19_InvertedAlphaPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            // Print leading spaces
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            char ch =(char)('A' + n - 1 - i);
            for(int j=0;j<n - i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
