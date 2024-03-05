package br.com.fiap;

public class RadioEncapsulation {
    public static void main(String[] args) {
        Encapsulation radio1 = new Encapsulation();

        radio1.setStation(81.5f);
        radio1.setVolume(100);

        radio1.turnUpVolume();
        radio1.turnUpVolume();
        radio1.show();
    }
}
