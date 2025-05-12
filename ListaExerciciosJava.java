import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class ListaExerciciosJava {


    // Exercício 1: Série de Fibonacci
    public static void exercicio1(String[] args) {

        int n, i=0, j=0, k=1;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite um numero N: ");
            n = scan.nextInt();
        } while (n < 0);

        for(i=0; i<n; i++){
            k = k + j;
            System.out.println(j); 
            j = k - j;
        }
    }


    //Exercício 2: Tipos de triangulo
    public static void exercicio2(String[] args) {
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

    // Exercício 3: Contar numeros primos
    public static void exercicio3(String[] args) {
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

    // Exercício 4: Matriz identidade 10x10
    public static void exercicio4(String[] args) {
        int[][] mat = new int[10][10];
        int i, j;

        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                if (i == j) {
                    mat[i][j] = 1;
                }
                else {
                    mat[i][j] = 0;
                }
            }
        }

        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }


    // Exercício 5: Produto matricial com entrada do usuário
    public static void exercicio5() {
        Scanner scanner = new Scanner(System.in);
        int dimensao = 4;
        int[][] matrizA = new int[dimensao][dimensao];
        int[][] matrizB = new int[dimensao][dimensao];
        int[][] resultado = new int[dimensao][dimensao];
        
        System.out.println("Preencha a Matriz A (4x4):");
        preencherMatriz(matrizA, scanner);
        
        System.out.println("\nPreencha a Matriz B (4x4):");
        preencherMatriz(matrizB, scanner);
        
        for (int i = 0; i < dimensao; i++) {
            for (int j = 0; j < dimensao; j++) {
                for (int k = 0; k < dimensao; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        
        System.out.println("\nMatriz A:");
        exibirMatriz(matrizA);
        
        System.out.println("\nMatriz B:");
        exibirMatriz(matrizB);
        
        System.out.println("\nResultado (A x B):");
        exibirMatriz(resultado);
        
        scanner.close();
    }

    // Exercício 6: Ordenação de vetor com algoritmo bolha
    public static void exercicio6() {
        int[] vetor = new int[10];
        Random random = new Random();
        
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i] + " ");
        }
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nVetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    // Exercício 7: Situação de alunos baseada em notas
    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nAluno " + i + ":");
            
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();
            
            double media = (nota1 + nota2 + nota3) / 3;
            
            System.out.printf("Média: %.2f - Situação: ", media);
            if (media > 7) {
                System.out.println("Aprovado");
            } else if (media < 4) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Prova Final");
            }
        }
        
        scanner.close();
    }

    // Exercício 8: Cálculo de saldo bancário
    public static void exercicio8() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        int tipo;
        do {
            System.out.print("\nTipo (0-débito, 1-crédito, 2-sair): ");
            tipo = scanner.nextInt();
            
            if (tipo == 0 || tipo == 1) {
                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                
                saldo = (tipo == 0) ? saldo - valor : saldo + valor;
                System.out.printf("Saldo atual: %.2f\n", saldo);
            }
        } while (tipo != 2);
        
        System.out.printf("\nSaldo final: %.2f\n", saldo);
        scanner.close();
    }

    // Exercício 9: Cálculo de conta de energia
    public static void exercicio9() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor do salário mínimo: ");
        double salario = scanner.nextDouble();
        
        System.out.print("Quilowatts consumidos: ");
        double kw = scanner.nextDouble();
        
        double valorKw = (salario / 8) / 100;
        double valorTotal = valorKw * kw;
        double valorDesconto = valorTotal * 0.85;
        
        System.out.printf("\nValor por quilowatt: R$ %.2f\n", valorKw);
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);
        System.out.printf("Valor com desconto: R$ %.2f\n", valorDesconto);
        
        scanner.close();
    }

    // Exercício 10: Calculadora básica
    public static void exercicio10() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        
        double resultado = 0;
        boolean valido = true;
        
        switch (op) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': 
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    valido = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                valido = false;
        }
        
        if (valido) {
            System.out.printf("Resultado: %.2f %c %.2f = %.2f\n", num1, op, num2, resultado);
        }
        
        scanner.close();
    }

    // Exercício 11: Número perfeito
    public static void exercicio11() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        if (ehPerfeito(num)) {
            System.out.println(num + " é perfeito.");
        } else {
            System.out.println(num + " não é perfeito.");
        }
        
        scanner.close();
    }
    
    public static boolean ehPerfeito(int num) {
        if (num <= 1) return false;
        
        int soma = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                soma += i;
                if (i != num / i) soma += num / i;
            }
        }
        return soma == num;
    }

    // Exercício 12: Número triangular
    public static void exercicio12() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        if (ehTriangular(num)) {
            System.out.println(num + " é triangular.");
        } else {
            System.out.println(num + " não é triangular.");
        }
        
        scanner.close();
    }
    
    public static boolean ehTriangular(int num) {
        for (int i = 0; i <= Math.cbrt(num) + 1; i++) {
            if (i * (i + 1) * (i + 2) == num) return true;
        }
        return false;
    }

    // Exercício 13: Quadrados de uma sequência
    public static void exercicio13() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite números (0 para terminar):");
        int num;
        do {
            System.out.print("Número: ");
            num = scanner.nextInt();
            if (num != 0) {
                System.out.println("Quadrado: " + (num * num));
            }
        } while (num != 0);
        
        scanner.close();
    }

    // Exercício 14: Estatísticas de notas
    public static void exercicio14() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantidade de alunos: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        
        double[] notas = new double[n];
        double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            
            soma += notas[i];
            maior = Math.max(maior, notas[i]);
            menor = Math.min(menor, notas[i]);
        }
        
        System.out.println("\nEstatísticas:");
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf("Média: %.2f\n", (soma / n));
        
        scanner.close();
    }

    // Métodos auxiliares
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
    
    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
}