package Sprint_2;
/*Finding the Largest Sum of a Subarray
        Difficulty: Medium
        Topics: Arrays, Dynamic Programming
        Description: Write a program to find the largest sum of any contiguous subarray.
        Example:
        Input: array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        Output: 6
        Explanation: The largest sum is 6, from the subarray [4, -1, 2, 1].
 */

//Link https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/

import java.util.Scanner;

public class _27_LargestSumOfSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0,max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
