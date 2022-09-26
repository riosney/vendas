package com.escudo7.clientes.model.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column(nullable = false, length = 11)
	private String cpf;
	
	@Column
	private LocalDate dataCadastro;
	
}
