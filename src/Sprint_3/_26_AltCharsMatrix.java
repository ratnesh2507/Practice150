package Sprint_3;
/*Problem 26: Print a Pattern of Alternating Characters in Rows
Difficulty: Hard
Topics: Pattern Printing
Hint: Print a pattern where rows alternate between two characters.

        Example 1: Input: n = 4
Output:
        ABAB
        BABA
        ABAB
        BABA
 */
import java.util.*;
public class _26_AltCharsMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] mat = genAltCharsMatrix(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    public static char[][] genAltCharsMatrix(int n){
        char[][] res = new char[n][n];
        char ch = 'B';
        for(int i=0;i<n;i++){
            ch = ch=='A' ? 'B' : 'A';
            for(int j=0;j<n;j++){
                res[i][j] = ch;
                ch = ch=='A' ? 'B' : 'A';
            }
        }
        return res;
    }
}
