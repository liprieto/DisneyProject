package com.disneyproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idGenero", unique = true, nullable = false)
	private long id;
	private String imagen;
	private String nombre;
	//falta relacion de tablas//
	
	//constructor vacio
	public Genero() {
		
	}
	
	//constructor&fields
	public Genero(long id, String imagen, String nombre) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
	}
	
	//getters&setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
