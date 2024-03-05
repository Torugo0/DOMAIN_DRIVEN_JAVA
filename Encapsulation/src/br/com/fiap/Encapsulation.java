package br.com.fiap;

public class Encapsulation {
    // attributes
    private int volume;
    private float station;

    
    // getters & setters
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        try {
            if(volume >= 0 && volume <= 100){
                this.volume = volume;
            }else{
                throw new Exception("Volume outside the permitted range (0 a 100)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public float getStation(){
        return station;
    }
    public void setStation(float station){
        try {
            if (station >= 80.0f && station <= 105.0f) {
                this.station = station;
            } else {
                throw new Exception("Volume outside the permitted range (80.0 a 105.0)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //methods
    public void turnUpVolume(){
        if (volume < 100){
            volume ++;
        }
    }
    public void lowerVolume(){
        if (volume > 0){
            volume --;
        }
    }

    public void show(){
        System.out.println("Volume: " + getVolume());
        System.out.println("Statio: " + getStation());
    }
}
