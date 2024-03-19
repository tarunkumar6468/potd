package com.example;

import java.awt.desktop.SystemSleepEvent;

public class findSquareUsingBit {
    public static void main(String[] args){
        int n =4;
        if((n&1)==0){
            int ans = ((n>>1)<<2)+((n>>1)<<2);
            System.out.println(ans);
        }
        else{
            int ans = ((n>>1)<<2)+((n>>1)<<2)+1;
            System.out.println(ans);
        }




    }
}
