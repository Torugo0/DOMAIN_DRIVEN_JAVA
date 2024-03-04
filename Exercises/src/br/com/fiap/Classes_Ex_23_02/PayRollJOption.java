package br.com.fiap.Classes_Ex_23_02;

import javax.swing.JOptionPane;

public class PayRollJOption {
    public static void main(String[] args) {
        Salary finSalaryJO = new Salary();

        try {
            finSalaryJO.grossSalary = Double.parseDouble(JOptionPane.showInputDialog("What's your gross salary (With out discounts):"));

            finSalaryJO.discountInss = Double.parseDouble(JOptionPane.showInputDialog("How much is the percentage of INSS disocunt:"));

            finSalaryJO.PlanHealthValue = Double.parseDouble(JOptionPane.showInputDialog("How much is an individual health plan:"));

            finSalaryJO.dependentsNumber = Integer.parseInt(JOptionPane.showInputDialog("How many depedents do you have:"));

            double liquidSalary = finSalaryJO.calculateSalary();

            JOptionPane.showMessageDialog(null, "Your salary with discounts is: " + liquidSalary);
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong format !!");
        }
    }
}
