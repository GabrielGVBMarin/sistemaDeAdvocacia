package model.entities;

import java.util.ArrayList;

public class Duvida {
	private String titulo;
	private String descricao;
	private ArrayList<String> nomeDosAnexos;
	private ArrayList<Resposta> respostas = new ArrayList<Resposta>();
	
	public Duvida(String _titulo,  String _descricao,  ArrayList<String> _nomeDosAnexos) {
		titulo = _titulo;
		descricao = _descricao;
		nomeDosAnexos = new ArrayList<String>(_nomeDosAnexos);
	}
	
	public Duvida(String _titulo, String _descricao) {
		titulo = _titulo;
		descricao = _descricao;
	}

	public ArrayList<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(ArrayList<Resposta> respostas) {
		this.respostas = respostas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<String> getNomeDosAnexos() {
		return nomeDosAnexos;
	}

	public void setNomeDosAnexos(ArrayList<String> nomeDosAnexos) {
		this.nomeDosAnexos = nomeDosAnexos;
	}

}
