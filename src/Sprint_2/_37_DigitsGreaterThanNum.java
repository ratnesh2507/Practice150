package Sprint_2;
import java.util.*;
/*Finding the Count of Digits Greater Than a Specific Value
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to count how many digits in a number are greater than a specific value.
        Example:
Input: number = 54321, value = 3
Output: 2
Explanation: The digits greater than 3 in 54321 are 5, 4, and 4, so the count is 2.
 */

public class _37_DigitsGreaterThanNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(digitsGreaterThanNum(num,target));
    }
    public static int digitsGreaterThanNum(int num,int target){
        int cnt=0;
        while(num>0){
            int digit = num %10;
            if(digit>target) cnt++;
            num /= 10;
        }
        return cnt;
    }
}
