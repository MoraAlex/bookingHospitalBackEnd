package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaRepository;
import com.example.demo.repository.IPacienteRepository;
import com.example.demo.utilery.Cita;
import com.example.demo.utilery.Paciente;

@Service
public class PacienteDAO {
	
	@Autowired
	IPacienteRepository iPacienteRepository;
	
	@Autowired
	ICitaRepository iCitaRepository;
	
	public List<Paciente> findAllPacientes(){
		return iPacienteRepository.findAll();
	}
	
	public boolean agregarPaciente(Paciente paciente) {
		 return iPacienteRepository.save(paciente) != null ?  true :  false;
	}
	
	public Optional<Paciente> getPacienteById(int idPaciente){
		return iPacienteRepository.findById(idPaciente);
	}
	
	public Cita postCitaByPaciente(Cita cita) {
		return iCitaRepository.findAll().contains(cita) == true ? null : cita;
	}
}
