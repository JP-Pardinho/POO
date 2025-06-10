package edu.lista006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, cpf, setor;
        int op = 0;
        
        ArrayList<Empregado_fixo> EmpregadosFixos = new ArrayList<>();
        ArrayList<Empregado_comissao> EmpregadosComissao = new ArrayList<>();
        
        do {
            System.out.println("Menu: ");
            System.out.println("1 - Cadastrar empregado com salario fixo");
            System.out.println("2 - Cadastrar empregado com salario + comissão");
            System.out.println("3 - Listar todos os empregados");
            System.out.println("4 - Calcular folha de pagamento total");
            System.out.println("5 - Calcular salario de um empregado(por CPF)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\nCadastrando empregado fixo:");
                    System.out.print("Nome: ");
                    nome = scan.nextLine();
                    System.out.print("CPF: ");
                    cpf = scan.nextLine();
                    System.out.print("Setor: ");
                    setor = scan.nextLine();
                    System.out.print("Salario fixo: R$");
                    double salarioFixo = scan.nextDouble();
                    scan.nextLine();
                    EmpregadosFixos.add(new Empregado_fixo(nome, cpf, setor, salarioFixo));
                    System.out.println("\nEmpregado fixo cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\nCadastrando empregado salario + comissao:");
                    System.out.print("Nome: ");
                    nome = scan.nextLine();
                    System.out.print("CPF: ");
                    cpf = scan.nextLine();
                    System.out.print("Setor: ");
                    setor = scan.nextLine();
                    System.out.print("Salario base: ");
                    double salarioBase = scan.nextDouble();
                    System.out.print("Total de vendas: ");
                    int totalVendas = scan.nextInt();
                    System.out.print("Percentual da comissão (valor inteiro): ");
                    double percentualComissao = scan.nextDouble();
                    EmpregadosComissao.add(new Empregado_comissao(nome, cpf, setor, salarioBase, totalVendas, percentualComissao));
                    System.out.println("\nEmpregado cadastrado com comissão com sucesso!\n");              
                    break;

                case 3:
                    if (EmpregadosFixos.isEmpty()) {
                        System.out.println("\nNão há empregados fixos cadastrados");
                    } else {
                        System.out.println("\nListando todos os empregados: ");
                        System.out.println("Empregados salario fixo: ");
                        for(int i=0; i < EmpregadosFixos.size(); i++){
                            System.out.println("Nome: " + EmpregadosFixos.get(i).getNome());
                            System.out.println("CPF: " + EmpregadosFixos.get(i).getCpf());
                            System.out.println("Setor: " + EmpregadosFixos.get(i).getSetor());
                        }
                    }

                    if(EmpregadosComissao.isEmpty()){
                        System.out.println("\nNão há empregados por comissão cadastrados");
                    } else {
                        System.out.println("\nEmpregados por comissão: ");
                        for(int i=0; i < EmpregadosComissao.size(); i++){
                            System.out.println("Nome: " + EmpregadosComissao.get(i).getNome());
                            System.out.println("CPF: " + EmpregadosComissao.get(i).getCpf());
                            System.out.println("Setor: " + EmpregadosComissao.get(i).getSetor());
                        }
                    }
                    System.out.println("\n");
                    break;

                case 4:
                    double valorFixo = 0;
                    double valorComissao = 0;
                    System.out.println("\nCalcular folha de pagamento total: ");
                    
                    for(int i=0; i < EmpregadosFixos.size(); i++){
                        valorFixo += EmpregadosFixos.get(i).getSalarioMensal();
                    }
                    
                    for(int i=0; i < EmpregadosComissao.size(); i++){
                        valorComissao += EmpregadosComissao.get(i).salarioTotal(
                            EmpregadosComissao.get(i).getSalarioBase(),
                            EmpregadosComissao.get(i).getTotalVendas(),
                            EmpregadosComissao.get(i).getPercentualComissao());
                    }

                    double folhaPagamento = valorFixo + valorComissao;  
                    System.out.printf("\nValor total da folha de pagamento: R$%.2f\n", folhaPagamento);
                    break;

                case 5:
                    System.out.println("\nCalculando Salario: ");
                    System.out.println("Digite o CPF (funcionario): ");
                    cpf = scan.nextLine();
                    Boolean encontrado = true;

                    for(int i=0; i < EmpregadosFixos.size(); i++){
                        if(EmpregadosFixos.get(i).getCpf().equals(cpf)){
                            System.out.println("Nome: " + EmpregadosFixos.get(i).getNome());
                            System.out.println("Salario: " + EmpregadosFixos.get(i).getSalarioMensal());
                        } else {
                            encontrado = false;
                        }
                    }

                    for(int i=0; i < EmpregadosComissao.size(); i++){
                        if(EmpregadosComissao.get(i).getCpf().equals(cpf)){
                            System.out.println("Nome: " + EmpregadosComissao.get(i).getNome());
                            System.out.println("Salario: " + EmpregadosComissao.get(i).salarioTotal(
                            EmpregadosComissao.get(i).getSalarioBase(),
                            EmpregadosComissao.get(i).getTotalVendas(),
                            EmpregadosComissao.get(i).getPercentualComissao()));
                        } else {
                            encontrado = false;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Funcionario não encontrado ");
                    }
                    System.out.println("\n");
                    break;

                case 0:
                    System.out.println("\nFinalizando o sistema...");
                    System.out.println("\n");
                    break;
            
                default:
                    System.out.println("\nOpção invalida!");
                    System.out.println("Digite uma opção entre (0 - 5)");
                    System.out.println("\n");
                    break;
            }
        } while (op != 0);

        scan.close();
    }
}