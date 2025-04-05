package Sprint_2;
/*Finding the Median of a List of Numbers
        Difficulty: Medium
        Topics: Sorting, Mathematical Computations
        Description: Write a program to find the median value of a list of numbers.
        Example:
        Input: list = [3, 1, 4, 1, 5]
        Output: 3
        Explanation: After sorting the list to [1, 1, 3, 4, 5], the median is 3.
 */

import java.util.Arrays;
import java.util.Scanner;

import static Sprint_1._32_MedianOfArray.Median;

public class _33_MedianOfArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double ans = Median(arr, N);
        System.out.println(ans);
    }
}