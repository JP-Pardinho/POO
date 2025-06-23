package lista007;

public class Quadrado implements Forma2d{
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getQuadrado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + calcularArea());
    }
} 
