package br.com.fiap;

import javax.swing.JOptionPane;

public class UsePeople {
    public static void main(String[] args) {
        People people1 = new People();

        people1.setName("Vitor Hugo");
        people1.setYearBirth(2005);
        int age = people1.calculateAge(2024);
        JOptionPane.showMessageDialog(null,people1.getName() + " is " + age);
    }
}
