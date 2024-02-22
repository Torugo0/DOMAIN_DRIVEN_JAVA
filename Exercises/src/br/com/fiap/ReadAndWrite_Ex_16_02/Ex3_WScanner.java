package br.com.fiap.ReadAndWrite_Ex_16_02;

import java.util.Scanner;

public class Ex3_WScanner {
    public static void main(String[] args) {
        final double pi = 3.1416;
        double rain = 0;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            System.out.println("Enter the circle radius");
            rain = scan.nextDouble();

            System.out.println("Area of the circle: "+(pi*(rain*rain)));


        } catch (Exception e) {
            System.out.println("Wrong Format");
        }
    }
}
