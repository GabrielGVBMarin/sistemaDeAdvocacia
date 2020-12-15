package model.entities;

import java.util.Date;

public class Resposta {
	private Date data;
	private String texto;
	private Advogado advogado;
	
	public Resposta(Date data, String texto, Advogado advogado) {
		this.data = data;
		this.texto = texto;
		this.advogado = advogado;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}
	
}
