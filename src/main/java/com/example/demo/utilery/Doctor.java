package com.example.demo.utilery;




import java.util.Date;
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
public class Doctor {

	public Doctor() {}
	
	public Doctor(int idDoctor, String nombre, String nombreUsuario, String contra, String especialidad, String cedula,
			Date birthDate, List<Cita> citas) {
		this.idDoctor = idDoctor;
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
		this.contra = contra;
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.birthDate = birthDate;
		this.citas = citas;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idDoctor;
	
	@Column
	public String nombre;
	
	@Column
	public String nombreUsuario;
	
	@Column
	public String contra;
	
	@Column
	public String especialidad;
	
	@Column
	public String cedula;
	
	@Column
	public Date birthDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "idCita")
	@JsonIgnore
	public List<Cita> citas;
	
	public int getIdDoctor() {
		return idDoctor;
	}
	
	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
/*
	private String generateId() {
		StringBuilder generatedId = null;
		generatedId.append(nombre.charAt(0));
		generatedId.append(nombre.charAt(1));
		generatedId.append(birthDate.toString());
		return generatedId.toString();
		
	}*/
	
}
