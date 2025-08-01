


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
