package ar.com.projects.bean;

public enum Sexo {
	FEMENINO ("FEMENINO"),
	MASCULINO ("MASCULINO");
	
	private String descripcion;
	
	private Sexo(String desc) {
		this.descripcion = desc;
	}
	
	public String getDescription() {
		return this.descripcion;
	}
}
