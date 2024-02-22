package br.com.fiap.ReadAndWrite_Ex_16_02;

import java.util.Scanner;

public class Ex2_WScanner {
    public static void main(String[] args) {
        int actualYear = 0, yearBirth = 0;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            System.out.println("Enter the actual year:");
            actualYear = scan.nextInt();

            System.out.println("\nEnter your year of birth:");
            yearBirth = scan.nextInt();

            System.out.println("Your age: "+(actualYear - yearBirth));

        } catch (Exception e) {
            System.out.println("Wrong format");
        }

    }
}
