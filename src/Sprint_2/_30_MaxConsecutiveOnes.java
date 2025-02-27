package Sprint_2;
/*Finding the Longest Sequence of Consecutive 1s in a Binary Array
Difficulty: Medium
Topics: Arrays, Binary Operations
Description: Write a program to find the longest sequence of consecutive 1s in a binary array.
        Example:
Input: array = [1, 1, 0, 1, 1, 1]
Output: 3
Explanation: The longest sequence of 1s is [1, 1, 1] with length 3.
 */

//Link https://leetcode.com/problems/max-consecutive-ones/description/

import java.util.Scanner;

public class _30_MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }
        return ans;
    }
}
