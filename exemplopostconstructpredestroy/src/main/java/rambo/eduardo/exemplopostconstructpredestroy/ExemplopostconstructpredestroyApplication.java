package rambo.eduardo.exemplopostconstructpredestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import rambo.eduardo.exemplopostconstructpredestroy.dao.ClientDAO;
import rambo.eduardo.exemplopostconstructpredestroy.model.Client;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Eduardo","Rambo"));

		System.out.println("ClientDao " +clientDAO);

	}
}
