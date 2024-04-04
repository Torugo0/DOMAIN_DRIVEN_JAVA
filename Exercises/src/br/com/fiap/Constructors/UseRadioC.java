package br.com.fiap.Constructors;

import javax.swing.JOptionPane;

public class UseRadioC {
    public static void main(String[] args) {
        RadioC radio1;
        int volume, choose;
        float station;

        try {
            radio1 = new RadioC( Integer.parseInt(JOptionPane.showInputDialog("Volume: ")),  Float.parseFloat(JOptionPane.showInputDialog("Station: ")));

            JOptionPane.showMessageDialog(null, "Station: " + radio1.getStation() + " --- Volume: " + radio1.getVolume());

            choose = Integer.parseInt(JOptionPane.showInputDialog("Choose an option: \n1 - Turn Up Volume \n2 - Lower volume \n3 - Change station"));

            switch (choose) {
                case 1:
                    radio1.turnUpvoume();                    
                    break;
                case 2:
                    radio1.lowerVolume();
                    break;
                case 3:
                    station = Float.parseFloat(JOptionPane.showInputDialog("New station: "));
                    radio1.setStation(station);
                    break;
            
                default:
                    throw new Exception("Invalid option (1-3)");
                    
            }

            JOptionPane.showMessageDialog(null, "Station: " + radio1.getStation() + " --- Volume: " + radio1.getVolume());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
