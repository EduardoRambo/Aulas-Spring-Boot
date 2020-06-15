package rambo.eduardo.exemploescopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Eduardo Rambo Lima
 */
//Lombok
@Getter @Setter

//Spring
@Component
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;

}
