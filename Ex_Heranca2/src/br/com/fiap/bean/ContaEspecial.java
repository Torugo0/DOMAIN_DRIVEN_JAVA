package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(){}

    public ContaEspecial(String cliente, int numConta, float Saldo, float limite){
        super.setCliente(cliente);
        super.setNumConta(numConta);
        super.setSaldo(Saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float sacar(float valor){
        float saldo = super.getSaldo();

        if (valor <= (super.getSaldo() + limite)){
            saldo -= valor;
        }else{
            JOptionPane.showMessageDialog(null, "Valor superior ao limite atual");
        }
        super.setSaldo(saldo);
        return super.getSaldo();      
    }


}
