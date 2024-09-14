package com.mycompany.arrayproblem;
public class Transpose {
    public static void main(String[] args)
    {
        int[][] arr = { { 1, 2, 3 }, { 4, 5 ,6},{ 7, 8 ,9} };
        System.out.println("Before Transpose:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("arr[" + i + "][" + j + "] = "
                                + arr[i][j]);
            }
        }
        
        int[][] transpose = new int[3][3];
        for(int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("After Transpose:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("transpose[" + i + "][" + j + "] = "
                                + transpose[i][j]);
            }
        }
    }   
}
