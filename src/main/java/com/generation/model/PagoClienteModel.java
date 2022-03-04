package com.generation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pago_cliente")
public class PagoClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer pagoId;
	private Integer numeroDeTarjeta;
	@Column(nullable=false)
	private String nombreTarjeta;
	private String vencimiento;
	@Column(nullable=false, length=3)
	private Integer cvv;
	
	//getterse and setters
	public Integer getPagoId() {
		return pagoId;
	}
	public void setPagoId(Integer pagoId) {
		this.pagoId = pagoId;
	}
	public Integer getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}
	public void setNumeroDeTarjeta(Integer numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}
	public String getNombreTarjeta() {
		return nombreTarjeta;
	}
	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	
}
