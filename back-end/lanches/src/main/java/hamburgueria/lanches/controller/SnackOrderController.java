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

import hamburgueria.lanches.dao.SnackOrderRepository;
import hamburgueria.lanches.model.SnackOrderModel;


@RestController
@RequestMapping("/snackOrder")
public class SnackOrderController {
    
    @Autowired
	private SnackOrderRepository repository;

	@GetMapping
	public List<SnackOrderModel> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<SnackOrderModel> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public com.hamburgueria.lanches.controller.SnackOrderController create(@RequestBody SnackOrderController  snackOrder){
		return repository.save(snackOrder);
	}

	@PutMapping
	public com.hamburgueria.lanches.controller.SnackOrderController update(@RequestBody SnackOrderController snackOrder){
		return repository.save(snackOrder);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
}
