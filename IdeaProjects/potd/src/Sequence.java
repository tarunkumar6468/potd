import java.util.Scanner;

public class Sequence {
    public static int Sequence_fun(int m , int n){
        if(m<n)return 0;
        if(n==0)return 1;
        return Sequence_fun((m-1),n)+Sequence_fun((m/2),(n-1));
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = Sequence_fun(m,n);
        System.out.println(ans);
    }
}
