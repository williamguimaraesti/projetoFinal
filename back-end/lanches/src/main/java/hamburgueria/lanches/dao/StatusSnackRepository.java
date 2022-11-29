package hamburgueria.lanches.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hamburgueria.lanches.controller.StatusSnackController;
import hamburgueria.lanches.model.StatusSnackModel;

@Repository
public interface StatusSnackRepository extends JpaRepository<StatusSnackModel, Long>{

    com.hamburgueria.lanches.controller.StatusSnackController save(StatusSnackController statusSnack);

}