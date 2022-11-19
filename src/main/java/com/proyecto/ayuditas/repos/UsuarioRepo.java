package com.proyecto.ayuditas.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.ayuditas.entidades.Clientes;

public interface UsuarioRepo extends JpaRepository<Clientes, Integer>{

}
