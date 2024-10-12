/*Sorting an Array
Difficulty: Easy
Topics: Basic Programming, Sorting Algorithms
Description: Write a program to sort an array of numbers in ascending order.
Example:
Input: array = [3, 1, 4, 1, 5, 9]
Output: [1, 1, 3, 4, 5, 9]
Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].
 */

//Link https://www.geeksforgeeks.org/sorting-in-array/

import java.util.Scanner;

public class _15_SortingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        SortArray(arr,N);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SortArray(int[] arr, int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
