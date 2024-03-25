package br.com.fiap.Exercises;

import java.time.LocalDate;

public class UseEmployee {
    public static void main(String[] args) {
        LocalDate actualDate = LocalDate.now();
        Employee employeeC = new Employee();

        employeeC.setHourValue(11f);
        employeeC.setName("Vitor Hugo");

        System.out.println("Nome: " + employeeC.getName() + " Salary: " + employeeC.salary(30f));
        System.out.println("Date: "+ actualDate.getDayOfMonth() + "/" + actualDate.getMonthValue() + "/" + actualDate.getYear());
    }
}
