package br.com.fiap.main;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();

        do {
            try {
                String sigla, estado;
                do {

                    sigla = JOptionPane
                            .showInputDialog(
                                    "Digite a UF (Unidade federal) de um estado ou digite \"FIM\" para encerrar")
                            .toUpperCase();
                    if (!sigla.equals("FIM")) {
                        estado = JOptionPane
                                .showInputDialog("Digite o nome completo do estado informado anteriormente");

                        if (mapa.containsKey(sigla)) {
                            JOptionPane.showMessageDialog(null, "Estado já foi cadastrado");
                        } else {
                            mapa.put(sigla, estado);
                        }
                    }

                } while (!sigla.equals("FIM"));

                String escolha = JOptionPane.showInputDialog(null, "Digite a UF de um estado da sua escolha")
                        .toUpperCase();

                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "O nome completo deste Estado é: " + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Estado ainda não cadastrado!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa !");
    }
}
