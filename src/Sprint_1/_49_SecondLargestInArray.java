package Sprint_1;/*Finding the Second Largest Number in an Array
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find the second largest number in an array.
Example:
Input: array = [10, 20, 4, 45, 99]
Output: 45
Explanation: The second largest number in the array is 45.
 */

//Link https://www.geeksforgeeks.org/find-second-largest-element-array/

import java.util.Arrays;
import java.util.Scanner;

public class _49_SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(SecondLargestOfArray(arr,n));
    }
    public static int SecondLargestOfArray(int[] arr,int n){
        for(int i=n-2;i>=0;i--){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
