package edu.lista002;

import java.util.*;

public class qst0010 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numMes;

        System.out.print("Digite um mês para saber seu nome ");
        numMes = scan.nextInt();

        System.out.println(verificaMes(numMes));
    }

    public static String verificaMes(int mes){

        switch (mes) {
            case 1:
                return "O mês " + mes + "é Janeiro";
            
            case 2:
                return "O mês " + mes + " é Fevereiro";

            case 3:
                return "O mês " + mes + " é Março";

            case 4:
                return "O mês " + mes + " é Abril";

            case 5:
                return "O mês " + mes + " é Maio";

            case 6:
                return "O mês " + mes + " é Junho";

            case 7:
                return "O mês " + mes + " é Julho";

            case 8:
                return "O mês " + mes + " é Agosto";

            case 9:
                return "O mês " + mes + " é Setembro";

            case 10:
                return "O mês " + mes + " é Outubro";

            case 11:
                return "O mês " + mes + " é Novenbro";

            case 12:
                return "O mês " + mes + " é Dezembro";
            default:
                return "Mês inserido não existe!";
        }
    }
}
