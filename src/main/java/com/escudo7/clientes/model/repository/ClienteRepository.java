package com.escudo7.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escudo7.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	

}
