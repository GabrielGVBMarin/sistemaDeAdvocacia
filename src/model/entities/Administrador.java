package model.entities;

import java.util.List;

public class Administrador {

    private String email;
    private String senha;
    // tem o escritorio
    
    public Administrador(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void geraRelatorioDeAdvogados(String nome, List<Duvida> advogados) {

    }

    public void geraRelatorioDeDuvidas(String nome, List<Processo> duvidas){

    }

    public void geraRelatorioDeProcessos(String nome, List<Processo> processos){

    }
}