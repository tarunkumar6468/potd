package problemOfTheDay;

import java.util.Scanner;

public class MaximumIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = maximumIndex(arr,n);
        System.out.println(ans);

//        int ans2 = maximumIndxSecond(arr,n);
        //System.out.println(ans2);
    }
    public static int maximumIndex(int arr[], int n){
        int max = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    int res = j-i;
                    max = Math.max(max,res);
                }
            }
        }
        return max;
    }
//    public static int maximumIndxSecond(int arr[], int n){
//        int maxDiff = -1;
//
//        // Create two arrays to store the minimum element from the left and the maximum element from the right
//        int[] leftMin = new int[n];
//        int[] rightMax = new int[n];
//
//        // Fill leftMin array
//        leftMin[0] = arr[0];
//        for (int i = 1; i < n; i++) {
//            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
//        }
//
//        // Fill rightMax array
//        rightMax[n - 1] = arr[n - 1];
//        for (int i = n - 2; i >= 0; i--) {
//            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
//        }
//
//        // Traverse both arrays to find the maximum index difference
//        int i = 0, j = 0;
//        while (i < n && j < n) {
//            if (leftMin[i] <= rightMax[j]) {
//                maxDiff = Math.max(maxDiff, j - i);
//                j++;
//            } else {
//                i++;
//            }
//        }
//
//        return maxDiff;
//    }


}
