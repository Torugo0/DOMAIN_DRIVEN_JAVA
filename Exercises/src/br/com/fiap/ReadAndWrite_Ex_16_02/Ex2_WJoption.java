package br.com.fiap.ReadAndWrite_Ex_16_02;

import javax.swing.JOptionPane;

public class Ex2_WJoption {
    public static void main(String[] args) {
        int actualYear = 0, yearBirth = 0;

        try {
            yearBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter your year of birth: "));

            actualYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the actual year: "));

            JOptionPane.showMessageDialog(null, "Your age: " + (actualYear - yearBirth));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong format !!");
        }
    }
}
