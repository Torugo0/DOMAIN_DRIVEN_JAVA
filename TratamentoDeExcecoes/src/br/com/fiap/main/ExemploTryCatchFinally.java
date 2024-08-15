package br.com.fiap.main;

import javax.swing.JOptionPane;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        try{
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1º número (Faixa permitida de 1 a 50.)");
            int num1 = Integer.parseInt(aux1);

            if (num1 < 1 || num1 > 50){
                throw new Exception("Número informado fora da faixa permitida");
            }

            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2º número");
            int num2 = Integer.parseInt(aux2);

            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro de conversão.\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero.\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
            JOptionPane.showMessageDialog(null, "Fim do programa");
        }
    }
}
