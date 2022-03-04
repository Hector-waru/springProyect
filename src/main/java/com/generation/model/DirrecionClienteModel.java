package com.generation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion_cliente")
public class DirrecionClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer dirreccionId;
	@Column(nullable=false, length = 9)
	private Integer codigoPostal;
	@Column(nullable=false)
	private String direccion;
	private String ciudad;
	private String estado;
	
	
	//getters and settters
	public Integer getDirreccionId() {
		return dirreccionId;
	}
	public void setDirreccionId(Integer dirreccionId) {
		this.dirreccionId = dirreccionId;
	}
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
