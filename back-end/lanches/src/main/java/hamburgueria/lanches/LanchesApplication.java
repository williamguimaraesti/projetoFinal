package hamburgueria.lanches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LanchesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanchesApplication.class, args);
		System.out.println("Funciona.");
	}
}