package Sprint_2;
import java.util.*;
/*Finding the Common Elements in Two Arrays
Difficulty: Medium
Topics: Arrays
Description: Write a program to find common elements between two arrays.
Example:
Input: array1 = [1, 2, 3, 4], array2 = [3, 4, 5, 6]
Output: [3, 4]
Explanation: The common elements between the two arrays are 3 and 4.
 */

//Link https://leetcode.com/problems/find-common-elements-between-two-arrays/description/

public class _39_CommonElementsInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) arr2[i] = sc.nextInt();
        int[] ans = commonElementsInArrs(arr1,arr2);
        for(int num : ans) System.out.print(num+ " ");
    }
    public static int[] commonElementsInArrs(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        List<Integer> res = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : arr1) set1.add(num);
        for(int num : arr2) set2.add(num);
        for(int num : set1){
            if(set2.contains(num)) res.add(num);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
