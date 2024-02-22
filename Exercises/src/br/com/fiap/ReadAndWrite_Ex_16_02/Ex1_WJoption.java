package br.com.fiap.ReadAndWrite_Ex_16_02;

import javax.swing.JOptionPane;

public class Ex1_WJoption {
    public static void main(String[] args) {
        double value1 = 0, value2 = 0, value3 = 0, value4 = 0; 
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Enter the first test: ");
            value1 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Enter the second test: ");
            value2 = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog("Enter the third test: ");
            value3 = Double.parseDouble(aux);
            value4 = Double.parseDouble(JOptionPane.showInputDialog("Enter the fourd test: "));

            JOptionPane.showMessageDialog(null, "Average of student: " + ((value1 + value2 + value3 + value4)/4));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong format !!");
        }
    }
}
