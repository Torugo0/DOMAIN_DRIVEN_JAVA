package br.com.fiap;

public class People {
    private String name;
    private int yearBirth;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int calculateAge(int actualYear){
        int age = actualYear - yearBirth;
        return age;
    }
}
