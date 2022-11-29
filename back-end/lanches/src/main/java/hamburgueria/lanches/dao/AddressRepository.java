package hamburgueria.lanches.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hamburgueria.lanches.model.AddressModel;


@Repository
public interface AddressRepository extends JpaRepository<AddressModel, Long>{
    
}