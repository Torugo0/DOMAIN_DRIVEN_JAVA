package br.com.fiap;
import javax.swing.JOptionPane;

public class Strings {
    public static void main(String[] args) throws Exception {
        String phrase = "O rato roeu a roupa do rei de Roma";
        JOptionPane.showMessageDialog(null, phrase);

        //Exibindo a quantidade de caracteres 
        int qtChar = phrase.length();
        JOptionPane.showMessageDialog(null, qtChar);

        //Exibindo a frase em maiuscula
        String maiuscula = phrase.toUpperCase();
        JOptionPane.showMessageDialog(null, maiuscula);

        // Exibindo a frase em minuscula
        String minuscula = phrase.toLowerCase();
        JOptionPane.showMessageDialog(null, minuscula);

        // Obtendo e exibindo a palavra Roma
        String palavra = phrase.substring(30,34);
        JOptionPane.showMessageDialog(null, palavra);

        // Substituindo a palavra roupa por parede
        String frase2 = phrase.replace("roupa", "parede");
        JOptionPane.showMessageDialog(null, frase2);
    }
}
