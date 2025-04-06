package Sprint_2;
import java.util.*;
/*Finding All Triplets in an Array That Sum to Zero
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find all unique triplets in an array that sum to zero.
        Example:
Input: array = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]
Explanation: The unique triplets that sum to zero are listed.
 */

public class _47_TripletsInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = findTriplets(arr);
        for (List<Integer> triplet : ans) {
            System.out.print(triplet+ ", ");
        }
    }
    public static List<List<Integer>> findTriplets(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length - 2;i++){
            if(i>0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1;
            int right = arr.length - 1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while(left<right && arr[left] == arr[left + 1]) left++;
                    while(left<right && arr[right] == arr[right - 1]) right--;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }
}