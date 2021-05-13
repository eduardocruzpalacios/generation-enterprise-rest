/*

*13/05/2021

*@Author NextoMarket

*@Version 1.0

*

*/

package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Proyecto;
import com.ejemplos.spring.repository.ProyectoRepository;

@Service
public class ProyectoServiceImpl implements ProyectoService {

	@Autowired
	ProyectoRepository repo;

	// Metodo para listar
	@Override
	public List<Proyecto> findAll() {
		return repo.findAll();
	}

	@Override
	public Proyecto save(Proyecto p) {
		return repo.save(p);
	}

}
