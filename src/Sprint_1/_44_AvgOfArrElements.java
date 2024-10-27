package Sprint_1;/*Finding the Average of Numbers in an Array
Difficulty: Easy
Topics: Arrays, Mathematical Computations
Description: Write a program to calculate the average of numbers in an array.
Example:
Input: array = [1, 2, 3, 4, 5]
Output: 3
Explanation: The average of the numbers is (1 + 2 + 3 + 4 + 5) / 5 = 3.
 */

//Link https://www.geeksforgeeks.org/program-average-array-iterative-recursive/

import java.util.Scanner;

public class _44_AvgOfArrElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = _16_SumOfArrayElements.SumOfArray(arr,n);
        int avg = sum/n;
        System.out.println(avg);
    }
}
