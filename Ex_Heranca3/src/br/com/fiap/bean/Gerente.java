package br.com.fiap.bean;

import java.time.LocalDate;

public class Gerente extends Funcionario{
    private float bonus;

    public Gerente(){}

    public Gerente(String nome, LocalDate dataNascimento, float valorHora, float bonus){
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setValorHora(valorHora);
        this.bonus = bonus;
    }
    
    public float calculaSalario() {
        return ((super.getValorHora() * 40) * 4)* (1 + bonus / 100);
    }
}
