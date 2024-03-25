package br.com.fiap.Exercises;

import javax.swing.JOptionPane;

public class UseEmployee2 {
    public static void main(String[] args) {
        Employee employeeC2;

        try {
            employeeC2 = new Employee(JOptionPane.showInputDialog("Qual seu nome: "), Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da sua hora trabalhada: ")));
            float salary = employeeC2.salary(Float.parseFloat(JOptionPane.showInputDialog("Quantas horas semanais de trabalho: ")));

            JOptionPane.showMessageDialog(null, "Name: " + employeeC2.getName() + " ------ " + "Hour value: " + employeeC2.getHourValue() + " ------ " + "Salary: " + salary);
        } catch (Exception e) {
            System.out.println("Nome e/ou valores de horas trabalhadas incorreto(s)");
        }
    }
}
