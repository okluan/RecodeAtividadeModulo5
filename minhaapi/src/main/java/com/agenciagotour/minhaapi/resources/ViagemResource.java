package com.agenciagotour.minhaapi.resources;

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

import com.agenciagotour.minhaapi.entities.Viagem;
import com.agenciagotour.minhaapi.servicies.ViagemService;

@RestController
@RequestMapping ("/viagens")
@CrossOrigin (origins = "http://localhost:3000/quemsomos")
public class ViagemResource {
	
	@Autowired
	private ViagemService service;
	
	@GetMapping
	public List <Viagem> findAll(){
		return service.findAll();
	}

	@PostMapping ("/")
	public ResponseEntity<Viagem> save(@RequestBody Viagem viagem){
	service.save(viagem);
	return ResponseEntity.ok().body(viagem);
	}
	
	@DeleteMapping ("/{Id}")
	public void delete(@PathVariable Long Id){
	service.deleteById(Id);
	}
	
}
