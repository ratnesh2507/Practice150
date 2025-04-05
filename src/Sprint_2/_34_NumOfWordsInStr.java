package Sprint_2;
import java.util.*;
/*Finding the Number of Words in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to count the number of words in a given string.
        Example:
Input: string = "Hello world"
Output: 2
Explanation: There are 2 words in the string.
 */

//Link

public class _34_NumOfWordsInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] str = line.split(" ");
        System.out.println(numOfWordsInStr(str));
    }
    public static int numOfWordsInStr(String[] s){
        return s.length;
    }
}
