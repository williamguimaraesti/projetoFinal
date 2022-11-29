package hamburgueria.lanches.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hamburgueria.lanches.controller.SnackOrderController;
import hamburgueria.lanches.model.SnackOrderModel;



@Repository
public interface SnackOrderRepository extends JpaRepository<SnackOrderModel, Long>{

    com.hamburgueria.lanches.controller.SnackOrderController save(SnackOrderController snackOrder);

}