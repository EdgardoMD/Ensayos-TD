package com.emd.simulacion2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.emd.simulacion2.dto.FacturaDTO;
import com.emd.simulacion2.service.IFacturaService;


@Controller
public class FacturaController {
	
	@Autowired
	private IFacturaService service;
	
	@GetMapping("/")
	public String inicio() {
		return "inicio";	}
	
	@GetMapping("/ver")
	public String detalleFactura(@RequestParam Integer id, Model model) {
		
		FacturaDTO consulta = service.generarDetallePorIdFactura(id);
		model.addAttribute("factura", consulta);
		System.out.println(consulta);
		return "detalleFactura";
		
	}

}
