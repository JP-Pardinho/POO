package edu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Xa, Xb, Xc, Ya, Yb, Yc;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ponto A (x,y): ");
        Xa = scan.nextDouble();
        Ya = scan.nextDouble();
        Ponto pontoA = new Ponto(Xa, Ya);
        System.out.print("Ponto B (x,y): ");
        Xb = scan.nextDouble();
        Yb = scan.nextDouble();
        Ponto pontoB = new Ponto(Xb, Yb);
        System.out.print("Ponto C (x,y): ");
        Xc = scan.nextDouble();
        Yc = scan.nextDouble();
        Ponto pontoC = new Ponto(Xc, Yc);

        Triangulo triangulo = new Triangulo(pontoA, pontoB, pontoC);

        double perimetro = triangulo.calcularPerimetro();

        System.out.println("Seu perimetro é: " + perimetro);
        System.out.println("\n");
    }
}