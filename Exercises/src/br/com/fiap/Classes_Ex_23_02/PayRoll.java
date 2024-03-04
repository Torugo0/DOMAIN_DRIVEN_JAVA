package br.com.fiap.Classes_Ex_23_02;

public class PayRoll {
    public static void main(String[] args) {
        Salary finalSalary = new Salary();

        finalSalary.grossSalary = 5000;
        finalSalary.discountInss = 10;
        finalSalary.PlanHealthValue = 50;
        finalSalary.dependentsNumber = 2;
        
        System.out.println("Your salary with discounts is: "+ finalSalary.calculateSalary());
    }
}