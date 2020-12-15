package model.entities;

import java.util.Date;

import model.enums.StatusDoProcesso;

public class Processo {
	private Date data;
	private StatusDoProcesso status;
	private Double honorario;
	private Double totalGanho;
	private Double totalFinal;
	private Cliente cliente;
	
	// quais sao os campos
	// como o cliente conulta processo
	
	public Processo(Date _data, Cliente _cliente, StatusDoProcesso _status) {
		data = _data;
		status = _status;
		cliente = _cliente;
	}

//	public String toString() {
//		return status.toString();
//	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusDoProcesso getStatus() {
		return status;
	}

	public void setStatus(StatusDoProcesso status) {
		this.status = status;
	}

	public Double getHonorario() {
		return honorario;
	}

	public void setHonorario(Double honorario) {
		this.honorario = honorario;
	}

	public Double getTotalGanho() {
		return totalGanho;
	}

	public void setTotalGanho(Double totalGanho) {
		this.totalGanho = totalGanho;
	}

	public Double getTotalFinal() {
		return totalFinal;
	}

	public void setTotalFinal(Double totalFinal) {
		this.totalFinal = totalFinal;
	}
	
	
}
