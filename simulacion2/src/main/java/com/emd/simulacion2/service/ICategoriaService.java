package com.emd.simulacion2.service;

import java.util.List;

import com.emd.simulacion2.model.Categoria;

public interface ICategoriaService {

	List<Categoria> listarCategorias();
	Categoria listarCategoriaPorId(Integer categoriaId);
}
