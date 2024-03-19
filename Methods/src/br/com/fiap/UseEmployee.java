package br.com.fiap;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("Vitor Hugo");
        employee1.setValueHour(50f);

        System.out.println(employee1.salary(30f));

    }
}
