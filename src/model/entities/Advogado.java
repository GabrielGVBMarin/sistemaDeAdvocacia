package model.entities;

import java.util.Date;
import java.util.ArrayList;
import model.enums.StatusDaOab;

public class Advogado {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private Double ganhos;
    private String oab;
    private StatusDaOab status;
    private ArrayList<Processo> processos = new ArrayList<Processo>();

    public Advogado(String nome, String email, String senha, String telefone, double ganhos, String oab, StatusDaOab estadoDaOab) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.ganhos = ganhos;
        this.oab = oab;
        this.status = estadoDaOab;
    }
    
    public void adicionaResposta(Duvida duvida, String resposta) {
    	duvida.getRespostas().add(new Resposta(new Date(),resposta, this));
    }
    
    public void editaResposta(Resposta resposta, String texto) {
    	resposta.setTexto(texto);
    	resposta.setData(new Date());
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getGanhos() {
        return ganhos;
    }

    public void setGanhos(double ganhos) {
        this.ganhos = ganhos;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public StatusDaOab getEstadoDaOab() {
        return status;
    }

    public void setEstadoDaOab(StatusDaOab estadoDaOab) {
        this.status = estadoDaOab;
    }

    public void criaProcesso(double honorario, double totalFinal){

    }

    public void adicionarResposta(String texto){

    }

    public void editarResposta(String texto){

    }

	public ArrayList<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(ArrayList<Processo> processos) {
		this.processos = processos;
	}
}