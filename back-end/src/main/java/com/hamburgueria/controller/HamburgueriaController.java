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

import com.hamburgueria.dao.HamburgueriaRepository;
import com.hamburgueria.model.Burger;


@RestController
@RequestMapping({"api/hamburgueria"})
public class HamburgueriaController {

	@Autowired
	private HamburgueriaRepository repository;

	@GetMapping
	public List<Burger> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Burger> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public Burger create(@RequestBody Burger hamburguer){
		return repository.save(hamburguer);
	}

	@PutMapping
	public Burger update(@RequestBody Burger hamburguer){
		return repository.save(hamburguer);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}

}
