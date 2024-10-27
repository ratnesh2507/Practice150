package Sprint_2;
/*Finding All Pairs of Elements in an Array that Add Up to a Given Sum
Difficulty: Medium
Topics: Arrays, Hashing
Description: Write a program to find all pairs of elements in an array whose sum equals a specified target.
Example:
Input: array = [1, 2, 3, 4, 5], target = 5
Output: [(1, 4), (2, 3)]
Explanation: Pairs that sum up to 5 are (1, 4) and (2, 3).
 */

//Link https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array

import java.util.HashSet;
import java.util.Scanner;

public class _4_SumOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        TwoSum(arr,target);
    }
    //Using hashset to check for compliment
    public static void TwoSum(int[] arr,int target){
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            int compliment = target - j;
            if (set.contains(compliment)) {
                printPair(j, compliment);
            }
            set.add(j);
        }
    }
    public static void printPair(int x,int y){
        System.out.println("["+y+" ,"+x+"]");
    }
}
