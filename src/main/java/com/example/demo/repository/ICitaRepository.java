package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.utilery.Cita;

public interface ICitaRepository extends JpaRepository<Cita, Integer> {

}
