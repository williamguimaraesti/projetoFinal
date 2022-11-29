package hamburgueria.lanches.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hamburgueria.lanches.model.ClientModel;


@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {
    
}