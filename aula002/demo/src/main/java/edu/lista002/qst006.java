package edu.lista002;

import java.util.*;

public class qst006 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, k;

        System.out.print("Digite o tamanho do vetor: ");
        n = scan.nextInt();
        System.out.print("Digite o valor do escalar: ");
        k = scan.nextInt();

        int[] vetor = new int[n];

        for(int i = 0; i < n; i++){
            vetor[i] = i;
            System.out.print(vetor[i]+ " ");
        }
        
        System.out.println("");
        multiplica(vetor, n, k);
    }

    public static void multiplica(int vetor[], int n, int k){
        for(int i = 0; i < n; i ++){
            vetor[i] = vetor[i]*k;
            System.out.print(vetor[i]+ " ");
        }
    }
}
