package br.com.fiap.ReadAndWrite_Ex_16_02;

import javax.swing.JOptionPane;

public class Ex3_WJoption {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double rain = 0;
        String aux;

        try {
            rain = Double.parseDouble(JOptionPane.showInputDialog("Enter the circle radius: "));

            JOptionPane.showMessageDialog(null, "Area of the circle: " + (PI*(rain*rain)));
            // To elevate a number use PI * Math.pow(rain, 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong Format !!");
        }
    }
}
