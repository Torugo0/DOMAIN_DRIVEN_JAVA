package br.com.fiap;

public class Classes {
    // Creating a class of radio simulation 
    // Class atributes
    public int volume;
    public float station;

    //Class methods
    public void turnUpVolume(){
        volume ++;
    }
    public void lowerVolume(){
        volume --;
    }

    public void changeStation(float s){
        station = s;
    }
    public void show(){
        System.out.println("Volume: "+ volume);
        System.out.println("Station: "+ station);
    }

    
}



