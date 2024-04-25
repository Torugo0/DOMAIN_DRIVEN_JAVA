package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    public ContaPoupanca(){}

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento){
        super.setCliente(cliente);
        super.setNumConta(numConta);
        super.setSaldo(saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }
    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    public float novoSaldo(float rendimento){
        float saldo = super.getSaldo() * (1 + rendimento / 100);
        return saldo;
    }
}
