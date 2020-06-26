package rambo.eduardo.exemploapih2emmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rambo.eduardo.exemploapih2emmysql.model.ClientEntity;
import rambo.eduardo.exemploapih2emmysql.repository.ClientRepository;

@Service
public class ClientSaveService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity save(ClientEntity clientEntity){

        return this.clientRepository.save(clientEntity);
    }
}
