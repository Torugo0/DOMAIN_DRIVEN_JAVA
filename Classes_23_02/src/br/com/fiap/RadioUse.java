package br.com.fiap;

public class RadioUse {
    public static void main(String[] args) {
        Classes radio1 = new Classes();
        
        radio1.volume = 8; 
        radio1.station = 89.1f;
        
        radio1.show();

        //changing a station
        radio1.changeStation(92.5f);
        radio1.turnUpVolume();
        radio1.turnUpVolume();
        radio1.show();
    }
}
