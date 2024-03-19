import java.util.HashMap;

public class firstElementToOccurKtimes {
    public static void main(String[] args){
        int n = 7;
        int k = 2;
        int arr[] = {1, 7, 4, 3, 4, 8, 7};
         int ans = firstKthElement(n,k,arr);
        System.out.println(ans);

    }
    public static  int firstKthElement(int n, int k, int arr[]){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i<n-1;i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);


            if (freq.get(arr[i]) >= k) return arr[i];
        }

        return -1;

    }
}
