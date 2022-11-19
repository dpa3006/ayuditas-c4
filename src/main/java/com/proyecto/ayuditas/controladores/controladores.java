package com.proyecto.ayuditas.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.ayuditas.entidades.Clientes;
import com.proyecto.ayuditas.repos.UsuarioRepo;

@RestController
public class controladores {
	
	@Autowired
	UsuarioRepo repository;
	
	
	@RequestMapping(value="/clientes",method=RequestMethod.GET)
	public List<Clientes> getClientes(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/cliente/{id}",method=RequestMethod.GET)
	public Clientes getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
	
	@RequestMapping(value="/nuevoCliente",method=RequestMethod.POST)
	public Clientes createProduct(@RequestBody Clientes clientes) {
		return repository.save(clientes);
	}
	
	
	@RequestMapping(value="/cambioDatos",method=RequestMethod.PUT)
	public Clientes updateProduct(@RequestBody Clientes clientes) {
		return repository.save(clientes);
	}
	
	@RequestMapping(value="/eliminarCliente",method=RequestMethod.DELETE)
	public void deleteProduct(int id) {
		repository.deleteById(id);
	}
		

}
