package edu.lista002;

import java.util.*;
import java.lang.Math;

public class qst008 {
    public static void main(String[] args) {  
        int op;
        double soma = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Escolha uma opção");
            System.out.println("1 - s1");
            System.out.println("2 - s2");
            System.out.println("3 - s3");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção => ");
            op = scan.nextInt();
    
            switch (op) {
                case 1:
                    soma = soma1();
                    System.out.println("Valor da soma 1 = " + soma);
                    break;
                
                case 2:
                    soma = soma2();
                    System.out.println("Valor da soma 2 = " + soma);
                    break;
                
                case 3:
                    soma = soma3();
                    System.out.println("Valor da soma 3 = " + soma);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opção invalida!!");
                    break;
            }

        }while(op != 4);
    } 

    public static double soma1(){
        double soma = 0.0;
        int numerador = 1;
        int denominador = 1;

        while(numerador <= 99){
            soma += (double) numerador/denominador;
            numerador += 2;
            denominador++;
        }
        return soma;
    }

    public static double soma2(){
        double soma = 0;
        int potencia = 1;
        int denominador = 50;
        while (denominador >= 1){
            soma += Math.pow(2, potencia)/denominador;
            potencia++;
            denominador--;      
        }
        return soma;
    }

    public static double soma3(){
        double soma = 0.0;
        double termo = 0.0;
        for(int i=1; i<=10; i++){
            termo = (double) i/(i*i);
            if(i % 2 == 0) {
                soma -= termo;
            } else{
                soma += termo;
            } 
        }   
        return soma;
    }
}
