package com.example;

public class evenOrOddSecondMethod {
    public static void main(String[] args){
        int n = 21;
        evenOrOdd(n);
        usingBit(n);
        thirdMethod(n);
    }
    static void evenOrOdd(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
    static void usingBit(int n){
        if((n&1)==0){
            System.out.println("even using bit");
        }
        else{
            System.out.println("odd using bit");
        }
    }
    static void thirdMethod(int n){
        int copy = n;
        for(int i = 0; i<n;i++){
            copy -=2;
            if(copy==0){
                System.out.println("even third method");
                break;
            }
            else{
                System.out.println("odd using third method");
                break;
            }
        }
    }
    static void fourthMethod(int n)
    {
        String s = String.valueOf(n);
        String s1 = s.substring(0,s.length()-1);
        int s2 = Integer.parseInt(s1);

    }

}
