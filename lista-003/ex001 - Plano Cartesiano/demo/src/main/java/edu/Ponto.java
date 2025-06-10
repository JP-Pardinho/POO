package edu;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double deltaX = outroPonto.getX() - this.x;
        double deltaY = outroPonto.getY() - this.y;
        double distancia = Math.sqrt(deltaX*deltaX + deltaY*deltaY); 
        
        return distancia;
    }
    
}
