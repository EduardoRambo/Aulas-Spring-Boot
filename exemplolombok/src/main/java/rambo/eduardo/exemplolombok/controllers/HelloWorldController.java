package rambo.eduardo.exemplolombok.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rambo.eduardo.exemplolombok.model.Client;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo lombok";
    }

    @GetMapping("/product")
    public String getProduct() {
        return "Objeto produto";
    }

    @GetMapping("/client")
    public Client getClient() {

        //base de dados
        Client client = new Client();
        client.setName("Eduardo");
        client.setLastName("Lima");
        client.setAge(36);


        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Eduardo");
        client.setLastName("Lima");
        client.setAge(22);

        Client client1 = new Client();
        client1.setName("Nilo");
        client1.setLastName("Rodrigues");
        client1.setAge(28);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
