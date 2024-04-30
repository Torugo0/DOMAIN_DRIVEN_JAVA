package br.com.fiap.main;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Garcom;
import br.com.fiap.bean.Gerente;

public class UsaConta {
    public static void main(String[] args) {
        String nome;
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
                        dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento:"));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho: "));
                        Funcionario func = new Funcionario(nome, dataNascimento, valorHora);

                        float salario = func.calculaSalario();
                        int idade = func.calculaIdade();

                        JOptionPane.showMessageDialog(null, "Nome: " + func.getNome() +"\nData de nascimento: "+ func.getDataNascimento() + "\nIdade: "+ idade + "\nSalario: " + salario );
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Nome do garçom: ");
                        dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento:"));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho: "));
                        gorjeta = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da gorjeta recebida: "));
                        
                        Garcom garc = new Garcom(nome, dataNascimento, valorHora, gorjeta);

                        float salarioGarcom = garc.calculaSalario();
                        int idadeGarcom = garc.calculaIdade();

                        JOptionPane.showMessageDialog(null, "Nome: " + garc.getNome() +"\nData de nascimento: "+ garc.getDataNascimento() + "\nIdade: "+ idadeGarcom + "\nSalario: " + salarioGarcom );
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Nome do gerente: ");
                        dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento:"));
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
