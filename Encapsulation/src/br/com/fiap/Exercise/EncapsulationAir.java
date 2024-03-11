package br.com.fiap.Exercise;

import javax.swing.JOptionPane;

public class EncapsulationAir {
    private int temperature = 17;
    private String mode = "COOL";

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        try {
            if (temperature >= 15 && temperature <= 26 ){
                this.temperature = temperature;
            }else{
                JOptionPane.showMessageDialog(null, "Temperature outside the permitted range (15 to 26)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        try {
            if(mode == "FAN" || mode == "WARM" || mode == "COOL"){
                this.mode = mode;
            }else{
                JOptionPane.showMessageDialog(null, "The mode isn't permitted (Fan, Warm, Cool)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Methods
    public void TurnUpTemperature(){
        if (temperature < 26){
            temperature ++ ;
        }
    }
    public void LowerTemperature(){
        if (temperature > 15){
            temperature --;
        }
    }

    public void ChangeMode(String ch){
        mode = ch;
    }

    public void Show(){
        JOptionPane.showMessageDialog(null, "Mode: " + getMode() + "\nTemperature: " + getTemperature());
    }
}
