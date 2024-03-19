package gfgCollege;

import java.util.Scanner;
import java.util.Stack;

public class stock_Span_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){

        }
    }

    public static int[] calculateSpan(int price[], int n)
    {
        int pre[] = new int[n];
        int ans[] = new int [n];
        Stack<Integer>s=new Stack();
        for(int i = 0; i<n; i++){
            pre[i] = -1;
            while(s.isEmpty()==false && price[s.peek()]<=price[i]){
                s.pop();
            }
            if(s.isEmpty() == false){
                pre[i] = s.peek();
            }
            s.push(i);
        }
        for(int i = 0; i<n; i++){
            ans[i] = i-pre[i];
        }
        return ans;
    }

}
