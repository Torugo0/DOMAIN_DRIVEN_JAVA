package br.com.fiap.Constructors;

public class RadioC {
    // Atributes
    private int volume;
    private float station;

    // Constructors
    public RadioC(){
        //empty constructor
    }
    public RadioC(int volume, float station){
        setVolume(volume);
        setStation(station);
    }

    // gettters and setters
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 10) {
                this.volume = volume;
            } else {
                throw new Exception("Volume outside the permitted range (0-10)");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public float getStation() {
        return station;
    }
    public void setStation(float station) {
    try {
        if (station >= 80.f && station <= 105.0f) {
                this.station = station;
            } else {
                this.station = 80.0f;
                throw new Exception("Station outside the permitted range (80.0-105.0)");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    //methods
    public void turnUpvoume(){
        if(volume < 10){
            volume ++;
        }
    }
    public void lowerVolume(){
        if (volume > 0){
            volume --;
        }
    }
}
