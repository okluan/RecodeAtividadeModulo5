package com.cadastro.cadastro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.cadastro.Service.ContatoServices;
import com.cadastro.cadastro.domain.Contato;

@RestController
@RequestMapping("/contatos")
@CrossOrigin (origins = "http://localhost:3000/")
public class ContatoResource {

	@Autowired
	private ContatoServices service;
	
	@PostMapping
	public Contato save(@RequestBody Contato obj){
	return service.save(obj);
	}
	
	@GetMapping
	public List <Contato> findAll(){
		return service.findAll();
	}

}
