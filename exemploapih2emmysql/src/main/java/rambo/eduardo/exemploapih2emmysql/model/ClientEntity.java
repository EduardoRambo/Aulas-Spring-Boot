package rambo.eduardo.exemploapih2emmysql.model;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/*
 *@author eduardo-rambo
 *@version 1.0
 */

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//Springboot
@Component

//JPA
@Entity
@Table(name = "cliente")

public class ClientEntity {

    //JPA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;

    //JPA
    @Column(name = "nome")
    @NotBlank(message = "Não pode nome null")
    private String name;

    //JPA
    @Column(name = "renda")
    @NotNull(message = "Não pode renda em branco")
    private double income;

}
