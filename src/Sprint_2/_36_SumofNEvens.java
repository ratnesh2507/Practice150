package Sprint_2;
import java.util.*;
/*Finding the Sum of the First N Even Numbers
        Difficulty: Easy
        Topics: Mathematical Computations
        Description: Write a program to calculate the sum of the first N even numbers.
        Example:
        Input: N = 4
        Output: 20
        Explanation: The first 4 even numbers are 2, 4, 6, 8, and their sum is 20.
 */
import static Sprint_1._21_SumOfEvenNums.SumOfEvens;

public class _36_SumofNEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = SumOfEvens(0, n);
        System.out.println(ans);
    }
}
