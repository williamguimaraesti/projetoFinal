package hamburgueria.lanches.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hamburgueria.lanches.dao.AddressRepository;
import hamburgueria.lanches.model.AddressModel;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
	private AddressRepository repository;

	@GetMapping
	public List<AddressModel> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<AddressModel> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public AddressModel create(@RequestBody AddressModel addressModel){
		return repository.save(addressModel);
	}

	@PutMapping
	public AddressModel update(@RequestBody AddressModel addressModel){
		return repository.save(addressModel);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
}