package es.salesianos.edu.models;

import java.io.Serializable;

public class Author implements Serializable{
	
	private String name;
	private String fechaNacimiento;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

	
	

}
