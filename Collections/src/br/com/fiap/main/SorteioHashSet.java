package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class SorteioHashSet {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();

        do {
            JOptionPane.showMessageDialog(null, "Confira a seguir o resultado do sorteio da loteria !",
                    "Loteria premiada", JOptionPane.WARNING_MESSAGE);

            while (numerosSorteados.size() < 6) {
                int numero = random.nextInt(59) + 1; // Colocar um número a mais
                numerosSorteados.add(numero);
            }

            List<Integer> resultadoDoSorteio = new ArrayList<Integer>(numerosSorteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null, "Os números sorteados são: \n" + resultadoDoSorteio);
            numerosSorteados.clear();

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa !");
    }
}
