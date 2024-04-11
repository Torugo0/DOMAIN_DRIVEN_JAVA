package br.com.fiap.Exercises;

import java.time.LocalDate;

public class UseVoter1 {
    public static void main(String[] args) {
        int actualYear = LocalDate.now().getYear();
        Voter voter1 = new Voter();

        voter1.setName("Vitor Hugo");
        voter1.setYearBirth(2010);
        voter1.setTitleNumber(123456);
        voter1.setZone(123);
        voter1.setSection(456);

        Voter voter2 = new Voter("Ana Clara", 2004, 987654, 987, 654);

        System.out.println("\n-------------- Exibindo informações --------------");
        System.out.println("Name: " + voter1.getName());
        System.out.println("Year Birth: " + voter1.getYearBirth());
        System.out.println("Age: " + voter1.ageCalculate(actualYear));
        System.out.println("Title Number: " + voter1.getTitleNumber());
        System.out.println("Voter zone: " + voter1.getZone());
        System.out.println("Voter section: " + voter1.getSection());
        System.out.println();
        System.out.println("\n-------------- Exibindo informações --------------");
        System.out.println("Name: " + voter2.getName());
        System.out.println("Year Birth: " + voter2.getYearBirth());
        System.out.println("Age: " + voter2.ageCalculate(actualYear));
        System.out.println("Title Number: " + voter2.getTitleNumber());
        System.out.println("Voter zone: " + voter2.getZone());
        System.out.println("Voter section: " + voter2.getSection());

    }
}
