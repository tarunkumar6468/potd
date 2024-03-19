package gfgCollege;

import java.util.Scanner;

public class Create2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] storeArray = create2dArray(row,col);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col;j++){

                System.out.print(" "+storeArray[i][j]);
            }
        }

    }
    public static int[][] create2dArray(int row, int col){
        int arr[][] = new int[row][col];
        for(int i = 0; i<row; i++){
            arr[i] = new int[col];
        }
        int val = 1;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr[i][j] = val;
                val++;
            }
        }
        return arr;
    }
}
