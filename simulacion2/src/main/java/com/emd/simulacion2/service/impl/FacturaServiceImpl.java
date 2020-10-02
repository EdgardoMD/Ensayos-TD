package com.emd.simulacion2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emd.simulacion2.dto.FacturaDTO;
import com.emd.simulacion2.model.DetalleFactura;
import com.emd.simulacion2.model.Factura;
import com.emd.simulacion2.repo.IFacturaRepo;
import com.emd.simulacion2.service.IFacturaService;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Override
	public FacturaDTO generarDetallePorIdFactura(Integer id) {
		
		Factura factura = facturaRepo.getOne(id);
		
		FacturaDTO facturaDto = new FacturaDTO();
		
		Double subTotal=0.00;
		Double impuesto = 0.00;
		Integer total = 0;
		
		
		for(DetalleFactura detalle : factura.getDetallesFactura()) {
			subTotal += (detalle.getProducto().getValor() * detalle.getCantidad());
		}
		
		impuesto = subTotal *19/100;
		
		total = (int) (Math.round(subTotal + impuesto));
		
		facturaDto.setFacturaId(factura.getFacturaId());
		facturaDto.setNombreCliente(factura.getCliente());
		facturaDto.setFecha(factura.getFecha());
		facturaDto.setDetallesFactura(factura.getDetallesFactura());
		facturaDto.setSubtotal(subTotal);
		facturaDto.setImpuesto(impuesto);
		facturaDto.setTotal(total);
		
		return facturaDto;
	}

}


