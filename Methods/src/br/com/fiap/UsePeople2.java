package br.com.fiap;

import java.util.Scanner;

public class UsePeople2 {
    public static void main(String[] args) {
        People people2 = new People();
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Input your name: ");
            people2.setName(scan.next());

            System.out.println("Input your year of birth: ");
            people2.setYearBirth(scan.nextInt());

            System.out.println("Nome: " + people2.getName() + "\nAge: " + people2.calculateAge(2024));
        } catch (Exception e) {
            System.out.println("Name and/or year of birth ivalid ");
        }
    }
}
