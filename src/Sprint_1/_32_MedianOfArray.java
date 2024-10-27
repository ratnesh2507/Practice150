package Sprint_1;/*Finding the Median of an Array
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find the median of an array of numbers.
Example:
Input: array = [3, 1, 2, 4, 5]
Output: 3
Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.
 */

//Link https://takeuforward.org/data-structure/find-median-of-the-given-array/

import java.util.Arrays;
import java.util.Scanner;

public class _32_MedianOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double ans = Median(arr,N);
        System.out.println(ans);
    }
    public static double Median(int[] arr,int N){
        if(N%2==0){
            int idx1 = N/2 - 1;
            int idx2 = N/2;
            return ((double)(arr[idx1]+arr[idx2])/2);
        }
        return arr[N/2];
    }
}
