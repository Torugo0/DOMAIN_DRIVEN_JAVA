package br.com.fiap.Classes_Ex_23_02;

public class UseAir {
    public static void main(String[] args) {
        AirConditioning air = new AirConditioning();

        air.mode = "Cool";
        air.temperature = 18;
        air.show();

        air.lowerTemperature();
        air.show();

        air.changeMode("Dry");
        air.show();
    }
}
