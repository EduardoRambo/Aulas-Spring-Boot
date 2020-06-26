package rambo.eduardo.exemploapih2emmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rambo.eduardo.exemploapih2emmysql.model.ClientEntity;
import rambo.eduardo.exemploapih2emmysql.repository.ClientRepository;

//Springboot
@Service
public class ClientFindByIdService {

        @Autowired
        private ClientRepository clientRepository;



        public ClientEntity findById(long id) {
            return this.clientRepository.findById(id).get();
        }
}


