package rambo.eduardo.exemploinjecaodedependencia.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import rambo.eduardo.exemploinjecaodedependencia.interfaces.AnimalInterface;

/**
 * @author Eduardo Rambo Lima
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Au auuu!");
    }
}
