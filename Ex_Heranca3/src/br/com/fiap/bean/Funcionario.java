package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private float valorHora;

    public Funcionario(){}

    public Funcionario(String nome, LocalDate dataNascimento, float valorHora){
        this.nome = nome;
        setDataNascimento(dataNascimento);
        this.valorHora = valorHora;
    }

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

        try {
            if (dataNascimento.isAfter(minimo) && dataNascimento.isBefore(LocalDate.now())) {
                this.dataNascimento = dataNascimento;
            } else{
                throw new Exception("Data fora da faixa permitida (1900-01-01" + " - " + LocalDate.now() + ")");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float calculaSalario(){
        return ((valorHora *40)*4);
    }

    public int calculaIdade(){
        Period idade = Period.between(dataNascimento, LocalDate.now());
        return idade.getYears();
    }
}
