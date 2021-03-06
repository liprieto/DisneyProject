package com.disneyproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personajes")
public class Personajes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPersonajes", unique = true, nullable = false)
	private long id;
	private String imagen;
	private String nombre;
	private int edad;
	private long peso;
	private String historia;	
	//falta relacion de tablas//

	//constructor vacio
	public Personajes() {
		
	}
	
	//constructor&fields
	public Personajes(long id, String imagen, String nombre, int edad, long peso, String historia) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.historia = historia;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getPeso() {
		return peso;
	}
	public void setPeso(long peso) {
		this.peso = peso;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	
	
	
	
}





