package br.com.fiap.Classes_Ex_23_02;

public class Salary {
  public double grossSalary;
  public int dependentsNumber;
  public double discountInss;
  public double PlanHealthValue;


  public double calculateSalary(){
    double discount;
    double netSalary;
    discount = (grossSalary * (discountInss/100)) + ((dependentsNumber + 1)* PlanHealthValue);
    netSalary = grossSalary - discount;
    
    return netSalary;
  }
}
