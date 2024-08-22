package br.com.fiap.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Pessoa {
    private String codigo;
    private String nome;
    private String email;

    public Pessoa(){}

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Pessoa ler(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + codigo + ".txt"));
        codigo = br.readLine();
        nome = br.readLine();
        email = br.readLine();
        br.close(); // Necessario para liberar espaço na maquina, evitar erros e por segurança.
        return this;
    }

    public String gravar(String path){
        try {
            File dir = new File(path);
            if(!dir.exists()){
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + codigo + ".txt");
            pw.println(codigo);
            pw.println(nome);
            pw.println(email);
            pw.flush();
            pw.close();
            return "Arquivo gravado com sucesso!";
        } catch (IOException e) {
            return "Falha ao gravar arquivo!\n" + e.getMessage();
        }
    }

}
