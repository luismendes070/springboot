package dio.digitalinnovationone.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloMessage(){

        return "Hello, Digital Innovation One!";

    } // end method

} // end class
