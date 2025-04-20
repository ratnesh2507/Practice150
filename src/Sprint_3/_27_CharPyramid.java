package Sprint_3;
/*Problem 27: Print a Number Pyramid Pattern with Characters
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a pyramid pattern using increasing characters, where each row increases in width and character range.

        Example 1: Input: n = 3
Output:
         A
        BCD
       EFGHI
 */
import java.util.*;
public class _27_CharPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i = 1; i <= n; i++){
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print characters
            int charsInRow = 2 * i - 1;
            for (int j = 1; j <= charsInRow; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
