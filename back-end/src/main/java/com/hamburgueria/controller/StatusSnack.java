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

import com.hamburgueria.dao.StatusSnackRepository;

@RestController
@RequestMapping({"/statusSnack"})
public class StatusSnack {
    
    @Autowired
	private StatusSnackRepository repository;

	@GetMapping
	public List<com.hamburgueria.model.StatusSnack> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<com.hamburgueria.model.StatusSnack> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public StatusSnack create(@RequestBody StatusSnack statusSnack){
		return repository.save(statusSnack);
	}

	@PutMapping
	public StatusSnack update(@RequestBody StatusSnack statusSnack){
		return repository.save(statusSnack);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
}
