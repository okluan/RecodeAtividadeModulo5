package com.cadastro.cadastro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cadastro.cadastro.domain.Contato;
import com.cadastro.cadastro.repositories.ContatoRepository;

import java.util.List;

@Service
public class ContatoServices {

	@Autowired
	private ContatoRepository repository;
	
	
	public Contato save(Contato obj) {
		
		return repository.save(obj);
	}
	
	public List<Contato> findAll(){
		return repository.findAll();
	}
	
	public Contato update(Contato obj) {
		return repository.save(obj);
	}
	
	public Contato delete(Contato obj) {
		return repository.save(obj);
	}
}
