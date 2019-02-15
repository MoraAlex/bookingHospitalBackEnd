package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.PacienteDAO;
import com.example.demo.utilery.Paciente;

@RestController
public class PacienteController {
	
	@Autowired
	PacienteDAO pacienteDao;
	
	@RequestMapping(value ="/paciente", method = RequestMethod.GET)
	public List<Paciente> findAllPacientes() {
		return pacienteDao.findAllPacientes();
	}
	
	@RequestMapping(value = "/paciente", method = RequestMethod.POST)
	public boolean postPaciente(@RequestBody Paciente paciente) {
		return pacienteDao.agregarPaciente(paciente);
	}
	
	@RequestMapping(value ="/paciente/{idPaciente}", method = RequestMethod.GET)
	public Optional<Paciente> getPacienteById(@PathVariable String idPaciente) {
		return pacienteDao.getPacienteById(Integer.parseInt(idPaciente));
	}
	
}
