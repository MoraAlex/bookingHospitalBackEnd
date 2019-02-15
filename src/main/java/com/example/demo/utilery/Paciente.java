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
	
	public Paciente(int idPaciente, String nombre, String password, int edad, boolean sexo, String nombreUsuario,
			List<Cita> citas) {
		super();
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.password = password;
		this.edad = edad;
		this.sexo = sexo;
		this.nombreUsuario = nombreUsuario;
		this.citas = citas;
	}	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	
	@Column
	private String nombre;
	
	@Column
	private String password;
	
	@Column
	private int edad;
	
	@Column
	private boolean sexo;
	
	@Column
	private String nombreUsuario;
	
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
	
	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

}
