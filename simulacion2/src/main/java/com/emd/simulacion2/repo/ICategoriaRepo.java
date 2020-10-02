package com.emd.simulacion2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emd.simulacion2.model.Categoria;

@Repository
public interface ICategoriaRepo extends JpaRepository<Categoria, Integer> {

}
