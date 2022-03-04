package com.generation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class ProductoModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(unique=true, nullable=false)
private Integer productoId;
@Column(columnDefinition="text")
private String descripcion;
@Column(nullable=false)
private double precio;

private Integer cantidad;
private String imagen;
private String categoria;

@ManyToOne

//getters and setters

public Integer getProductoId() {
	return productoId;
}
public void setProductoId(Integer productoid) {
	this.productoId = productoid;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public Integer getCantidad() {
	return cantidad;
}
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}
public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
}
