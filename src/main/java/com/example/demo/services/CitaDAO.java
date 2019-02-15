package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaRepository;
import com.example.demo.utilery.Cita;

@Service
public class CitaDAO {
	
	@Autowired
	ICitaRepository iCitaRepository;
	
	public List<Cita> findAllCita() {
		return iCitaRepository.findAll();
	}
	
	public boolean agregarCita(Cita cita) {
		if(iCitaRepository.save(cita) != null){
	           return true;
	       }
	       else{
	           return false;
	       }
	}
}
