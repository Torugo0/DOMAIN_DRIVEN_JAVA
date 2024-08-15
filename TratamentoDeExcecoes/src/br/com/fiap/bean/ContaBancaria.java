package br.com.fiap.bean;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantia) throws SaldoInsuficienteException{
        if(quantia > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");
        }
        saldo -= quantia;
    }
}
