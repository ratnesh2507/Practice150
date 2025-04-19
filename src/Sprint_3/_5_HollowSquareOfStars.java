package Sprint_3;
/*Problem 5: Print a Hollow Square of Stars
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a hollow square pattern with stars (*). The border of the square should be filled with stars while the inner part should be empty.

Example 1: Input: n = 5
Output:

        *****
        *   *
        *   *
        *   *
        *****
 */
import java.util.*;
public class _5_HollowSquareOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HollowSquare(n);
    }
    public static void HollowSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 || i==n-1) || (j==0 || j==n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
