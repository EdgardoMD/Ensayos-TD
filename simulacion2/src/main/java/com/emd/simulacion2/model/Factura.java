package com.emd.simulacion2.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FACTURA")
public class Factura implements Serializable{
	
	@Id
	private Integer facturaId;
	
	@Column(name = "cliente", nullable = false, length = 50)
	private String cliente;
	
	@Column(name = "fecha", nullable = false)
	private String fecha;
	
	@OneToMany(mappedBy = "factura", fetch = FetchType.EAGER)
	private List<DetalleFactura> detallesFactura;

	public Integer getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Integer facturaId) {
		this.facturaId = facturaId;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facturaId == null) ? 0 : facturaId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (facturaId == null) {
			if (other.facturaId != null)
				return false;
		} else if (!facturaId.equals(other.facturaId))
			return false;
		return true;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
