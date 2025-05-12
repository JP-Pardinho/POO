package com.example.lista;

import java.util.*;

public class ex002 {
    public static void main(String[] args) {
        int a, b, c, op;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Tipos de triangulo");
            System.out.println("1 - Descubra o tipo de triangulo");
            System.out.println("2 - Sair");
            System.out.print("\nOpção => ");
            op = scan.nextInt();
    
            if(op == 1){
                System.out.println("Digite o primeiro lado do triangulo: ");
                a = scan.nextInt();
                System.out.println("Digite o segundo lado do triangulo: ");
                b = scan.nextInt();
                System.out.println("Digite o terceiro lado do triangulo: ");        
                c = scan.nextInt();
                
                if(a == b && b == c){
                    System.out.println("Triangulo equilatero");
                } else if(a == b && a == c || b == a && b == c || c == a && c == b){
                    System.out.println("Triangulo isosceles");
                } else if(a != b && b != c){
                    System.out.println("Triangulo escaleno");
                }

            } else if(op == 2){
                break;
            } else{
                System.out.println("Opção errada!");
            }
        } while(op != 2);
        
    }
}
