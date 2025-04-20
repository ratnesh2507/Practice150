package Sprint_3;
/*Problem 10: Print a Pyramid Pattern with Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a pyramid pattern with increasing numbers. Each row should have an increasing sequence of numbers, centered horizontally.

Example 1: Input: n = 3
Output:

         1
        232
       34543
 */
import java.util.*;

public class _10_NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Print increasing numbers
            int num = i;
            for(int j=1;j<=i;j++){
                System.out.print(num++);
            }
            // Print decreasing numbers
            num -= 2;
            for(int j=1;j<i;j++){
                System.out.print(num--);
            }
            System.out.println();
        }
    }
}
