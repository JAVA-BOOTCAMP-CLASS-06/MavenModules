package ar.com.projects.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
	
	private String nombre;
	
	private int dni;
	
	private Date fechaNac;
	
	private Sexo sexo;

	public Persona(String n, int d, Date f, Sexo s) {
		this.setNombre(n);
		this.setDni(d);
		this.setFechaNac(f);
		this.setSexo(s);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public String getFechaNacFormat() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		return df.format(this.fechaNac);
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
