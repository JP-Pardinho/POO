package com.example.lista;

public class ex003_jp {
    public static void main(String[] args) {
        int []vet = new int[21];
        int i, j, qnt_div;


        for(i=1; i<21; i++){
            vet[i] = i;
            qnt_div = 0;

            for(j=1; j<=i; j++){
                if(i % j == 0){
                    qnt_div = qnt_div + 1; 
                }
            } 
        
            if (qnt_div == 2){
                System.out.println(vet[i]);
            }
        }
    }
    
}
