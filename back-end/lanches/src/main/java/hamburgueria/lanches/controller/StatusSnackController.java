package hamburgueria.lanches.controller;
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

import hamburgueria.lanches.dao.StatusSnackRepository;
import hamburgueria.lanches.model.StatusSnackModel;

@RestController
@RequestMapping("/statusSnack")
public class StatusSnackController {
    
    @Autowired
	private StatusSnackRepository repository;

	@GetMapping
	public List<StatusSnackModel> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<StatusSnackModel> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public com.hamburgueria.controller.StatusSnackController create(@RequestBody StatusSnackController statusSnack){
		return repository.save(statusSnack);
	}

	@PutMapping
	public com.hamburgueria.controller.StatusSnackController update(@RequestBody StatusSnackController statusSnack){
		return repository.save(statusSnack);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
}
