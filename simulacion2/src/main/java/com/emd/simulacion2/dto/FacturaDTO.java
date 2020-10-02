package com.emd.simulacion2.dto;

import java.util.List;

import com.emd.simulacion2.model.DetalleFactura;

public class FacturaDTO {
	
	private Integer facturaId;
	private String nombreCliente;
	private String fecha;
	private List<DetalleFactura> detallesFactura;
	private Double subtotal;
	private Double impuesto;
	private Integer total;

	public Integer getFacturaId() {
		return facturaId;
	}
	public void setFacturaId(Integer facturaId) {
		this.facturaId = facturaId;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public List<DetalleFactura> getDetallesFactura() {
		return detallesFactura;
	}
	public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
		this.detallesFactura = detallesFactura;
	}
	
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public FacturaDTO() {
	}

}
