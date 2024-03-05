package br.com.fiap;

public class UseTvEncap {
    public static void main(String[] args) {
        EncapsulationTv tv = new EncapsulationTv();

        tv.setChannel(3);
        tv.setVolume(10);
        tv.show();

        tv.turnUpVolume();
        tv.setChannel(2);
        tv.show();

    }
}
