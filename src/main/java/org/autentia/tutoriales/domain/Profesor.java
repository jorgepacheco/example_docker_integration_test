package org.autentia.tutoriales.domain;


public class Profesor extends BaseDomain {
	
	private String nombre;
	

	public Profesor(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}
