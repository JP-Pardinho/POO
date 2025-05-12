package com.example.lista;

public class ex003_felicio {
    public static void main(String[] args) {
        int []vet = new int[20];
        int i;


        for(i=1; i<20; i++){
            vet[i] = i;
            if (ehPrimo(vet[i])){
                System.out.println(vet[i]+" ");
            }

        }
    }
    
    private static boolean ehPrimo(int num) {
        int i;
        if (num < 2){
            return false;
        } 
        
        for(i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
