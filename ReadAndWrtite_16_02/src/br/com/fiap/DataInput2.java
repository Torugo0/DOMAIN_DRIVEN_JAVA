package br.com.fiap;

import javax.swing.JOptionPane;

public class DataInput2 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Enter one integers: ");
            num1 = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Enter other integers: ");
            num2 = Integer.parseInt(aux);
            JOptionPane.showMessageDialog(null, "Sum of values: "+(num1+num2));

            //System.out.println("Sum of values: "+(num1 + num2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong format !!");
        }
    }
}