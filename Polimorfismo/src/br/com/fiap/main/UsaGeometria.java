package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.bean.Geometria;

public class UsaGeometria {
    public static void main(String[] args) {
        Geometria geol = new Geometria();
        String aux, escolha = "sim";
        int opcao;

        while(escolha.equalsIgnoreCase("sim")){
            try {
                aux= JOptionPane.showInputDialog("Qual área deseja calcular:" + "\n1- Quadrado" + "\n2- Retângulo" + "\n3- Circulo");
                opcao = Integer.parseInt(aux);

                switch (opcao) {
                    case 1:
                        geol.calculaArea(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de lado: ")));
                        break;
                    case 2:
                        geol.calculaArea(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de lado: ")), Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: ")));    
                        break;
                    case 3:
                        geol.calculaArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: ")));        
                        break;
                
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar (sim/não):");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }
}
