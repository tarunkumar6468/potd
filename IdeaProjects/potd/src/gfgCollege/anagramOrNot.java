package gfgCollege;

import java.util.Arrays;

public class anagramOrNot {
    public static void main(String[] args){
        char [] s = {'a','n','a','g','r','a','m'};
        char [] t = {'n','a','g','a','r','a','m'};// anagram means number of characters are same in both array
         check(s,t); // time com is o(nlogN)
    }
    public static void check(char []s, char[] t){
        int len1 = s.length;
        int len2 = t.length;

        if(len1!=len2){
            System.out.println("not anagram");
        }
        Arrays.sort(s);
        Arrays.sort(t);
        for(int i = 0; i<len1;i++){
            if(s[i] != t[i]){
                System.out.println("not  anagram");
                break;
            }
            else{
                System.out.println("anagram");
                break;
            }
        }
    }
}
