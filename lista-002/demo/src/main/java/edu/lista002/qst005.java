package edu.lista002;

import java.util.*;

public class qst005 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite os valores do vetor");
        for(int i = 0; i < 10; i++){
            vetor[i] = scan.nextInt();
        }
        int resultado = PARES(vetor);
        System.out.println("A quantidade de pares é: " + resultado);
    }

    public static int PARES(int vetor[]){
        int cont = 0;
        for(int i =0; i < 10; i++){
            if(vetor[i] % 2 == 0){
                cont++;
            }
        }
        return cont;
    }
}


