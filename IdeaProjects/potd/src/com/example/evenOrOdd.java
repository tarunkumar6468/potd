package com.example;

public class evenOrOdd {
    public static  void  main(String[] args){
        int x = 9347;
        String s = String.valueOf(x);  //convert into string
        String s1 = s.substring(s.length()-1);  // find last number
        int s2  = Integer.parseInt(s1);  // convert last number into integer
        int  s3 = s2;//copy number
        if(s3==0){
            System.out.println("even");

        }
        else if (s3==1)System.out.println("odd");

        else {
            for (int i = 0; i < s3; i++) {

                s3 = s3 - 2;
                if (s3 == 0) {
                    System.out.println("even");
                    break;
                } else if (s3 == 1) {
                    System.out.println("odd");
                    break;
                }
            }
        }

    }
}
