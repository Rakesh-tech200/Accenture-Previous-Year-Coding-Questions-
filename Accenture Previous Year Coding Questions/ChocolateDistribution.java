
/* 
Given an array arr[] of positive integers, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that -
      i. Each student gets exactly one packet.
     ii. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum and return that minimum possible difference.

Examples:

Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following m packets :[3, 4, 9, 7, 9].
Input: arr = [7, 3, 2, 4, 9, 12, 56], m = 3
Output: 2
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 4 - 2 = 2 by choosing following m packets :[3, 2, 4].
Input: arr = [3, 4, 1, 9, 56], m = 5
Output: 55
Explanation: With 5 packets for 5 students, each student will receive one packet, so the difference is 56 - 1 = 55.
Constraints:
1 ≤ m <= arr.size ≤ 105
1 ≤ arr[i] ≤ 109
    */


import java.util.*;
public class ChocolateDistribution {

    public static int chocolateDistribution (int arr[], int m)
    {
        if(arr.length == 0 || m == 0){
            return 0;
        }

        Arrays.sort(arr);

        if(m > arr.length-1){
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            int j = i + m - 1;

            if(j >= arr.length){
                break;
            }

            int diff = arr[j] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;

    }

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
 
        int result = chocolateDistribution(arr, m);
 
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
