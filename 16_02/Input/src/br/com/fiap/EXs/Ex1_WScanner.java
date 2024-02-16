package br.com.fiap.EXs;

import java.util.Scanner;

public class Ex1_WScanner {
    public static void main(String[] args) {
        double value1 = 0, value2 = 0, value3 = 0, value4 = 0;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            System.out.println("Enter the first test:");
            value1 = scan.nextDouble();

            System.out.println("Enter the second test:");
            value2 = scan.nextDouble();

            System.out.println("Enter the third test:");
            value3 = scan.nextDouble();

            System.out.println("Enter the fourth test:");
            value4 = scan.nextDouble();
            
            System.out.println("Average of the student: " + ((value1 + value2 + value3 + value4)/4));

        } catch (Exception e) {
            System.out.println("Wrong format");
        }
    }
}
