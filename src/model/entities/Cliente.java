package model.entities;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String cep;
	private String senha;
	private ArrayList<Duvida> duvidas = new ArrayList<Duvida>();
	private ArrayList<Processo> processos = new ArrayList<Processo>();
	
	public Cliente(String nome, String email, String telefone, String endereco, String cep, String senha) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cep = cep;
		this.senha = senha;
	}

	public void geraBoleto(Processo processo) {
		
	}
	
	public void consultaProcessos() {
		
	}
	
	public void criaDuvida(String titulo, String descricao, ArrayList<String> nomeDosAnexos) {
		duvidas.add(new Duvida(titulo, descricao, nomeDosAnexos));
	}
	
	public void criaDuvida(String titulo, String descricao) {
		duvidas.add(new Duvida(titulo, descricao));
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Duvida> getDuvidas() {
		return duvidas;
	}

	public void setDuvidas(ArrayList<Duvida> duvidas) {
		this.duvidas = duvidas;
	}
}
