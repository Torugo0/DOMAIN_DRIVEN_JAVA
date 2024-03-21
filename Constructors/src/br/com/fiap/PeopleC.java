package br.com.fiap;

import java.time.LocalDate;


public class PeopleC {
    //atributes
    private String name;
    private int yearBirth;

    //constructors
    
    // empty constructor
    public PeopleC(){}

    // constructor with parameters
    public PeopleC(String name, int yearBirth){
        this.name = name;
        setYearBirth(yearBirth);
    }
    
    //getter & setter
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
        // this.yearBirth = yearBirth;

        LocalDate actualYear = LocalDate.now();

        try {
            if (yearBirth >= 1900 && yearBirth <= actualYear.getYear()) {
                this.yearBirth = yearBirth;
            } else {
                throw new Exception("Valor errado ! (1900 - 2024)");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // methods
    public int ageCalculate(int actualYear){
        int age = actualYear - yearBirth;
        return age;
    }

}
