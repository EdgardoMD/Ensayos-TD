package com.emd.simulacion2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emd.simulacion2.model.Categoria;
import com.emd.simulacion2.service.ICategoriaService;

@RestController
public class CategoriaRestController {
	
	@Autowired
	private ICategoriaService service;
	
	@GetMapping("/productos/{categoriaId}")
	public Categoria listarProductos(@PathVariable Integer categoriaId) {
		return service.listarCategoriaPorId(categoriaId);
	}
	

}
