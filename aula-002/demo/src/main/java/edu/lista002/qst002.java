package edu.lista002;

import java.util.*;

public class qst002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[2];

        System.out.print("Digite o valor de a: ");
        vetor[0] = scan.nextInt();
        System.out.print("Digite o valor de b: ");
        vetor[1] = scan.nextInt();

        TROCA(vetor);

        System.out.println("Apos a troca temos a = " + vetor[0] + " b = " + vetor[1]);
        
    }

    public static void TROCA(int vetor[]){
        int aux;
        aux = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = aux;
    }
     
}
