package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Cargo;
import com.ejemplos.spring.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	CargoRepository repo;

	// metodo para listar cargos
	public List<Cargo> findAll() {
		return repo.findAll();
	}

}