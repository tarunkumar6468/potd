package javaSheet;

import java.util.Scanner;

public class rotateKthPosition {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,k); // first method

        System.out.println();


        rotateBubble(arr,k);// second method
        
    }

    public static void rotate(int [] nums, int k){
        if(k>nums.length){
            k = k%nums.length;
        }
        int [] result = new int[nums.length];
        for(int i = 0; i<k;i++){
            result[i] = nums[nums.length-k+i];
        }
        int j = 0;
        for(int i = k; i<nums.length;i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result,0,nums,0,nums.length);
        for(int i = 0; i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }

    public static  void rotateBubble(int [] arr, int k) {


        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

}
