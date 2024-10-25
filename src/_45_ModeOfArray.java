/*Finding the Mode of Numbers in an Array
Difficulty: Medium
Topics: Arrays, Statistical Analysis
Description: Write a program to find the mode (most frequent number) in an array.
Example:
Input: array = [1, 2, 2, 3, 4, 4, 4]
Output: 4
Explanation: The most frequent number in the array is 4.
 */

//Link https://www.geeksforgeeks.org/finding-mode-of-numbers-in-array-in-cpp/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class _45_ModeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int mode = arr[0];
        int maxFrequency = 0;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("Mode: " + mode);
    }
}