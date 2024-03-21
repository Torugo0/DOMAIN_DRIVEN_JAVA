package br.com.fiap;

public class UsePeopleC {
    public static void main(String[] args) {
        PeopleC peopleC1 = new PeopleC();
        PeopleC peopleC2 = new PeopleC("Ana Clara", 1700);

        peopleC1.setName("Vitor Hugo");
        peopleC1.setYearBirth(2005);
        int age = peopleC1.ageCalculate(2024);

        System.out.println("Nome: " + peopleC1.getName());
        System.out.println("Idade: " + age);

        System.out.println("Name: " + peopleC2.getName());
        System.out.println("Age: " + peopleC2.ageCalculate(2024));
    }
}
