package rambo.eduardo.exemploapih2emmysql.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *@author eduardo-rambo
 *@version 1.0
 */

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorldController {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>("Olá server", new HttpHeaders(), HttpStatus.CREATED);
    }
}
