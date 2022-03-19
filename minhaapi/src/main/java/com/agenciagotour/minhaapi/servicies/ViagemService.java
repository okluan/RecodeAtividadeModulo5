package com.agenciagotour.minhaapi.servicies;



import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.agenciagotour.minhaapi.entities.Viagem;
import com.agenciagotour.minhaapi.repositories.ViagemRepository;

@Service
public class ViagemService {

	@Autowired
	private ViagemRepository repository;
	
	@Transactional(readOnly = true)
	public List <Viagem> findAll(){
		List <Viagem> resultado = repository.findAll();
		return resultado;}
	
	public void save(Viagem viagem) {
		repository.save(viagem);
	}
	
	public void deleteById( Long id) {
		repository.deleteById(id );
	}



	}


