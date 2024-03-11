package br.com.fiap;

import javax.swing.JOptionPane;

public class UseTvEncap {
    public static void main(String[] args) {
        EncapsulationTv tv = new EncapsulationTv();

        String[] options = {"Other channel", "Set a volume","Turn Up Volume", "Lower Volume"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Television", JOptionPane.DEFAULT_OPTION,  JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        try {
            if (choice == 0) {
                int channel = Integer.parseInt(JOptionPane.showInputDialog("Choose a channel\nPermitted channels: 2, 4, 5, 7, 13"));
                tv.setChannel(channel);
                System.out.println("Channel: " + tv.getChannel());
            }else if(choice == 1){
                int volume = Integer.parseInt(JOptionPane.showInputDialog("Set a volume for your TV"));
                tv.setVolume(volume);
                System.out.println("Volume: " + tv.getVolume());
            }else if(choice == 2){
                tv.turnUpVolume();
                System.out.println("Volume: "+ tv.getVolume());
            }else if(choice == 3){
                tv.lowerVolume();
                System.out.println("Volume: "+ tv.getVolume());
            }else {
                System.out.println("O usuário fechou o diálogo sem fazer uma seleção.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong Format !!");
        }

    }
}
