package edu.lista002;

import java.util.Scanner;

public class qst003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
        num = scan.nextInt();
        SINAL(num);
    }

    public static void SINAL(int num){
        if(num > 0){
            System.out.println("POSITIVO!");
        } 
        else if (num < 0) {
            System.out.println("NEGATIVO!");
        }
        else{
            System.out.println("Zero");
        }
    }
}
