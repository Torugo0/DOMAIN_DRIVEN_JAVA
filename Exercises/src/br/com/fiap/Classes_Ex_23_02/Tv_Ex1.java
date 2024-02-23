package br.com.fiap.Classes_Ex_23_02;

public class Tv_Ex1 {
    //atributes

    public int volume;
    public int channel;

    public void turnUpVolume(){
        volume ++;
    }
    public void lowerVolume(){
        volume --;
    }
    public void changeChannel(int ch){
        channel = ch;
    }
    public void show(){
        System.out.println("Volume: "+ volume);
        System.out.println("Station: "+ channel);
    }
}
