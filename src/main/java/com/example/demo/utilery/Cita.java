package com.example.demo.utilery;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.ToString;

@ToString
@Entity
public class Cita {
	
	public Cita() {}

	public Cita(int idCita, Date fecha, int consultorio, Doctor doctor, Paciente paciente) {
		this.idCita = idCita;
		this.fecha = fecha;
		this.consultorio = consultorio;
		this.doctor = doctor;
		this.paciente = paciente;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCita;
	
	@Column
	private Date fecha;
	
	@Column
	private int consultorio;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "doctor", referencedColumnName = "idDoctor")
	private Doctor doctor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "paciente", referencedColumnName = "idPaciente")
	private Paciente paciente;
	
	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(int consultorio) {
		this.consultorio = consultorio;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
}
