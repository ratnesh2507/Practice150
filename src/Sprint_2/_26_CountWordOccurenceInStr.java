package Sprint_2;
/*Finding the Count of a Specific Word in a String
        Difficulty: Easy
        Topics: String Manipulation
        Description: Write a program to count how many times a specific word appears in a given string.
        Example:
        Input: string = "hello world hello"
        Output: 2
        Explanation: The word "hello" appears 2 times in the string.
 */

//Link https://www.geeksforgeeks.org/count-occurrences-of-a-word-in-string/

import java.util.Scanner;

public class _26_CountWordOccurenceInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] ip = line.split(" ");
        String match = sc.next();
        sc.nextLine();
        int cnt=0;
        for(String str : ip){
            if(match.equals(str)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
