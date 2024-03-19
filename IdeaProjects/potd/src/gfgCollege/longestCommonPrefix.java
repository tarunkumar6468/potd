package gfgCollege;

import java.util.Scanner;

public class longestCommonPrefix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i = 0; i<n; i++){
            s[i] = sc.next();
        }
       String m =  returnCommonPrefix(s);
        System.out.println(m);

    }
    public static String returnCommonPrefix(String[] arr){
        int n = arr.length;
        String result = arr[0];


        for(int i = 1; i < n; i++){

            while(arr[i].indexOf(result) != 0){
                result = result.substring(0, result.length()-1);

                // check for empty case. direct return if true..
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }

}
