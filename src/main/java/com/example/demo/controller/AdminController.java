package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.AdminDAO;
import com.example.demo.utilery.Admin;

import java.util.List;


@RestController
public class AdminController {
	@Autowired
	AdminDAO adminDao;

	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public List<Admin> getAdmin(){
		return adminDao.finAllAdmin();
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public boolean postAdmin(@RequestBody Admin admin){
		return adminDao.agregarAdmin(admin);
	}

}
