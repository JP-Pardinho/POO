package com.example.lista;

import java.util.*;

public class ex001 {
    public static void main(String[] args) {
        int n, i, atual = 1, anterior = 0, soma = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero N: ");
        n = scan.nextInt();
        
        System.out.println(anterior);
        System.out.println(atual);
    
        for(i=2; i<n; i++){
            soma = anterior + atual;
            System.out.println(soma);
            anterior = atual;
            atual = soma;
        }
    }
}
