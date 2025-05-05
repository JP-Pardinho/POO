package com.example.lista;

import java.util.*;

public class ex001_jp {
    public static void main(String[] args) {
        int n, i=0, j=0, k=1;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite um numero N: ");
            n = scan.nextInt();
        } while (n < 0);

        for(i=0; i<n; i++){
            k = k + j;
            System.out.println(j); 
            j = k - j;
        }
    }
}
