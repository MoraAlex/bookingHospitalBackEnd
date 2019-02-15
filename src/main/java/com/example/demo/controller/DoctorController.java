package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DoctorDAO;
import com.example.demo.utilery.Doctor;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorDAO doctorDao;
	
	@RequestMapping(value ="/doctor", method = RequestMethod.GET)
	public List<Doctor> findAllDoctors(){
		return doctorDao.findAllDoctors();
	}
	
	@RequestMapping(value = "/doctor", method = RequestMethod.POST)
	public boolean postDoctor(@RequestBody Doctor doctor) {
		return doctorDao.agregarDoctor(doctor);
	}

}
