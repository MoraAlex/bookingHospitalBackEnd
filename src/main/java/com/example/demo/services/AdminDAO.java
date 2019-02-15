package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAdminRepository;
import com.example.demo.utilery.Admin;

import java.util.List;

@Service
public class AdminDAO {
	
	@Autowired
	IAdminRepository iAdminRepository;

	public List<Admin> finAllAdmin() {
		return iAdminRepository.findAll();
	}

	public boolean agregarAdmin(Admin admin) {
		if(iAdminRepository.save(admin) != null){
	           return true;
	       }
	       else{
	           return false;
	       }
	}

}
