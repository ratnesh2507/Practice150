package Sprint_1;/*Finding the Sum of Elements in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the sum of elements in an array.
Example:
Input: array = [1, 2, 3, 4, 5]
Output: 15
Explanation: The sum of the elements in the array is 15.
*/

//Link https://www.geeksforgeeks.org/program-find-sum-elements-given-array/

import java.util.Scanner;

public class _16_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int ans = SumOfArray(arr,N);
        System.out.println("Sum is: "+ ans);
    }
    public static int SumOfArray(int[] arr,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
}
