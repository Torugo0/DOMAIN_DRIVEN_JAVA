package br.com.fiap.bean;

public class Retangulo extends Quadrado { // para declarar a classe retagulo como filho, usar a palavra extends
    private float altura;

    public Retangulo(){}

    public Retangulo(float lado, float altura){
        super.setLado(lado);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculaArea(){
        float area = super.getLado() * altura;
        return area;
    }
}
