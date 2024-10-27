package Sprint_1;/*Finding Missing Numbers in a Sequence
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find missing numbers in a sequence from 1 to n.
Example:
Input: sequence = [1, 2, 4, 5]
Output: [3]
Explanation: The missing number in the sequence from 1 to 5 is 3.
 */

//Link https://www.geeksforgeeks.org/how-to-find-missing-numbers/

import java.util.Scanner;

public class _30_MissingNumberInSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(MissingNumber(arr,n));
    }
    public static int MissingNumber(int[] arr,int n){
        int sum = ((n+1)*(n+2))/2;
        int arrSum = 0;
        for(int i=0;i<n;i++){
            arrSum += arr[i];
        }
        return sum-arrSum;
    }
}
