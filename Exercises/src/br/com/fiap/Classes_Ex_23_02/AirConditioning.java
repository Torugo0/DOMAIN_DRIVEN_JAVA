package br.com.fiap.Classes_Ex_23_02;

public class AirConditioning {
    public int temperature;
    public String mode;

    public void turnUpTemperature(){
        temperature ++;
    }
    public void lowerTemperature(){
        temperature --;
    }
    public void changeMode(String m){
        mode = m;
    }
    public void show(){
        System.out.println("Temperature: " + temperature);
        System.out.println("Mode: " + mode);
    }

}
