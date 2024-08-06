package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Equipe {
    private String nome;
    private String[] integrantes;

    public Equipe() {
    }

    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listaEquipe() {
        String exibe = "Nome da equipe: " + nome;
        int cont = 1;

        for (String i : integrantes) {
            exibe += "\n Integrante: " + cont + ": " + i;
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe);
    }

}
