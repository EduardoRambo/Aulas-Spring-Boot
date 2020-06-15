package rambo.eduardo.exemploinjecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}
}
