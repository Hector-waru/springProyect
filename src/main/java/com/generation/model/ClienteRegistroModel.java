package com.generation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Model en primer lugar
@Entity
@Table(name = "cliente_registro")
public class ClienteRegistroModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	@Column(unique=true, nullable=false)
	private String correo;
	private String nombre;
	@Column(nullable=false, length=18)
	private String contrasenia;
	//getters and setters
	//las realciones sean las que sean habra que colocarlas ejemplo
	//@OnToMany(mappedBY = "cliente") <--aqui especifica de cliente  
	//pivate List<Carrito> carrito; el tipo de dato es un list de carrito <--hacemos referencia al carrito
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}
