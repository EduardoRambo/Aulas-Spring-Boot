package rambo.eduardo.exemploapih2emmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rambo.eduardo.exemploapih2emmysql.repository.ClientRepository;

@Service
public class ClientDeleteService {

    @Autowired
    private ClientRepository clientRepository;


    public void delete(long id) {
        this.clientRepository.deleteById(id);
    }
}
