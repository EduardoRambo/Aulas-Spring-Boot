package rambo.eduardo.exemplolombok.model;

import lombok.*;

/**
 * @author Eduardo Rambo Lima
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /*
     *@Return
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}
