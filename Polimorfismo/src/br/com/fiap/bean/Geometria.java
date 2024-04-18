package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Geometria {
    //atributos 
    private float lado;
    private float altura;
    private double raio;

    //construtor vazio
    public Geometria(){}

    //metodos getters & setters

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    //metodos da classe
    public void calculaArea(float lado){
        setLado(lado);
        float area = getLado() * getLado(); //this.lado * this.lado;
        JOptionPane.showMessageDialog(null, "Área do quadrado: " + area);
    }

    public void calculaArea(float lado, float altura){ // mesmo nome, mas com assinaturas diferentes (parametros)
        setLado(lado);
        setAltura(altura);
        float area = getLado() * getAltura(); //this.lado * this.lado;
        JOptionPane.showMessageDialog(null, "Área do retângulo: " + area);
    }

    public void calculaArea(double raio){ // mesmo nome, mas com assinaturas diferentes (parametros)
        setRaio(raio);
        final double PI = 3.1416; // constante
        double area = Math.pow(raio, 2) * PI; //this.lado * this.lado;
        JOptionPane.showMessageDialog(null, "Área do circulo: " + area);
    }

}
