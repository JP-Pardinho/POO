package com.example.lista;


public class ex004 {
    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        int i, j;

        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                if (i == j) {
                    mat[i][j] = 1;
                }
                else {
                    mat[i][j] = 0;
                }
            }
        }

        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }
}
