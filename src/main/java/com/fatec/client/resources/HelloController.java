package com.fatec.client.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // permite a classe gerar um end-point

public class HelloController {

    @GetMapping("hello") //nome do endpoint 
    public String hello(){
        return "Meu primeiro endpoint em java!!!!";
    }
}
