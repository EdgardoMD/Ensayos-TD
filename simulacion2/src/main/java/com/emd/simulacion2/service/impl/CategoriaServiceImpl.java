package com.emd.simulacion2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emd.simulacion2.model.Categoria;
import com.emd.simulacion2.repo.ICategoriaRepo;
import com.emd.simulacion2.service.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
	
	@Autowired
	ICategoriaRepo categoriaRepo;

	@Override
	public List<Categoria> listarCategorias() {
		
		return categoriaRepo.findAll();
	}

	@Override
	public Categoria listarCategoriaPorId(Integer categoriaId) {
		
		Optional<Categoria> categoria = categoriaRepo.findById(categoriaId);
		if (categoria.isPresent()) {
			return categoria.get();
		}else {
		return null;
		}
	}
}
