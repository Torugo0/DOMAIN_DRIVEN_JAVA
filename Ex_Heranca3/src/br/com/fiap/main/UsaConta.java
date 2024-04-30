package br.com.fiap.main;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Garcom;
import br.com.fiap.bean.Gerente;

public class UsaConta {
    public static void main(String[] args) {
        String nome, formatoUSA;
        LocalDate dataNascimento;
        float valorHora, gorjeta, bonus;        
        int opcao;
        String aux,escolha = "sim";

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                aux = JOptionPane.showInputDialog("Qual funcionario deseja calcular o salario:" + "\n1- Funcionario" + "\n2- Garçom" + "\n3- Gerente");
                opcao = Integer.parseInt(aux);

                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Nome do funcionario: ");
                        aux = JOptionPane.showInputDialog("Digite sua data de nascimento");
                        formatoUSA = aux.substring(6, 10); // 2024
                        formatoUSA += "-" + aux.substring(3, 5); // 2024-11
                        formatoUSA += "-" + aux.substring(0, 2); // 2024-11-04
                        dataNascimento = LocalDate.parse(formatoUSA);
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho: "));
                        Funcionario func = new Funcionario(nome, dataNascimento, valorHora);

                        float salario = func.calculaSalario();
                        int idade = func.calculaIdade();

                        JOptionPane.showMessageDialog(null, "Nome: " + func.getNome() +"\nData de nascimento: "+ func.getDataNascimento() + "\nIdade: "+ idade + "\nSalario: " + salario );
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Nome do garçom: ");
                        aux = JOptionPane.showInputDialog("Digite sua data de nascimento");
                        formatoUSA = aux.substring(6, 10); // 2024
                        formatoUSA += "-" + aux.substring(3, 5); // 2024-11
                        formatoUSA += "-" + aux.substring(0, 2); // 2024-11-04
                        dataNascimento = LocalDate.parse(formatoUSA);
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho: "));
                        gorjeta = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da gorjeta recebida: "));
                        
                        Garcom garc = new Garcom(nome, dataNascimento, valorHora, gorjeta);

                        float salarioGarcom = garc.calculaSalario();
                        int idadeGarcom = garc.calculaIdade();

                        JOptionPane.showMessageDialog(null, "Nome: " + garc.getNome() +"\nData de nascimento: "+ garc.getDataNascimento() + "\nIdade: "+ idadeGarcom + "\nSalario: " + salarioGarcom );
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Nome do gerente: ");
                        aux = JOptionPane.showInputDialog("Digite sua data de nascimento");
                        formatoUSA = aux.substring(6, 10); // 2024
                        formatoUSA += "-" + aux.substring(3, 5); // 2024-11
                        formatoUSA += "-" + aux.substring(0, 2); // 2024-11-04
                        dataNascimento = LocalDate.parse(formatoUSA);
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho: "));
                        bonus = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do bonus: "));
                        
                        Gerente geren = new Gerente(nome, dataNascimento, valorHora, bonus);

                        float salarioGerente = geren.calculaSalario();
                        int idadeGerente = geren.calculaIdade();

                        JOptionPane.showMessageDialog(null, "Nome: " + geren.getNome() +"\nData de nascimento: "+ geren.getDataNascimento() + "\nIdade: "+ idadeGerente + "\nSalario: " + salarioGerente );
                        break;
                
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar (sim/não):");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do programa. Volte sempre!");
    }
}
