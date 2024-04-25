package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.ContaBancaria;

public class UsaConta {
    public static void main(String[] args) throws Exception {
        String cliente, escolha = "sim";
        int numConta, opcao;
        float saldo;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de conta:" + "\n1-Conta Bancaria" + "\n2-Conta Poupança" + "\n3-Conta Especial"));
                cliente = JOptionPane.showInputDialog("Nome do cliente: ");
                numConta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta:"));
                saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo atual:"));


                switch (opcao) {
                    case 1:
                        ContaBancaria cb = new ContaBancaria();
                        cb.setCliente(cliente);
                        cb.setNumConta(numConta);
                        cb.setSaldo(saldo);
                        
                        opcao = Integer.parseInt(JOptionPane.showInputDialog("\n1-Sacar" + "\n2-Depositar"));    
                        
                        if(opcao == 1){
                            Float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que deseja sacar: "));
                            cb.sacar(valor);
                            saldo = cb.getSaldo();
                            JOptionPane.showMessageDialog(null, "Saldo atual: "+ saldo);
                        }else if(opcao == 2){
                            Float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor que deseja depositar: "));
                            cb.depositar(valor);
                            saldo = cb.getSaldo();
                            JOptionPane.showMessageDialog(null, "Saldo atual: "+ saldo);
                        }else{
                            JOptionPane.showMessageDialog(null, "Opção incorreta !");
                        }
                        break;
                    case 2:
                        
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
