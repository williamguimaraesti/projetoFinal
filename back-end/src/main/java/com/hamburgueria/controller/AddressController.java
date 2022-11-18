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

import com.hamburgueria.dao.AddressRepository;
import com.hamburgueria.model.Address;

@RestController
@RequestMapping({"address"})
public class AddressController {
    
    @Autowired
	private AddressRepository repository;

	@GetMapping
	public List<Address> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Address> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public Address create(@RequestBody Address address){
		return repository.save(address);
	}

	@PutMapping
	public Address update(@RequestBody Address address){
		return repository.save(address);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
}
