package com.example;

public class rightMostBit {
    public static void main(String[] args) {
        int n = 8;
       System.out.println( getBit(n,3));
           }
    public static boolean  getBit(int n, int i){
        return ((n&(1<<i))!=0);
    }

}
