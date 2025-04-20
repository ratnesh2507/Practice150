package Sprint_3;
/*Problem 15: Print a Right-Angle Triangle Pattern with Characters
Difficulty: Medium
Topics: Pattern Printing
Hint: Print a right-angle triangle pattern using characters. Each row should contain the same character repeated according to the row number.

        Example 1: Input: n = 3
Output:

        A
        BB
        CCC
 */
import java.util.*;

public class _15_IncreasingCharsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
