package edu.lista002;

import java.util.Scanner;

public class qst011 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
           
        System.out.print("Digite o número de funcionários: ");
        int numFuncionarios = scan.nextInt();
        
        if (numFuncionarios <= 0) {
            System.out.println("Número de funcionários inválido!");
            scan.close();
            return;
        }
        
        double[] salarios = new double[numFuncionarios];
        double soma = 0;
        
        for (int i = 0; i < numFuncionarios; i++) {
            System.out.printf("Digite o salário do funcionário %d: ", i + 1);
            salarios[i] = scan.nextDouble();
            soma += salarios[i];
        }
        
        double media = soma / numFuncionarios;
        
        int acimaDaMedia = 0;
        for (double salario : salarios) {
            if (salario > media) {
                acimaDaMedia++;
            }
        }
        
        System.out.printf("\nMédia salarial: R$ %.2f\n", media);
        System.out.printf("Funcionários com salário acima da média: %d\n", acimaDaMedia);
        
        scan.close();
    }    
}
