package br.com.fiap.Exercise;

import javax.swing.JOptionPane;

public class UseAirEnc {
    public static void main(String[] args) {
        EncapsulationAir air = new EncapsulationAir();

        String[] options = {"Change Mode", "Set a temperature","Turn Up Temperature", "Lower Temperature"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Air Conditioning", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        try {
            if (choice == 0){
                String[] optionsMode = {"FAN", "WARM", "COOL"};
                int choiceAir = JOptionPane.showOptionDialog(null, "Choose a mode: ", "Air mode", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsMode, optionsMode[0]);

                if(choiceAir == 0){
                    air.ChangeMode(optionsMode[0]);
                    air.Show();
                }else if(choiceAir == 1){
                    air.ChangeMode(optionsMode[1]);
                    air.Show();
                }else if(choiceAir == 2){
                    air.ChangeMode(optionsMode[2]);
                    air.Show();
                }else{
                    JOptionPane.showMessageDialog(null, "The user closed the window without making a selection");
                }
            }else if(choice == 1){
                int temperature = Integer.parseInt(JOptionPane.showInputDialog("Set a temperature to the air"));
                air.setTemperature(temperature);
                air.Show();
            }else if(choice == 2){
                air.TurnUpTemperature();
                air.Show();
            }else if(choice == 3){
                air.LowerTemperature();
                air.Show();
            }else{
                JOptionPane.showMessageDialog(null, "The user closed the window without making a selection");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong Format !!");
        }
        
    }
}
