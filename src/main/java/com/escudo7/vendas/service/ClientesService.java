package com.escudo7.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escudo7.vendas.model.Cliente;
import com.escudo7.vendas.repository.ClientesRepository;

@Service
public class ClientesService {
	
	private ClientesRepository repository;
	
	@Autowired
	public ClientesService(ClientesRepository repository) {
		this.repository = repository;
	}

	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		this.repository.persistir(cliente);
	}

	private void validarCliente(Cliente cliente) {
		// TODO Auto-generated method stub		
	}
	
}
