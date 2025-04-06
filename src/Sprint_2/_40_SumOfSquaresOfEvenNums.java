package Sprint_2;
import java.util.*;
/*Finding the Sum of the Squares of All Even Numbers Up to N
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to calculate the sum of squares of all even numbers up to a given N.
Example:
Input: N = 4
Output: 20
Explanation: The even numbers up to 4 are 2 and 4, and their squares are 4 and 16. The sum is 20.
 */

public class _40_SumOfSquaresOfEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSquaresOfEvens(n));
    }
    public static int sumOfSquaresOfEvens(int n){
        int sum = 0;
        for(int i=2;i<=n;i+=2){
            sum += i*i;
        }
        return sum;
    }
}
