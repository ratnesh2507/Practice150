package Sprint_2;
import java.util.*;
/*Finding the Length of the Longest Word in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to find the length of the longest word in a given string.
        Example:
Input: string = "Find the longest word"
Output: 8
Explanation: The longest word is "longest" with length 8.
 */

public class _46_FindLengthOfLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        System.out.println(findLengthOfLongestWord(line));
    }
    public static int findLengthOfLongestWord(String[] line){
        int maxLen = 0;
        for(String word : line){
            maxLen = Math.max(maxLen,word.length());
        }
        return maxLen;
    }
}