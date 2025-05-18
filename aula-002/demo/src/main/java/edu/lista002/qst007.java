package edu.lista002;

import java.util.Scanner;

public class qst007 {
    public static void main(String[] args) {
    int[] vet1 = new int[5];
    int[] vet2 = new int[5];
    int[] resultado = new int[5];
    Scanner scan = new Scanner(System.in);
        
    System.out.println("Digite os elementos do vetor 1:");
    for(int i = 0; i < 5; i++){
        vet1[i] = scan.nextInt();
    }

    System.out.println("Digite os elementos do vetor 2:");
    for(int i = 0; i < 5; i++){
        vet2[i] = scan.nextInt();
    }

    resultado = soma(vet1, vet2);

    System.out.println("O resoltado é:");
    for(int i = 0; i < 5; i++){
        System.out.print(resultado[i] + " ");
    }
    }

    public static int[] soma(int vetor1[], int vetor2[]){
        int[] vet3 = new int[5];

        for(int i = 0; i < 5; i++){
            vet3[i] = vetor1[i] + vetor2[i];
        }
        return vet3;
    }
}