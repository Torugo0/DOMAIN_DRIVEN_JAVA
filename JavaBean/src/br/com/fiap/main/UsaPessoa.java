package br.com.fiap.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
import br.com.fiap.bean.Pessoa; // Use o * para importar tudo do pacote

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa p1;
        String aux, nome, dataNasc;
        LocalDate minhaData;

        try {
            nome = JOptionPane.showInputDialog("Digite seu nome");
            aux = JOptionPane.showInputDialog("Digite sua data de nascimento");
            dataNasc = aux.substring(6, 10); // 2024
            dataNasc += "-" + aux.substring(3, 5); // 2024-11
            dataNasc += "-" + aux.substring(0, 2); // 2024-11-04

            minhaData = LocalDate.parse(dataNasc);

            p1 = new Pessoa(nome, minhaData);

            JOptionPane.showMessageDialog(null, "Data no formato EUA \n" + "Data de Nascimento: " + p1.getDataNascimento());

            DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String dataFormatada = p1.getDataNascimento().format(dft);

            JOptionPane.showMessageDialog(null, "Dados pessoais\n" + "Nome: " + p1.getNome() + "\nData de Nascimento: " + dataFormatada + "\nIdade: " + p1.calculaIdade() + " Anos");


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
