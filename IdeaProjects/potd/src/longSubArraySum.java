import java.util.*;
public class longSubArraySum {
    public static int callLongSubArraySum(int n, int a[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int p_sum = 0;
        int ps_rem;
        int ans = 0;
        for(int i = 0; i<n; i++){
            p_sum+=a[i];
            ps_rem = p_sum%k;
            if(ps_rem==0){
                ans= Math.max(ans,i+1);
            }
            if(ps_rem<0)ps_rem+=k;
            if(map.containsKey(ps_rem))ans=Math.max(ans,i-map.get(ps_rem));
            else map.put(ps_rem,i);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt(); // N = 6, K = 3 arr[] = {2, 7, 6, 1, 4, 5}
           // output = 4
            // explanation 7+6+1+4 = 18\3 so length of array is 4
        }
        int k = sc.nextInt();
       int ans =  callLongSubArraySum(n,arr,k);
       System.out.println(ans);
    }
}
