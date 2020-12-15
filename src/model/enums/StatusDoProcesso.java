package model.enums;

public enum StatusDoProcesso {
	ABERTO("aberto"),
	EM_ANDAMENTO("em andamento"),
	FINALIZADO("finalizado");
	
	
	private String status;
	
	StatusDoProcesso(String _status) {
		status = _status;
	}
	
	public String getStatus() {
		return status;
	}
}
