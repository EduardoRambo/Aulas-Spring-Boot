package rambo.eduardo.exemploapih2emmysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rambo.eduardo.exemploapih2emmysql.model.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
