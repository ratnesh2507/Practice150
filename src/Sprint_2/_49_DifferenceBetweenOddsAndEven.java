package Sprint_2;
import java.util.*;
/*Finding the Difference Between the Sum of Even and Odd Numbers in an Array
Difficulty: Easy
Topics: Arrays, Mathematical Computations
Description: Write a program to calculate the difference between the sum of even and odd numbers in an array.
Example:
Input: array = [1, 2, 3, 4, 5, 6]
Output: 3
Explanation: The sum of even numbers is 12, and the sum of odd numbers is 3. The difference is 1.
 */

public class _49_DifferenceBetweenOddsAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        differenceBetweenOddSumAndEvenSum(arr);
    }
    public static void differenceBetweenOddSumAndEvenSum(int[] arr){
        int oddSum=0,evenSum=0;
        for(int num : arr){
            if(num%2==0) {
                evenSum+= num;
            } else {
                oddSum+= num;
            }
        }
        System.out.println(Math.abs(evenSum-oddSum));
    }
}
