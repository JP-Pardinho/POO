package lista007;

public class Circulo implements Forma2d{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio*raio);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + calcularArea());        
    }
}
