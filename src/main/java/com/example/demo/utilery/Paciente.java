package com.example.demo.utilery;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Paciente {
	
	public Paciente() {}
	
	public Paciente(int idPaciente, String nombre, int edad, boolean sexo) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	
	@Column
	private String nombre;
	
	@Column
	private int edad;
	
	@Column
	private boolean sexo;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "idCita")
	@JsonIgnore
	private List<Cita> citas;
	
	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

}
