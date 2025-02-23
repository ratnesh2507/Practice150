package Sprint_2;
/*Finding the Longest Consecutive Sequence in an Array
Difficulty: Medium
Topics: Arrays, Hashing
Description: Write a program to find the longest sequence of consecutive numbers in an array.
Example:
Input: array = [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive sequence is [1, 2, 3, 4].
 */

//Link https://www.geeksforgeeks.org/longest-consecutive-subsequence/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _16_LongestContinuousSequenceInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the entire line
        String line = sc.nextLine();

        // Split the line into strings and convert to integers
        String[] numbers = line.split(" ");
        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println(LongContSeqInArr(arr));
    }

    public static int LongContSeqInArr(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int res=0;
        for(int num: arr)
            set.add(num);

        for(int val: arr){
            if(set.contains(val) && !set.contains(val - 1)){
                int current = val , count = 0;
                while(set.contains(current)){
                    set.remove(current);
                    current++;
                    count++;
                }
                res = Math.max(res,count);
            }
        }

        return res;
    }
}