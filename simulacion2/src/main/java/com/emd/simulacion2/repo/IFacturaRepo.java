package com.emd.simulacion2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emd.simulacion2.model.Factura;

@Repository
public interface IFacturaRepo extends JpaRepository<Factura, Integer> {

}
