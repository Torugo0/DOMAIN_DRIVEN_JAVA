package br.com.fiap.bean;

import java.time.LocalDate;

public class Garcom extends Funcionario{
    private float gorjeta;

    public Garcom(){}

    public Garcom(String nome, LocalDate dataNascimento, float valorHora, float gorjeta){
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setValorHora(valorHora);
        this.gorjeta = gorjeta;
    }
    
    public float calculaSalario() {
        return ((super.getValorHora() * 40) * 4 + gorjeta);
    }
}
