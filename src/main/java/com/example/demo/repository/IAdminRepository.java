package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.utilery.Admin;


public interface IAdminRepository extends JpaRepository<Admin, Integer> {

}
