package br.com.fiap.ReadAndWrite_Ex_22_02;

import javax.swing.JOptionPane;

public class Ex1_WJoption2 {
    public static void main(String[] args) {
        double width = 0, length = 0;

        try {
            JOptionPane.showMessageDialog(null, "Retangle area calculator ");

            width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of rectangle: "));
            length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of rectangle: "));

            JOptionPane.showMessageDialog(null, "Area of the rectangle: " + (width * length));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong Format !!");
        }
    }
}
