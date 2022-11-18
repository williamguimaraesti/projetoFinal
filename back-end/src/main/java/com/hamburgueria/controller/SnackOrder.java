package com.hamburgueria.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamburgueria.dao.SnackOrderRepository;

@RestController
@RequestMapping({"/snackOrder"})
public class SnackOrder {
    
    @Autowired
	private SnackOrderRepository repository;

	@GetMapping
	public List<com.hamburgueria.model.SnackOrder> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<com.hamburgueria.model.SnackOrder> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public SnackOrder create(@RequestBody SnackOrder  snackOrder){
		return repository.save(snackOrder);
	}

	@PutMapping
	public SnackOrder update(@RequestBody SnackOrder snackOrder){
		return repository.save(snackOrder);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
}
