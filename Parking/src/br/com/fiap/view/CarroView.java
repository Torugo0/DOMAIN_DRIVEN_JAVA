package br.com.fiap.view;

import javax.swing.JOptionPane;

import br.com.fiap.controller.CarroController;

public class CarroView {
    public static void main(String[] args) {
        String placa, cor, descricao;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        int opcao;

        CarroController carroController = new CarroController();

        do{
            try {
                opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular um Carro", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]);

                placa = JOptionPane.showInputDialog("Digite a placa do carro:");

                switch (opcao) {
                    case 0:
                        cor = JOptionPane.showInputDialog("Digite a cor do carro:");
                        descricao = JOptionPane.showInputDialog("Digite uma descrição do carro:");
                        System.out.println(carroController.inserirCarro(placa, cor, descricao));
                        break;
                    case 1:
                        cor = JOptionPane.showInputDialog("Digite a NOVA cor do carro:");
                        descricao = JOptionPane.showInputDialog("Digite uma NOVA descrição para o carro:");
                        System.out.println(carroController.alterarCarro(placa, cor, descricao));
                        break;
                    case 2:
                        System.out.println(carroController.excluirCarro(placa));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, carroController.listarUm(placa));
                        break;
                
                    default:
                        System.out.println("Opção inválida!");;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }while(JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
