package lista007;

public class Cilindro implements Forma3d{
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio(){
        return raio;
    }

    public double getAltura(){
        return altura;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio*raio) * altura;
    }

    @Override
    public double calcularVolume() {
        return calcularArea()/altura;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Raio: " + raio);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Volume: " + calcularVolume());
    }
}

