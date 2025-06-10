package ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Dados aluno: ");
        System.out.print("Matricula: ");
        String matricula = scan.nextLine();
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite as notas (p1, p2 e trabalho): ");
        double notaP1 = scan.nextDouble();
        double notaP2 = scan.nextDouble();
        double notaTrabalho = scan.nextDouble();

        Aluno aluno = new Aluno(matricula, nome, notaP1, notaP2, notaTrabalho);
        double valorFinal = aluno.verificaFinal();

        if(valorFinal == 0){
            System.out.println("O aluno não está de final\n");
        } else {
            System.out.println("O aluno precisa tirar " + valorFinal + " na final\n");
        }

        scan.close();
    }
}