package com.emd.simulacion2.service;

import com.emd.simulacion2.dto.FacturaDTO;

public interface IFacturaService {
	
	FacturaDTO generarDetallePorIdFactura(Integer id);

}
