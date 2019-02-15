package com.example.demo.utilery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.ToString;


@ToString
@Entity
public class Admin {
	
	   public Admin() {}

	   public Admin(int idAdmin, String nombreAdmin, String usuario, String password) {
		   this.idAdmin = idAdmin;
		   this.nombreAdmin = nombreAdmin;
		   this.usuario = usuario;
		   this.password = password;
	   }

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int idAdmin;

	   @Column
	   private String nombreAdmin;

	   @Column
	   private String usuario;

	   @Column
	   private String password;

	   @Column
	   private String tipoUsuario;
	   
	   public String getNombreAdmin() {
		   return nombreAdmin;
	   }

	   public void setNombreAdmin(String nombreAdmin) {
		   this.nombreAdmin = nombreAdmin;
	   }

	   public String getUsuario() {
			return usuario;
	   }

	   public void setUsuario(String usuario) {
		   this.usuario = usuario;
	   }

	   public String getPassword() {
		   return password;
	   }

	   public void setPassword(String password) {
		   this.password = password;
	   }

	   public int getIdAdmin() {
		   return idAdmin;
	   }
	   
	   public void setIdAdmin(int idAdmin) {
		   	this.idAdmin = idAdmin;
	   }
	   
	   
	   
}
