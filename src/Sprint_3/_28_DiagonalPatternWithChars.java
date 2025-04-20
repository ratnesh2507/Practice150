package Sprint_3;
/*Problem 28: Print a Pattern with Diagonal Lines
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a pattern with diagonal lines using characters. Each diagonal line should be aligned properly.

        Example 1: Input: n = 4
Output:

A
B B
C   C
D     D
 */
import java.util.*;
public class _28_DiagonalPatternWithChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch = (char) ('A' + i - 1);
            System.out.print(ch);
            if(i>1){
                for(int j=1;j<= 2*(i-1)-1 ; j++){
                    System.out.print(" ");
                }
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
