package br.com.fiap;

import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner scan; // Object

        try {
            scan = new Scanner(System.in); //Instance

            System.out.println("Enter one integers:");
            num1 = scan.nextInt();
            System.out.println("Enter other integers: ");
            num2 = scan.nextInt();
            System.out.println("Sum of values: "+ (num1 + num2));

        } catch (Exception e) {
            System.out.println("Wrong Format");
        }
    }
}
