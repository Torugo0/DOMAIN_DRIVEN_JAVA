package br.com.fiap.main;
import javax.swing.JOptionPane;

import br.com.fiap.bean.*;

public class CalculaArea {
    public static void main(String[] args) throws Exception {
        String aux, escolha = "sim";
        float area, lado, altura;
        int opcao;

        while(escolha.equalsIgnoreCase("sim")){
            try {
                aux= JOptionPane.showInputDialog("Qual área deseja calcular:" + "\n1- Quadrado" + "\n2- Retângulo" + "\n3- Triangulo");
                opcao = Integer.parseInt(aux);

                switch (opcao) {
                    case 1:
                        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de lado: "));
                        Quadrado quad = new Quadrado(lado);
                        area = quad.calculaArea();
                        JOptionPane.showMessageDialog(null, "Área do quadrado: "+ area);
                        break;
                    case 2:
                        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de lado: "));
                        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
                        Retangulo ret = new Retangulo(lado, altura);
                        area = ret.calculaArea();
                        JOptionPane.showMessageDialog(null, "Área do retangulo: "+ area);
                        break;
                    case 3:
                        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de lado: "));
                        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
                        Triangulo tri = new Triangulo(lado, altura);
                        area = tri.calculaArea();
                        JOptionPane.showMessageDialog(null, "Área do triangulo: "+ area);
                        break;
                
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar (sim/não):");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do programa. Volte sempre!");
    }
}
