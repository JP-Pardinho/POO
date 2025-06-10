package edu;

public class Triangulo {
    private Ponto pontoA;
    private Ponto pontoB;
    private Ponto pontoC;

    public Triangulo(Ponto a, Ponto b, Ponto c) {
        this.pontoA = a;
        this.pontoB = b;
        this.pontoC = c;
    }

    public Ponto getPontoA(){
        return pontoA;
    }

    public Ponto gePontoB(){
        return pontoB;
    }

    public Ponto getPontoC(){
        return pontoC;
    }

    public double calcularPerimetro(){
        double distanciaAB = pontoA.calcularDistancia(pontoB);
        double distanciaBC = pontoB.calcularDistancia(pontoC);
        double distanciaAC = pontoA.calcularDistancia(pontoC);

        return distanciaAB + distanciaBC + distanciaAC;
    }
}
