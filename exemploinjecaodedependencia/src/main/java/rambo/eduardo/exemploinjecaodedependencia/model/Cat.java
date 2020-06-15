package rambo.eduardo.exemploinjecaodedependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rambo.eduardo.exemploinjecaodedependencia.interfaces.AnimalInterface;

/**
 * @author Eduardo Rambo Lima
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Miauuuu");
    }
}
