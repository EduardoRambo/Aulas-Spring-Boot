package rambo.eduardo.exemplohelloworldrestrepositories.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 *@author Eduardo Rambo
 */
@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Olá! Hello world com rest repositories";
    }
}
