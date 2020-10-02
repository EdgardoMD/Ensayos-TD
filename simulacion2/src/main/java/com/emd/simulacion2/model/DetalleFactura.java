package com.emd.simulacion2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_FACTURA")
@IdClass(DetalleFacturaPK.class)
public class DetalleFactura {
	
	@Id
	private Factura factura;
	
	@Id
	private Producto producto;
	
	@Column(name = "cantidad")
	private Integer cantidad;

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	
}
