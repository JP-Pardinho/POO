package ex002;

public class Aluno {
    private String matricula;
    private String nome; 
    private double notaP1;
    private double notaP2;
    private double notaTrabalho;

    public Aluno(String matricula, String nome, double notaP1, double notaP2, double notaTrabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia(){
        return notaP1 + notaP2 + notaTrabalho;
    }

    public double verificaFinal() {
        double media = calcularMedia();
        if (media > 4){
            return 0;
        } else {
            return 7 - media;
        }
    }   

}
