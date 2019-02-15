package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDoctorController;
import com.example.demo.utilery.Doctor;

@Service
public class DoctorDAO {
	
	@Autowired
	IDoctorController iDoctorController;
	
	public List<Doctor> findAllDoctors(){
		return iDoctorController.findAll();
	}
	
	public boolean agregarDoctor(Doctor doctor) {
		if(iDoctorController.save(doctor) != null){
	           return true;
	       }
	       else{
	           return false;
	       }
		
	}

}
