package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CitaDAO;
import com.example.demo.services.PacienteDAO;
import com.example.demo.utilery.Cita;
import com.example.demo.utilery.Paciente;

@RestController
@CrossOrigin(origins = "http://192.168.66.52:4200")
public class CitaController {
	@Autowired
	CitaDAO citaDao;
	
	@Autowired
	PacienteDAO pacienteDao;
	
	@RequestMapping(value="/cita", method = RequestMethod.GET)
	public List<Cita> getCita(){
		return citaDao.findAllCita();
	}
	
	@RequestMapping(value="/cita", method = RequestMethod.POST)
	public boolean postAdmin(@RequestBody Cita cita) {
		return citaDao.agregarCita(cita);
	}
	
	@RequestMapping(value = "/cita/{idCita}/paciente", method = RequestMethod.POST)
	public boolean postCitaByPaciente(@PathVariable String idCita, @RequestBody Paciente paciente) {
		return true;
	}
}
