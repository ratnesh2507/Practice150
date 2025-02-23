package Sprint_2;
/*Finding All Subsets of a Set
Difficulty: Medium
Topics: Combinatorics
Description: Write a program to generate all possible subsets of a given set of numbers.
Example:
Input: set = [1, 2]
Output: [[], [1], [2], [1, 2]]
Explanation: The subsets of [1, 2] are the empty set, [1], [2], and [1, 2].
 */

//Link https://www.geeksforgeeks.org/backtracking-to-find-all-subsets/
//LC : https://leetcode.com/problems/subsets/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _18_FindingAllSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] set = new int[size];
        for(int i=0;i<size;i++){
            set[i] = sc.nextInt();
        }
        List<List<Integer>> ans = new ArrayList<>();
        printSubsets(set,0,new ArrayList<>(),ans);
        for(List<Integer> subset : ans){
            System.out.println(subset);
        }

    }
    public static void printSubsets(int[] nums,int start,List<Integer> temp,List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            printSubsets(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
