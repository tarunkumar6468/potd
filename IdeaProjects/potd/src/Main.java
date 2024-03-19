import java.util.Scanner;
import java.util.*;

public class Main {
    public  static ArrayList<Integer>search(String pat, String txt) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            int k = 0;
            while (k < pat.length() && pat.charAt(k) == txt.charAt(i + k)) {
                k++;
            }
            if (k == pat.length()) {
                list.add(i + 1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();//geeksforgeeks
        String str2 = sc.nextLine();//geek
        System.out.println(search(str1,str2));

    }
}