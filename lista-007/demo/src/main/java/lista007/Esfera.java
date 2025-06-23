package lista007;

public class Esfera implements Forma3d{
    private double raio;

    public Esfera(double raio){
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
        return 4 * Math.PI * (raio*raio);
    }

    @Override
    public double calcularVolume() {
        return (4 * Math.PI * (raio * raio * raio)) / 3;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Volume: " + calcularVolume());
    }
}
