package br.com.fiap.Classes_Ex_23_02;

import java.util.Scanner;

public class PayRollScanner {
    public static void main(String[] args) {
        Scanner scan;
        try {
            Salary finSalaryS = new Salary();
            scan = new Scanner(System.in);

            System.out.println("What's your gross salary (With out discounts): ");
            finSalaryS.grossSalary = scan.nextDouble();

            System.out.println("How much is the percentage of INSS disocunt: ");
            finSalaryS.discountInss = scan.nextDouble();

            System.out.println("How much is an individual health plan: ");
            finSalaryS.PlanHealthValue = scan.nextDouble();

            System.out.println("How many depedents do you have: ");
            finSalaryS.dependentsNumber = scan.nextInt();

            double liquidSalary = finSalaryS.calculateSalary();

            System.out.println("Your salary with discounts is: "+ liquidSalary);
            
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
    }
}
