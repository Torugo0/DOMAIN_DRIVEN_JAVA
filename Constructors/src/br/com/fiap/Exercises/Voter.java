package br.com.fiap.Exercises;

import java.time.LocalDate;

public class Voter {
    private String name;
    private int yearBirth;
    private int titleNumber;
    private int zone;
    private int section;

    public Voter(){}

    public Voter(String name, int yearBirth, int titleNumber, int zone, int section){
        this.name = name;
        this.section = section;
        this.titleNumber = titleNumber;
        setYearBirth(yearBirth);
        this.zone = zone;
    }

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
        try {
            int actualYearLesss16 = LocalDate.now().getYear() - 16;
            if (yearBirth >= 1900 && yearBirth <= actualYearLesss16) {
                this.yearBirth = yearBirth;
            } else {
                this.yearBirth = 1900;
                throw new Exception("Ano de nascimento inválido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getTitleNumber() {
        return titleNumber;
    }
    public void setTitleNumber(int titleNumber) {
        this.titleNumber = titleNumber;
    }

    public int getZone() {
        return zone;
    }
    public void setZone(int zone) {
        this.zone = zone;
    }

    public int getSection() {
        return section;
    }
    public void setSection(int section) {
        this.section = section;
    }

    public int ageCalculate(int actualYear){
        return actualYear - yearBirth;
    }

}
