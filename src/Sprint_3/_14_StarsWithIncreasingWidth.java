package Sprint_3;
/*Problem 14: Print a Star Pattern with Increasing Width
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a pattern where each row has an increasing width of stars.

Example 1: Input: n = 3
Output:

        *
        ***
        *****
 */
import java.util.*;

public class _14_StarsWithIncreasingWidth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int width=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<width;j++){
                System.out.print("*");
            }
            width+=2;
            System.out.println();
        }
    }
}
