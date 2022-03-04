package com.generation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pivote")
public class PivoteModel {
@Column 
private Integer productoId;
private Integer vantaPivote;
private Integer cantidadPivote;

@OneToMany(mappedBy = "producto_pivote")
private List<ProductoModel> productos;
//getters setters

public Integer getProductoId() {
	return productoId;
}
public List<ProductoModel> getProductos() {
	return productos;
}
public void setProductos(List<ProductoModel> productos) {
	this.productos = productos;
}
public void setProductoId(Integer productoId) {
	this.productoId = productoId;
}
public Integer getVantaPivote() {
	return vantaPivote;
}
public void setVantaPivote(Integer vantaPivote) {
	this.vantaPivote = vantaPivote;
}
public Integer getCantidadPivote() {
	return cantidadPivote;
}
public void setCantidadPivote(Integer cantidadPivote) {
	this.cantidadPivote = cantidadPivote;
}

}
