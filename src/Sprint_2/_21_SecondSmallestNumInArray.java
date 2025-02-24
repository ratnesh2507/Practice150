package Sprint_2;
/*Finding the Second Smallest Number in an Array
Difficulty: Easy
Topics: Arrays
Description: Write a program to find the second smallest number in an array.
Example:
Input: array = [12, 13, 1, 10, 34, 1]
Output: 10
Explanation: The second smallest number in the array is 10.
 */

//Link https://www.geeksforgeeks.org/find-second-largest-element-array/

import java.util.Scanner;

public class _21_SecondSmallestNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargest(arr,n));
        System.out.println(secondSmallest(arr,n));
    }
    public static int secondLargest(int[] arr,int n){
        int largest = arr[0],slargest = -1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static int secondSmallest(int[] arr,int n){
        int smallest = arr[0], ssmallest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]< smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
}
