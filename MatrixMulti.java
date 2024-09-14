package com.mycompany.arrayproblem;
public class MatrixMulti {
    
    public static void display(int[][] matrix) {
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] array1= { {9, 2, 6}, {3, 2, 4} };
        int[][] array2 = { {2, 3}, {49, 8}, {0, 42} };

        if (c1 != r2) {
            System.out.println("Invalid Matrix");
            return;
        }

        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println("After Multiplication: ");
        display(product);
    }

   
}
