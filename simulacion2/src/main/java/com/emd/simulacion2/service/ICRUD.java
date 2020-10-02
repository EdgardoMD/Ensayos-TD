package com.emd.simulacion2.service;

import java.util.List;

public interface ICRUD<Entity, ID> {
	
	List<Entity> findAll();
	Entity findById(ID id);
	void save(Entity entity);
	void update(Entity entity);
	void deleteById(ID id);
}
