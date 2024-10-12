/*Finding the Largest and Smallest Numbers in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the largest and smallest numbers in an array.
        Example:
Input: array = [4, 7, 1, 8, 5]
Output: Largest: 8, Smallest: 1
Explanation: The largest number in the array is 8 and the smallest is 1.
 */

//Link https://www.geeksforgeeks.org/how-to-get-largest-and-smallest-number-in-an-array/

import java.util.Scanner;

public class _14_MaxAndMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        MaxAndMin(arr,N);
    }
    public static void MaxAndMin(int[] arr,int n){
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max: "+max+" ,Min: "+min);
    }
}
