/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*

*/

package com.ejemplos.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.spring.model.Cliente;
import com.ejemplos.spring.model.Persona;
import com.ejemplos.spring.model.Proyecto;
import com.ejemplos.spring.service.ClienteService;
import com.ejemplos.spring.service.PersonaService;
import com.ejemplos.spring.service.ProyectoService;

@RestController
public class RESTController {

	@Autowired
	private ClienteService clienteService;
	@Autowired
	private ProyectoService proyectoService;
	@Autowired
	private PersonaService personaService;

	@GetMapping("/listarclientes") //lisar clientes
	public List<Cliente> getClientes() {
		return clienteService.findAll();
	}

	@PostMapping("/addproyecto") // localhost:5000/add
	public void addProyecto(@RequestBody Proyecto proyecto) {
		proyectoService.save(proyecto);
	}

	@GetMapping("/listarproyectos") //listar proyectos
	public List<Proyecto> getProyectos() {
		return proyectoService.findAll();
	}
	
	@DeleteMapping("/eliminarproyecto/{id}") //eliminar proyectos
	public void eliminarProyecto(@PathVariable("id")Integer idproyecto) {
		proyectoService.deleteById(idproyecto);
	}
	
	@GetMapping("/editarproyecto/{id}")
	public void editarProyecto(@PathVariable("id")Integer idproyecto) {
		proyectoService.findById(idproyecto);
	}

	@GetMapping("/equipo") // página del equipo
	public List<Persona> getEquipo() {
		return personaService.findAll();
	}

	@PostMapping("/addpersona") // crear nueva persona que forma aprte del equipo
	public void addPersona(@RequestBody Persona persona) {
		personaService.save(persona);
	}
	
	

}
