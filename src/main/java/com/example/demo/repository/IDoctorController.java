package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.utilery.Doctor;

public interface IDoctorController extends JpaRepository<Doctor, Integer>{

}
