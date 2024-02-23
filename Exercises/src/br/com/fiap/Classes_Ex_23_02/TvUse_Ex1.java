package br.com.fiap.Classes_Ex_23_02;

public class TvUse_Ex1 {
    public static void main(String[] args) {
        Tv_Ex1 tv = new Tv_Ex1();

        tv.volume = 10;
        tv.channel = 501;

        tv.show();

        //Changing channel
        tv.changeChannel(519);
        tv.lowerVolume();
        tv.show();
    }
}
