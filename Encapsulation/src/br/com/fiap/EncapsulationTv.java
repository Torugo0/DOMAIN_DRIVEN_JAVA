package br.com.fiap;

public class EncapsulationTv {
    private int volume;
    private int channel;

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 20){
                this.volume = volume;
            }else{
                throw new Exception("Volume outside the permitted range (0 a 100)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        try {
            if (channel == 2 || channel == 4 || channel == 5 || channel == 7 || channel == 13){
                this.channel = channel;
            }else{
                throw new Exception("The channel isn't permitted (2, 4, 5, 7, 13)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void turnUpVolume(){
        if (volume < 20){
            volume ++;
        }
    }
    public void lowerVolume(){
        if (volume > 0 ){
            volume --;
        }
    }

    public void show(){
        System.out.println("Volume: " + getVolume());
        System.out.println("Channel: " + getChannel());
    }
}
