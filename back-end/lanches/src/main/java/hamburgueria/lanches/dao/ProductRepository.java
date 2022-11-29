package hamburgueria.lanches.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hamburgueria.lanches.model.ProductModel;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    
}