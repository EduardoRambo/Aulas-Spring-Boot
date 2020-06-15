package rambo.eduardo.exemploinjecaodedependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rambo.eduardo.exemploinjecaodedependencia.interfaces.AnimalInterface;


@Component
public class Pet {

    @Autowired
    private AnimalInterface animalInterface;


    public void execute() {
        animalInterface.comunicar();
    }
}
