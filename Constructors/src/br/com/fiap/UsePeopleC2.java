package br.com.fiap;

import java.util.Scanner;

public class UsePeopleC2 {
    public static void main(String[] args) {
        PeopleC peopleC3;
        //String name;
        //int yearBirth;
        Scanner scan;
        
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite seu nome e ano de nascimento: ");
            peopleC3 = new PeopleC(scan.nextLine(), scan.nextInt());
            int age = peopleC3.ageCalculate(2024);
            

            System.out.println("Name: " + peopleC3.getName());
            System.out.println("Age: " + age);
            /*
            name = JOptionPane.showInputDialog("Digite seu nome: ");
            yearBirth = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));

            peopleC3 = new PeopleC(name, yearBirth);
            int age = peopleC3.ageCalculate(2024);

            JOptionPane.showMessageDialog(null, "Name: " + peopleC3.getName());
            JOptionPane.showMessageDialog(null, "Age: " + age); */
            
        } catch (Exception e) {
            System.out.println("Nome e/ou ano de nascimento incorreto(s)");
        }
    }
}
