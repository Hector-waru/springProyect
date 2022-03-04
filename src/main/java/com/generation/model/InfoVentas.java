package com.generation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="info_ventas")
public class InfoVentas {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer ventaId;
	private Integer clienteId;
	private Integer direccionId;
	private Integer pagoId;
	@Column 
	private String fechaVenta;
	
	//Getters and Setters
	public Integer getVentaId() {
		return ventaId;
	}
	public void setVentaId(Integer ventaId) {
		this.ventaId = ventaId;
	}
	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	public Integer getDireccionId() {
		return direccionId;
	}
	public void setDireccionId(Integer direccionId) {
		this.direccionId = direccionId;
	}
	public Integer getPagoId() {
		return pagoId;
	}
	public void setPagoId(Integer pagoId) {
		this.pagoId = pagoId;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	
}
