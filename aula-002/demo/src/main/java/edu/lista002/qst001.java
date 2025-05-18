package edu.lista002;
import java.util.*;

public class qst001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num, retorno;        
        System.out.print("Digite um numero: ");
        num = scan.nextDouble();
        retorno = CUBO(num);
        System.out.println("O numero au cubo é: " + retorno);
    }
        
    public static double CUBO(double num){
        num = num*num*num;
        return num;
    }
}
