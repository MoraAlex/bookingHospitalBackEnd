package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.utilery.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Integer>{

}
