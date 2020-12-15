package model.enums;

public enum StatusDaOab {
	ATIVO("ativo"),
	INATIVO("inativo");
	
	private String status;
	
	StatusDaOab(String _status) {
		status = _status;
	}
	
	public String getStatus() {
		return status;
	}
}
