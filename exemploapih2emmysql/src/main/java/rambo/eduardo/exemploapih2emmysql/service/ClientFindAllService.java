package rambo.eduardo.exemploapih2emmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rambo.eduardo.exemploapih2emmysql.model.ClientEntity;
import rambo.eduardo.exemploapih2emmysql.repository.ClientRepository;

import java.util.List;

//Springboot
@Service
public class ClientFindAllService {
    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> findAll() {
        return (List<ClientEntity>) this.clientRepository.findAll();

    }
}
