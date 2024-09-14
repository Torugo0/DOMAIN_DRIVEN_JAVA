package br.com.fiap.model.dto;

public class Carro {
    // O DTO tem apenas campos (atributos) para armazenar dados, e métodos getters e setters para acessar ou alterar esses dados.
    
    private String placa;
    private String cor;
    private String descricao;

    public Carro(){}

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
