package br.com.fiap.bean;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String message){
        super(message);
    }
}
