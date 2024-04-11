package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.ExecutionException;

import javax.swing.JOptionPane;

public class Pessoa {
    //Evitar ter regra de noegocios no package bean

    // Atributos
    private String nome;
    private LocalDate dataNascimento;

    //Construtor vazio
    public Pessoa(){

    }

    // Construtor com passagem de parametro
    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        setDataNascimento(dataNascimento);
    }

    // Metodos getters & setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        LocalDate minimo = LocalDate.parse("1899-12-31");
        LocalDate maximo = LocalDate.now();

        try {
            if (dataNascimento.isAfter(minimo) && dataNascimento.isBefore(maximo)) {
                this.dataNascimento = dataNascimento;
            } else{
                throw new Exception("Data fora da faixa permitida (1900-01-01" + " - " + maximo + ")");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0); // Encerra o programa após o erro
        }
    }
    
    public int calculaIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears();
    }
}
